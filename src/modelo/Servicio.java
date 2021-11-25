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
public class Servicio {

    private int id;
    private String descripcion;

    public Servicio(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
    }

    public Servicio() {
    }

    public Servicio(int id) {
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

    public void guardar(int id_servicio, int id_alojamiento) throws FileNotFoundException {

        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO servicios_elegidos"
                    + " VALUES (?,?)");
            pst.setInt(1, id_servicio);//
            pst.setInt(2, id_alojamiento);//

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int buscarId() {

        Servicio servicio = new Servicio();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM servicios WHERE descripcion = " + "'" + this.descripcion + "'");

            if (rs.next()) {
                servicio.setId(rs.getInt("id"));
                servicio.setDescripcion(rs.getString("descripcion"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Servicio.class.getName()).log(Level.SEVERE, null, ex);
        }

        return servicio.getId();
    }

    public ResultSet getServiciosElegidos(int id) {
        ResultSet datos = null;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT servicios.descripcion as 'descripcion' from servicios_elegidos, servicios,alojamientos where servicios_elegidos.id_servicio = servicios.id and servicios_elegidos.id_alojamiento ="+id);
            
            datos = rs;

        } catch (SQLException ex) {
            Logger.getLogger(TipoAlojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;

    }

}
