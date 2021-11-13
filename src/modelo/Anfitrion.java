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
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Parra
 */
//lugarResidencia-, Idiomas-, biografia-, foto.
public class Anfitrion {
    private String correo;
    private String nombre;
    private String apellido;
    private String telefono;
    private String fechaNacimiento;
    private String lugarResidencia;
    private String idiomas;
    private String biografia;
    private String foto;
    private String password;
    

    public Anfitrion(String correo, String nombre, String apellido, String telefono, String fechaNacimiento, String lugarResidencia, String idiomas, String biografia,String foto, String password) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarResidencia = lugarResidencia;
        this.idiomas = idiomas;
        this.biografia = biografia;
        this.foto = foto;
        this.password = password;
        
    }

    public Anfitrion() {
    }

    public Anfitrion(String correo) {
        this.correo = correo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(String idiomas) {
        this.idiomas = idiomas;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void guardar() throws FileNotFoundException {
  
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO anfitriones VALUES (?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, this.correo);
            pst.setString(2, this.nombre);
            pst.setString(3, this.apellido);
            pst.setString(4, this.telefono);
            pst.setString(5, this.fechaNacimiento);
            pst.setString(6, this.lugarResidencia);
            pst.setString(7, this.idiomas);
            pst.setString(8, this.biografia);
            FileInputStream archivoFoto = new FileInputStream(this.foto);
            pst.setBinaryStream(9, archivoFoto);
            
            pst.setString(10,this.foto);
            
            pst.setString(11, this.password);
            

            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    public Anfitrion buscar() {

        Anfitrion anfi = new Anfitrion();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM anfitriones WHERE correo = " + "'"+this.correo+"'");

            if (rs.next()) {
                anfi.setCorreo(rs.getString("correo"));
                anfi.setNombre(rs.getString("nombre"));
                anfi.setApellido(rs.getString("apellido"));
                anfi.setTelefono(rs.getString("telefono"));
                anfi.setFechaNacimiento(rs.getString("fechaNacimiento"));
                anfi.setLugarResidencia(rs.getString("lugarResidencia"));
                anfi.setIdiomas(rs.getString("idiomas"));
                anfi.setBiografia(rs.getString("biografia"));
                anfi.setFoto(rs.getString("ruta_foto"));
                anfi.setPassword(rs.getString("password"));
              
            }
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return anfi;
    }

    
    
}
