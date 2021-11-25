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
//zona
public class Direccion {
    private int id;
    private String principal;
    private String complemento;
    private String ciudad;
    private String departamento;
    private String pais;

    public Direccion(int id, String principal, String complemento, String ciudad, String departamento, String pais) {
        this.id = id;
        this.principal = principal;
        this.complemento = complemento;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.pais = pais;
    }

    public Direccion() {
    }

    public Direccion(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        this.principal = principal;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
    
    public void guardar() throws FileNotFoundException {
  
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO direcciones VALUES (null,?,?,?,?,?)");
            pst.setString(1, this.principal);
            pst.setString(2, this.complemento);
            pst.setString(3, this.ciudad);
            pst.setString(4, this.departamento);
            pst.setString(5, this.pais);
           

            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Direccion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
      public int getLastId(){
        int lastId=0;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(id) as lastId FROM direcciones ");
             
            if(rs.next()){
                lastId=rs.getInt("lastId");
            }
                
                
            
        } catch (SQLException ex) {
            Logger.getLogger(Direccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return lastId;
    }
      public String buscarCiudad() {

        Direccion direc = new Direccion();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM direcciones WHERE id = " +this.id);

            if (rs.next()) {
                direc.setId(rs.getInt("id"));
                direc.setCiudad(rs.getString("ciudad"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Direccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return direc.getCiudad();
    }
      
      public int buscarId() {

        Direccion direc = new Direccion();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM direcciones WHERE ciudad = " + "'"+this.ciudad+"'");

            if (rs.next()) {
                direc.setId(rs.getInt("id"));
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Direccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return direc.getId();
    }
      public Direccion buscar() {

        Direccion direc = new Direccion();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM direcciones WHERE id =" +this.id);

            if (rs.next()) {
                direc.setId(rs.getInt(1));
                direc.setPrincipal(rs.getString(2));
                direc.setComplemento(rs.getString(3));
                direc.setCiudad(rs.getString(4));
                direc.setDepartamento(rs.getString(5));
                direc.setPais(rs.getString(6));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(Direccion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return direc;
    }
    public ResultSet get(){
       ResultSet datos=null;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT DISTINCT ciudad FROM  direcciones");
            
            datos=rs;
         
                
                
            
        } catch (SQLException ex) {
            Logger.getLogger(TipoAlojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return datos;
       
    }
    
}
