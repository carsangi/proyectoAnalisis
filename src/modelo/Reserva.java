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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santiago Parra
 */
//huesped, id, anfitrion, alojamiento, fechaEntrada, fechaSalida
public class Reserva {
    private int id;
    private String huesped;
    private int alojamiento;
    private String fechaEntrada;
    private String fechaSalida;

    public Reserva(int id, String huesped, int alojamiento, String fechaEntrada, String fechaSalida) {
        this.id = id;
        this.huesped = huesped;
        this.alojamiento = alojamiento;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }

    public Reserva() {
    }

    public Reserva(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHuesped() {
        return huesped;
    }

    public void setHuesped(String huesped) {
        this.huesped = huesped;
    }

    public int getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(int alojamiento) {
        this.alojamiento = alojamiento;
    }

    public String getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(String fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public String getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }
    
     public void guardar() throws FileNotFoundException {
  
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO reservas VALUES (null,?,?,?,?)");
            pst.setString(1, this.huesped);
            pst.setInt(2, this.alojamiento);
            pst.setString(3, this.fechaEntrada);
            pst.setString(4, this.fechaSalida);
            
           

            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
      public DefaultTableModel listarTodo() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(0);
        modelo.addColumn("Id");
        modelo.addColumn("Correo Huesped");
        modelo.addColumn("Correo Alojamiento");
        modelo.addColumn("Fecha Inicio");
        modelo.addColumn("Fecha Fin");
       
        

        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM reservas");

            while (rs.next()) {
                

                String[] fila = new String[5];
                fila[0] = rs.getString("id");
                fila[1] = rs.getString("huesped");
                fila[2] = rs.getString("alojamiento");
                fila[3] = rs.getString("fechaInicio");
                fila[4] = rs.getString("fechaFin");
               

                modelo.addRow(fila);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Reserva.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }
}
