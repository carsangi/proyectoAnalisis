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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Santiago Parra
 */
public class Alojamiento {

    private int id;   //
    private String anfi;//
    private int tipo;//
    private String descripcion;//
    private int direccion;//
    private int cantidadPersonas;//
    private int cantidadHabitaciones;//
    private int cantidadCamas;//
    private int cantidadBanios;//
    private ArrayList<String> fotos;//
    private String accessibilidad;
    private ArrayList<Opinion> listaOpiniones;
    private ArrayList<String> listaServicios;//
    private String bano;//
    private ArrayList<String> listaComodidades;//
    private String titulo;

    private double precio;

    private int tipoHospedaje;

    public Alojamiento(int id, String anfi, int tipo, String descripcion, int direccion, int cantidadPersonas,
            int cantidadHabitaciones, int cantidadCamas, int cantidadBanios, ArrayList<String> fotos, String accessibilidad, ArrayList<Opinion> listaOpiniones, ArrayList<String> listaServicios, String bano,
            ArrayList<String> listaComodidades, String titulo,
            double precio, int tipoHospedaje) {

        this.id = id;
        this.anfi = anfi;
        this.tipo = tipo;
        this.descripcion = descripcion;
        this.direccion = direccion;
        this.cantidadPersonas = cantidadPersonas;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.cantidadCamas = cantidadCamas;
        this.cantidadBanios = cantidadBanios;
        this.fotos = fotos;
        this.accessibilidad = accessibilidad;
        this.listaOpiniones = listaOpiniones;
        this.listaServicios = listaServicios;
        this.bano = bano;
        this.listaComodidades = listaComodidades;
        this.titulo = titulo;

        this.precio = precio;

        this.tipoHospedaje = tipoHospedaje;
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

    public String getAnfi() {
        return anfi;
    }

    public void setAnfi(String anfi) {
        this.anfi = anfi;
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

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public int getCantidadCamas() {
        return cantidadCamas;
    }

    public void setCantidadCamas(int cantidadCamas) {
        this.cantidadCamas = cantidadCamas;
    }

    public int getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(int cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public ArrayList<String> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<String> fotos) {
        this.fotos = fotos;
    }

    public String getAccessibilidad() {
        return accessibilidad;
    }

    public void setAccessibilidad(String accessibilidad) {
        this.accessibilidad = accessibilidad;
    }

    public ArrayList<Opinion> getListaOpiniones() {
        return listaOpiniones;
    }

    public void setListaOpiniones(ArrayList<Opinion> listaOpiniones) {
        this.listaOpiniones = listaOpiniones;
    }

    public ArrayList<String> getListaServicios() {
        return listaServicios;
    }

    public void setListaServicios(ArrayList<String> listaServicios) {
        this.listaServicios = listaServicios;
    }

    public String getBano() {
        return bano;
    }

    public void setBano(String bano) {
        this.bano = bano;
    }

    public ArrayList<String> getListaComodidades() {
        return listaComodidades;
    }

    public void setListaComodidades(ArrayList<String> listaComodidades) {
        this.listaComodidades = listaComodidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTipoHospedaje() {
        return tipoHospedaje;
    }

    public void setTipoHospedaje(int tipoHospedaje) {
        this.tipoHospedaje = tipoHospedaje;
    }

    public void guardar() throws FileNotFoundException {

        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();

            PreparedStatement pst = (PreparedStatement) cnx.prepareStatement("INSERT INTO alojamientos VALUES (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, this.anfi);//
            pst.setInt(2, this.tipo);//
            pst.setString(3, this.descripcion);//
            pst.setInt(4, this.direccion);//
            pst.setInt(5, this.cantidadPersonas);//
            pst.setInt(6, this.cantidadHabitaciones);//
            pst.setInt(7, this.cantidadCamas);//
            pst.setInt(8, this.cantidadBanios);//
            pst.setString(9, this.fotos.get(0));//
            pst.setString(10, this.fotos.get(1));//
            pst.setString(11, this.fotos.get(2));//
            pst.setString(12, this.fotos.get(3));//
            pst.setString(13, this.accessibilidad);//
            pst.setString(14, this.bano);//
            pst.setString(15, this.titulo);//
            pst.setDouble(16, this.precio);//
            pst.setInt(17, this.tipoHospedaje);//

            pst.executeUpdate();

        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public int getLastId() {
        int lastId = 0;
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT MAX(id) as lastId FROM alojamientos ");

            if (rs.next()) {
                lastId = rs.getInt("lastId");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }

        return lastId;
    }

    public Alojamiento buscar() {

        Alojamiento alojamiento = new Alojamiento();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos WHERE correo = " + "'" + this.anfi + "'");

            if (rs.next()) {
                alojamiento.setId(rs.getInt("id"));
                alojamiento.setAnfi(rs.getString("anfitrion"));
                alojamiento.setTipo(rs.getInt("tipo"));
                alojamiento.setDescripcion(rs.getString("descripcion"));
                alojamiento.setDireccion(rs.getInt("direccion"));
                alojamiento.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                alojamiento.setCantidadHabitaciones(rs.getInt("cantidadHabitaciones"));
                alojamiento.setCantidadCamas(rs.getInt("cantidadCamas"));
                alojamiento.setCantidadBanios(rs.getInt("cantidadBanios"));
                ArrayList<String> fotoss = new ArrayList<>();
                fotos.add(rs.getString("foto1"));
                fotos.add(rs.getString("foto2"));
                fotos.add(rs.getString("foto3"));
                fotos.add(rs.getString("foto4"));
                alojamiento.setFotos(fotoss);
                alojamiento.setAccessibilidad(rs.getString("accessibilidad"));
                alojamiento.setBano(rs.getString("bano"));
                alojamiento.setTitulo(rs.getString("titulo"));
                alojamiento.setPrecio(rs.getDouble("precio"));
                alojamiento.setTipoHospedaje(rs.getInt("tipoHospedaje"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alojamiento;
    }
    
    public Alojamiento buscarPorTitulo() {

        Alojamiento alojamiento = new Alojamiento();
        try {

            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos WHERE titulo = " + "'" + this.titulo + "'");

            if (rs.next()) {
                alojamiento.setId(rs.getInt("id"));
                alojamiento.setAnfi(rs.getString("anfitrion"));
                alojamiento.setTipo(rs.getInt("tipo"));
                alojamiento.setDescripcion(rs.getString("descripcion"));
                alojamiento.setDireccion(rs.getInt("direccion"));
                alojamiento.setCantidadPersonas(rs.getInt("cantidadPersonas"));
                alojamiento.setCantidadHabitaciones(rs.getInt("cantidadHabitaciones"));
                alojamiento.setCantidadCamas(rs.getInt("cantidadCamas"));
                alojamiento.setCantidadBanios(rs.getInt("cantidadBanios"));
                ArrayList<String> fotoss = new ArrayList<>();
                
                fotoss.add(rs.getString("foto1"));
                fotoss.add(rs.getString("foto2"));
                fotoss.add(rs.getString("foto3"));
                fotoss.add(rs.getString("foto4"));
                
                alojamiento.setFotos(fotoss);
                alojamiento.setAccessibilidad(rs.getString("accessibilidad"));
                alojamiento.setBano(rs.getString("bano"));
                alojamiento.setTitulo(rs.getString("titulo"));
                alojamiento.setPrecio(rs.getDouble("precio"));
                alojamiento.setTipoHospedaje(rs.getInt("tipoHospedaje"));

            }
        } catch (SQLException ex) {
            Logger.getLogger(Anfitrion.class.getName()).log(Level.SEVERE, null, ex);
        }

        return alojamiento;
    }

    public DefaultTableModel listarElementos() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(0);
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cantidad De Habitaciones");
        modelo.addColumn("¿Tiene baño?");

        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos");

            while (rs.next()) {
                Direccion direc = new Direccion(rs.getInt("direccion"));
                String ciudad = direc.buscarCiudad();
                TipoAlojamiento tipo = new TipoAlojamiento(rs.getInt("tipo"));
                TipoAlojamiento tipoAlojamiento = tipo.buscar();

                String[] fila = new String[6];
                fila[0] = rs.getString("titulo");
                fila[1] = rs.getString("precio");
                fila[2] = ciudad;
                fila[3] = tipoAlojamiento.getDescripcion();
                fila[4] = rs.getString("cantidadHabitaciones");
                fila[5] = rs.getString("bano");

                modelo.addRow(fila);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

    public DefaultTableModel listarPorCiudad(String ciudad) {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setRowCount(0);
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cantidad De Habitaciones");
        modelo.addColumn("¿Tiene baño?");
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            Direccion direc = new Direccion();
            direc.setCiudad(ciudad);
            int id = direc.buscarId();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos");

            while (rs.next()) {

                Direccion direccion = new Direccion(rs.getInt("direccion"));
                String ciudadd = direccion.buscarCiudad();
                if (ciudadd.equalsIgnoreCase(ciudad)) {
                    TipoAlojamiento tipo = new TipoAlojamiento(rs.getInt("tipo"));
                    TipoAlojamiento tipoAlojamiento = tipo.buscar();

                    String[] fila = new String[6];
                    fila[0] = rs.getString("titulo");
                    fila[1] = rs.getString("precio");
                    fila[2] = ciudadd;
                    fila[3] = tipoAlojamiento.getDescripcion();
                    fila[4] = rs.getString("cantidadHabitaciones");
                    fila[5] = rs.getString("bano");

                    modelo.addRow(fila);
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;

    }

    public DefaultTableModel listarPorTipo(String tipo) {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setRowCount(0);
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cantidad De Habitaciones");
        modelo.addColumn("¿Tiene baño?");
        TipoAlojamiento tipoo = new TipoAlojamiento();
        tipoo.setDescripcion(tipo);
        TipoAlojamiento t = tipoo.buscarId();
        int id = t.getId();
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos");

            while (rs.next()) {

                TipoAlojamiento tp = new TipoAlojamiento(rs.getInt("tipo"));
                TipoAlojamiento tipoAlojamiento = tp.buscar();
                int idAux = tipoAlojamiento.getId();
                if (idAux == id) {
                    Direccion direccion = new Direccion(rs.getInt("direccion"));
                    String ciudadd = direccion.buscarCiudad();

                    String[] fila = new String[6];
                    fila[0] = rs.getString("titulo");
                    fila[1] = rs.getString("precio");
                    fila[2] = ciudadd;
                    fila[3] = tipoAlojamiento.getDescripcion();
                    fila[4] = rs.getString("cantidadHabitaciones");
                    fila[5] = rs.getString("bano");

                    modelo.addRow(fila);

                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;

    }

    public DefaultTableModel listarPorTipoYCiudad(String tipo, String ciudad) {
        DefaultTableModel modelo = new DefaultTableModel();

        modelo.setRowCount(0);
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Cantidad De Habitaciones");
        modelo.addColumn("¿Tiene baño?");
        TipoAlojamiento tipoo = new TipoAlojamiento();
        tipoo.setDescripcion(tipo);
        TipoAlojamiento t = tipoo.buscarId();
        int idTipo = t.getId();

        Direccion direc = new Direccion();
        direc.setCiudad(ciudad);
        int idCiudad = direc.buscarId();
        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos");

            while (rs.next()) {

                TipoAlojamiento tp = new TipoAlojamiento(rs.getInt("tipo"));
                TipoAlojamiento tipoAlojamiento = tp.buscar();
                int idTipoAux = tipoAlojamiento.getId();

                Direccion direccion = new Direccion(rs.getInt("direccion"));
                String ciudadd = direccion.buscarCiudad();
                if(ciudadd.equalsIgnoreCase(ciudad) && idTipoAux==idTipo){
                     String[] fila = new String[6];
                fila[0] = rs.getString("titulo");
                fila[1] = rs.getString("precio");
                fila[2] = ciudadd;
                fila[3] = tipoAlojamiento.getDescripcion();
                fila[4] = rs.getString("cantidadHabitaciones");
                fila[5] = rs.getString("bano");

                modelo.addRow(fila);
                }
               

            }

        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;

    }
      
      public DefaultTableModel listarTodo() {

        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setRowCount(0);
        modelo.addColumn("Titulo");
        modelo.addColumn("Precio");
        modelo.addColumn("Ciudad");
        modelo.addColumn("Tipo");
        modelo.addColumn("Habitaciones");
        modelo.addColumn("Personas");
        modelo.addColumn("Camas");
        modelo.addColumn("¿Tiene baño?");
        modelo.addColumn("Baños");
        modelo.addColumn("Accesibilidad");
        

        try {
            conexion con = new conexion();
            Connection cnx = (Connection) con.conectar();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM alojamientos");

            while (rs.next()) {
                Direccion direc = new Direccion(rs.getInt("direccion"));
                String ciudad = direc.buscarCiudad();
                TipoAlojamiento tipo = new TipoAlojamiento(rs.getInt("tipo"));
                TipoAlojamiento tipoAlojamiento = tipo.buscar();

                String[] fila = new String[10];
                fila[0] = rs.getString("titulo");
                fila[1] = rs.getString("precio");
                fila[2] = ciudad;
                fila[3] = tipoAlojamiento.getDescripcion();
                fila[4] = rs.getString("cantidadHabitaciones");
                fila[5] = rs.getString("cantidadPersonas");
                fila[6] = rs.getString("cantidadCamas");
                fila[7] = rs.getString("bano");
                fila[8] = rs.getString("cantidadBanios");
                fila[9] = rs.getString("accessibilidad");

                modelo.addRow(fila);

            }
        } catch (SQLException ex) {
            Logger.getLogger(Alojamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return modelo;
    }

}
