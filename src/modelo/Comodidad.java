/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Parra
 */
public class Comodidad {
    private int id;
    private String descripcion;

    public Comodidad(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Comodidad() {
    }

    public Comodidad(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int buscarId() {

        Comodidad comodidad = new Comodidad();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM comodidades WHERE descripcion = " + "'"+this.descripcion+"'");

            if (rs.next()) {
                comodidad.setId(rs.getInt("id"));
                comodidad.setDescripcion(rs.getString("descripcion"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Comodidad.class.getName()).log(Level.SEVERE, null, ex);
        }

        return comodidad.getId();
    }
    public void guardar(int id_comodidad,int id_alojamiento) throws FileNotFoundException {
  
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO comidades_elegidas"
                    + " VALUES (?,?)");
            pst.setInt(1, id_comodidad);//
            pst.setInt(2, id_alojamiento);//
           
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Comodidad.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public ResultSet getComodidadesElegidas(int id) {
        ResultSet datos = null;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT comodidades.descripcion as 'descripcion' from comidades_elegidas, comodidades,alojamientos where comidades_elegidas.id_comodidad = comodidades.id and comidades_elegidas.id_alojamiento ="+id);
            
            datos = rs;

        } catch (SQLException ex) {
            Logger.getLogger(TipoAlojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;

    }
}
