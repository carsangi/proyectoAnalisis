/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Parra
 */
/*lugarResidencia, biografia, foto, identificacion o pasaporte, estrato, nivel de estudios, estado civil, genero.
No. Tarjeta Credito*/
public class Huesped {
    private String correo;//
    private String nombre;//
    private String apellido;//
    private String telefono;//
    private String fechaNacimiento;//
    private String lugarResidencia;//   
    private String biografia;//
    private String foto;//
    private String identificacion;//
    private int estrato;
    private String nivelEstudio;
    private String estadoCivil;
    private String genero;
    private String NoTarjetaCredito;
    
    
    
    private String password;//

    public Huesped(String correo, String nombre, String apellido, String telefono, String fechaNacimiento, String lugarResidencia, String biografia, String foto, String identificacion, int estrato, String nivelEstudio, String estadoCivil, String genero, String NoTarjetaCredito, String password) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarResidencia = lugarResidencia;
        this.biografia = biografia;
        this.foto = foto;
        this.identificacion = identificacion;
        this.estrato = estrato;
        this.nivelEstudio = nivelEstudio;
        this.estadoCivil = estadoCivil;
        this.genero = genero;
        this.NoTarjetaCredito = NoTarjetaCredito;
        this.password = password;
    }

    

    public Huesped() {
    }

    public Huesped(String correo) {
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

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
    

    public String getLugarResidencia() {
        return lugarResidencia;
    }

    public void setLugarResidencia(String lugarResidencia) {
        this.lugarResidencia = lugarResidencia;
    }

    public String getBiografia() {
        return biografia;
    }

    public void setBiografia(String biografia) {
        this.biografia = biografia;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public int getEstrato() {
        return estrato;
    }

    public void setEstrato(int estrato) {
        this.estrato = estrato;
    }

    public String getNivelEstudio() {
        return nivelEstudio;
    }

    public void setNivelEstudio(String nivelEstudio) {
        this.nivelEstudio = nivelEstudio;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNoTarjetaCredito() {
        return NoTarjetaCredito;
    }

    public void setNoTarjetaCredito(String NoTarjetaCredito) {
        this.NoTarjetaCredito = NoTarjetaCredito;
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

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO huespedes VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, this.correo);
            pst.setString(2, this.nombre);
            pst.setString(3, this.apellido);
            pst.setString(4, this.telefono);
            pst.setString(5, this.fechaNacimiento);
            pst.setString(6, this.lugarResidencia);
            pst.setString(7, this.biografia);
            pst.setString(8, this.foto);
            
            pst.setString(9, this.identificacion);
            
            pst.setInt(10,this.estrato);
            
            pst.setString(11, this.nivelEstudio);
            pst.setString(12, this.estadoCivil);
            pst.setString(13, this.genero);
            pst.setString(14, this.NoTarjetaCredito);
            

            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
