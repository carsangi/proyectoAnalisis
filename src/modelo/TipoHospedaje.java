/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Parra
 */
public class TipoHospedaje {
    private int id;
    private String descripcion;

    public TipoHospedaje(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public TipoHospedaje() {
    }

    public TipoHospedaje(int id) {
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

        TipoHospedaje tipo = new TipoHospedaje();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipo_hospedaje WHERE descripcion = " + "'"+this.descripcion+"'");

            if (rs.next()) {
                tipo.setId(rs.getInt("id"));
                tipo.setDescripcion(rs.getString("descripcion"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return tipo.getId();
    }
     public ResultSet get(){
       ResultSet datos=null;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM  tipo_hospedaje");
            
            datos=rs;
         
                
                
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoHospedaje.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
       
    }
      public TipoHospedaje buscar() {

        TipoHospedaje th = new TipoHospedaje();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tipo_hospedaje WHERE id =" +this.id);

            if (rs.next()) {
                th.setId(rs.getInt(1));
                th.setDescripcion(rs.getString(2));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoHospedaje.class.getName()).log(Level.SEVERE, null, ex);
        }

        return th;
    }
    
}
