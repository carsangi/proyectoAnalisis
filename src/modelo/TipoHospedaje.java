/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
    
    
}
