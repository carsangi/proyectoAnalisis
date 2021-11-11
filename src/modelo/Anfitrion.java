/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;

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
    //private String foto;
    private String password;
    private ArrayList<Alojamiento> listaAlojamientos;

    public Anfitrion(String correo, String nombre, String apellido, String telefono, String fechaNacimiento, String lugarResidencia, String idiomas, String biografia, String password, ArrayList<Alojamiento> listaAlojamientos) {
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarResidencia = lugarResidencia;
        this.idiomas = idiomas;
        this.biografia = biografia;
        this.password = password;
        this.listaAlojamientos = listaAlojamientos;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Alojamiento> getListaAlojamientos() {
        return listaAlojamientos;
    }

    public void setListaAlojamientos(ArrayList<Alojamiento> listaAlojamientos) {
        this.listaAlojamientos = listaAlojamientos;
    }

    
    
}
