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
//cantPersonas-, accesibilidad-, cantHabitaciones-, cantCamas-, cantBaños-, fotos, opiniones-, tipoHospedaje
public class Alojamiento {
    private int id;
    private int tipo;
    private String descripcion;
    private Direccion direccion;
    private int cantidadPersonas;
    private int cantidadHabitaciones;
    private int cantidadCamas;
    private int cantidadBanios;
    private String accessibilidad;
    private ArrayList<Opinion> listaOpiniones;
    private ArrayList<Servicio> listaServicios;
    private String baño;
    private ArrayList<Comodidad> listaComodidades;
    private String titulo;
    private ArrayList<Aspecto> listaAspectos; 
    private double precio;
    private ArrayList<Regla> listaReglas;

    public Alojamiento(int id, int tipo, String descripcion, Direccion direccion, ArrayList<Servicio> listaServicios, String baño, ArrayList<Comodidad> listaComodidades, String titulo, ArrayList<Aspecto> listaAspectos, double precio, ArrayList<Regla> listaReglas) {
        this.id = id;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.listaServicios = listaServicios;
        this.baño = baño;
        this.listaComodidades = listaComodidades;
        this.titulo = titulo;
        this.listaAspectos = listaAspectos;
        this.precio = precio;
        this.listaReglas = listaReglas;
    }

    

    public Alojamiento() {
    }

    public Alojamiento(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Servicio> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<Servicio> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public String getBaño() {
        return baño;
    }

    public void setBaño(String baño) {
        this.baño = baño;
    }

    public ArrayList<Comodidad> getListaComodidades() {
        return listaComodidades;
    }

    public void setListaComodidades(ArrayList<Comodidad> listaComodidades) {
        this.listaComodidades = listaComodidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Aspecto> getListaAspectos() {
        return listaAspectos;
    }

    public void setListaAspectos(ArrayList<Aspecto> listaAspectos) {
        this.listaAspectos = listaAspectos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Regla> getListaReglas() {
        return listaReglas;
    }

    public void setListaReglas(ArrayList<Regla> listaReglas) {
        this.listaReglas = listaReglas;
    }
    
    
    
    
}
