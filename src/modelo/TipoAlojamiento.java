/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
    
}
