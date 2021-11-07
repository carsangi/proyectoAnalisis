/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

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
    
    
    
    
}
