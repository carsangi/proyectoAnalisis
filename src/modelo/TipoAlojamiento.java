/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileInputStream;
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
public class TipoAlojamiento {
    private int id;
    private String descripcion;

    public TipoAlojamiento(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public TipoAlojamiento(int id) {
        this.id = id;
    }

    public TipoAlojamiento() {
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
    
    public void guardar() throws FileNotFoundException {
  
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO tipos_alojamiento VALUES (null,?)");
            pst.setString(1, this.descripcion);
            

            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public ResultSet get(){
       ResultSet datos=null;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  tipos_alojamiento");
            
            datos=rs;
         
                
                
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoAlojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
       
    }
    
     public TipoAlojamiento buscarId() {

        TipoAlojamiento tipo = new TipoAlojamiento();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipos_alojamiento WHERE descripcion = " + "'"+this.descripcion+"'");

            if (rs.next()) {
                tipo.setId(rs.getInt("id"));
                tipo.setDescripcion(rs.getString("descripcion"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tipo;
    }
    public TipoAlojamiento buscar() {

        TipoAlojamiento tipo = new TipoAlojamiento();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipos_alojamiento WHERE id = " +this.id);

            if (rs.next()) {
                tipo.setId(rs.getInt("id"));
                tipo.setDescripcion(rs.getString("descripcion"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tipo;
    }
}
