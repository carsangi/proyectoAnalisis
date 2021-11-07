/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Santiago Parra
 */
public class Regla {
    private int id;
    private String Regla;
    private boolean permite;

    public Regla(int id, String Regla, boolean permite) {
        this.id = id;
        this.Regla = Regla;
        this.permite = permite;
    }

    public Regla() {
    }

    public Regla(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRegla() {
        return Regla;
    }

    public void setRegla(String Regla) {
        this.Regla = Regla;
    }

    public boolean isPermite() {
        return permite;
    }

    public void setPermite(boolean permite) {
        this.permite = permite;
    }
    
    
}
