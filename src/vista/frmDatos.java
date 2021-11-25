/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Font;
import java.awt.Image;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import modelo.Alojamiento;
import modelo.Comodidad;
import modelo.Direccion;
import modelo.Servicio;
import modelo.TipoAlojamiento;
import modelo.TipoHospedaje;

/**
 *
 * @author Santiago Parra
 */
public class frmDatos extends javax.swing.JFrame {

    /**
     * Creates new form frmInmueble
     */
    public static Alojamiento alojamiento = null;

    public frmDatos() {
        initComponents();
        limpiarListas();

        Font fuente = new Font("Comic Sans MS", 3, 19);

        txtCantHabitaciones.setFont(fuente);
        txtCantPersonas.setFont(fuente);
        txtCantidadCamas.setFont(fuente);
        txtCantidadBanios.setFont(fuente);
        txtAccesibilidad.setFont(fuente);
        txtBano.setFont(fuente);
        txtPrecio.setFont(fuente);
        txtDescripcion.setFont(fuente);
        txtTipoI1.setFont(fuente);
        txtTipoHospedaje.setFont(fuente);
        txtTitulo.setFont(fuente);

        cargarDatos(alojamiento);

        this.setLocationRelativeTo(null);
        this.setResizable(false);

    }

    public static void showInventory(ArrayList<String> theList) {
        for (int i = 0; i < theList.size(); i++) {
            System.out.println(theList.get(i));
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtNombre2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblAviso1 = new javax.swing.JLabel();
        lblVolver = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCantHabitaciones = new javax.swing.JTextField();
        txtCantPersonas = new javax.swing.JTextField();
        txtCantidadCamas = new javax.swing.JTextField();
        txtAccesibilidad = new javax.swing.JTextField();
        txtBano = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        txtDireccion = new javax.swing.JTextField();
        txtCantidadBanios = new javax.swing.JTextField();
        txtTipoHospedaje = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTipoI1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstComodidades = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstServicios = new javax.swing.JList<>();
        jPanel3 = new javax.swing.JPanel();
        lblFoto2 = new javax.swing.JLabel();
        lblFoto4 = new javax.swing.JLabel();
        lblFoto3 = new javax.swing.JLabel();
        lblFoto1 = new javax.swing.JLabel();
        btnReservar = new javax.swing.JButton();

        txtNombre2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtNombre2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombre2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAviso1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblAviso1.setForeground(new java.awt.Color(255, 255, 255));
        lblAviso1.setText("Info Alojamiento");
        jPanel2.add(lblAviso1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, -1, 32));

        lblVolver.setBackground(new java.awt.Color(255, 255, 255));
        lblVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/cerrar-el-simbolo-de-la-cruz-en-un-circulo.png"))); // NOI18N
        lblVolver.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblVolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVolverMouseClicked(evt);
            }
        });
        jPanel2.add(lblVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 0, -1, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 100));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(200, 113, 17));
        jLabel2.setText("Comodidades");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(200, 113, 17));
        jLabel3.setText("Cantidad de Personas:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(200, 113, 17));
        jLabel4.setText("Cantidad de Habitaciones:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(200, 113, 17));
        jLabel5.setText("Direccion:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(200, 113, 17));
        jLabel6.setText("Cantidad de Camas:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(200, 113, 17));
        jLabel7.setText("Cantidad de Baños:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(200, 113, 17));
        jLabel8.setText("¿Acceso para silla de ruedas?");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(200, 113, 17));
        jLabel9.setText("¿Baño?");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(200, 113, 17));
        jLabel11.setText("Descripcion: ");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 550, -1, -1));

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(200, 113, 17));
        jLabel12.setText("Precio:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        txtCantHabitaciones.setEditable(false);
        txtCantHabitaciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtCantHabitaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantHabitacionesActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantHabitaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 249, -1));

        txtCantPersonas.setEditable(false);
        txtCantPersonas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtCantPersonas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantPersonasActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantPersonas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 249, -1));

        txtCantidadCamas.setEditable(false);
        txtCantidadCamas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtCantidadCamas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadCamasActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadCamas, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 249, -1));

        txtAccesibilidad.setEditable(false);
        txtAccesibilidad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtAccesibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAccesibilidadActionPerformed(evt);
            }
        });
        jPanel1.add(txtAccesibilidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 249, -1));

        txtBano.setEditable(false);
        txtBano.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtBano.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBanoActionPerformed(evt);
            }
        });
        jPanel1.add(txtBano, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 420, 249, -1));

        txtPrecio.setEditable(false);
        txtPrecio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 460, 249, -1));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 249, 120));

        txtDireccion.setEditable(false);
        txtDireccion.setFont(new java.awt.Font("Comic Sans MS", 1, 8)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDireccionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 249, -1));

        txtCantidadBanios.setEditable(false);
        txtCantidadBanios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtCantidadBanios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadBaniosActionPerformed(evt);
            }
        });
        jPanel1.add(txtCantidadBanios, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 249, -1));

        txtTipoHospedaje.setEditable(false);
        txtTipoHospedaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtTipoHospedaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoHospedajeActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipoHospedaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, 249, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(200, 113, 17));
        jLabel10.setText("Tipo: ");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtTipoI1.setEditable(false);
        txtTipoI1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtTipoI1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtTipoI1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTipoI1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtTipoI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, 249, -1));

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(200, 113, 17));
        jLabel13.setText("Titulo:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, -1, -1));

        txtTitulo.setEditable(false);
        txtTitulo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        txtTitulo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(200, 113, 17)));
        txtTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTituloActionPerformed(evt);
            }
        });
        jPanel1.add(txtTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 130, 249, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(200, 113, 17));
        jLabel14.setText("Tipo Hospedaje:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(200, 113, 17));
        jLabel15.setText("Servicios");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        lstComodidades.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jScrollPane2.setViewportView(lstComodidades);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 200, 120, -1));

        lstServicios.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jScrollPane3.setViewportView(lstServicios);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, 120, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblFoto2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblFoto2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoto2MouseClicked(evt);
            }
        });

        lblFoto4.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblFoto4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoto4MouseClicked(evt);
            }
        });

        lblFoto3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblFoto3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoto3MouseClicked(evt);
            }
        });

        lblFoto1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblFoto1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        lblFoto1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblFoto1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(lblFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 380, 340, 280));

        btnReservar.setText("Reservar");
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 700, 90, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -10, 1140, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantHabitacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantHabitacionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantHabitacionesActionPerformed

    private void txtCantPersonasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantPersonasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantPersonasActionPerformed

    private void txtCantidadCamasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadCamasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadCamasActionPerformed

    private void txtAccesibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAccesibilidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAccesibilidadActionPerformed

    private void txtBanoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBanoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBanoActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioActionPerformed

    private void lblVolverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVolverMouseClicked
        frmPrincipal vista = new frmPrincipal();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblVolverMouseClicked

    private void txtDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDireccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDireccionActionPerformed

    private void txtTipoHospedajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoHospedajeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoHospedajeActionPerformed

    private void txtCantidadBaniosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadBaniosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadBaniosActionPerformed

    private void txtNombre2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombre2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombre2ActionPerformed

    private void txtTipoI1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTipoI1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTipoI1ActionPerformed

    private void txtTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTituloActionPerformed

    private void lblFoto1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto1MouseClicked

    }//GEN-LAST:event_lblFoto1MouseClicked

    private void lblFoto4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto4MouseClicked

    }//GEN-LAST:event_lblFoto4MouseClicked

    private void lblFoto2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFoto2MouseClicked

    private void lblFoto3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblFoto3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_lblFoto3MouseClicked

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        frmReserva1.alojamiento = alojamiento;
        frmReserva1 vista = new frmReserva1();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnReservarActionPerformed

    public void cargarDatos(Alojamiento alojamiento) {

        try {
            txtCantPersonas.setText(alojamiento.getCantidadPersonas() + "");
            txtCantHabitaciones.setText(alojamiento.getCantidadHabitaciones() + "");
            txtCantidadBanios.setText(alojamiento.getCantidadBanios() + "");
            txtCantidadCamas.setText(alojamiento.getCantidadCamas() + "");
            txtAccesibilidad.setText(alojamiento.getAccessibilidad());
            txtBano.setText(alojamiento.getBano());
            txtPrecio.setText(alojamiento.getPrecio() + "");
            txtDescripcion.setText(alojamiento.getDescripcion());
            txtTitulo.setText(alojamiento.getTitulo());
            Servicio ser = new Servicio();
            ResultSet servicios = ser.getServiciosElegidos(alojamiento.getId());
            DefaultListModel modelo = new DefaultListModel();
            while (servicios.next()) {
                modelo.addElement(servicios.getString(1));
            }
            lstServicios.setModel(modelo);
            
            Comodidad comi = new Comodidad();
            ResultSet comodidades = comi.getComodidadesElegidas(alojamiento.getId());
            DefaultListModel modelo1 = new DefaultListModel();
            while (comodidades.next()) {
                modelo1.addElement(comodidades.getString(1));
            }
            lstComodidades.setModel(modelo1);
            
            TipoAlojamiento tipoA = new TipoAlojamiento(alojamiento.getTipo());
            TipoAlojamiento tipoAlo = tipoA.buscar();
            txtTipoI1.setText(tipoAlo.getDescripcion());
            
            Direccion direc = new Direccion(alojamiento.getDireccion());
            Direccion direccion = direc.buscar();
            txtDireccion.setText(direccion.getPrincipal()+" # "+direccion.getComplemento()+", "+direccion.getCiudad()+"/"+direccion.getDepartamento()
            +"/"+direccion.getPais());
            
            
            TipoHospedaje th = new TipoHospedaje(alojamiento.getTipoHospedaje());
            TipoHospedaje tipoH = th.buscar();
            txtTipoHospedaje.setText(tipoH.getDescripcion());
            
            
            Image foto =  getToolkit().getImage(alojamiento.getFotos().get(0));
            Icon icono = new ImageIcon(foto.getScaledInstance(lblFoto1.getWidth(), lblFoto1.getHeight(), Image.SCALE_DEFAULT));

            lblFoto1.setIcon(icono);
            
            Image foto1 =  getToolkit().getImage(alojamiento.getFotos().get(1));
            Icon icono1 = new ImageIcon(foto1.getScaledInstance(lblFoto2.getWidth(), lblFoto2.getHeight(), Image.SCALE_DEFAULT));

            lblFoto2.setIcon(icono1);
            
            Image foto2 =  getToolkit().getImage(alojamiento.getFotos().get(2));
            Icon icono2 = new ImageIcon(foto2.getScaledInstance(lblFoto3.getWidth(), lblFoto3.getHeight(), Image.SCALE_DEFAULT));

            lblFoto3.setIcon(icono2);
            
            Image foto3 =  getToolkit().getImage(alojamiento.getFotos().get(3));
            Icon icono3 = new ImageIcon(foto3.getScaledInstance(lblFoto4.getWidth(), lblFoto4.getHeight(), Image.SCALE_DEFAULT));

            lblFoto4.setIcon(icono3);
            
        } catch (SQLException ex) {
            Logger.getLogger(frmDatos.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public DefaultListModel limpiarListas() {
        DefaultListModel modelo = new DefaultListModel();
        lstComodidades.setModel(modelo);
        lstServicios.setModel(modelo);
        return modelo;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new frmDatos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReservar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblAviso1;
    private javax.swing.JLabel lblFoto1;
    private javax.swing.JLabel lblFoto2;
    private javax.swing.JLabel lblFoto3;
    private javax.swing.JLabel lblFoto4;
    private javax.swing.JLabel lblVolver;
    private javax.swing.JList<String> lstComodidades;
    private javax.swing.JList<String> lstServicios;
    private javax.swing.JTextField txtAccesibilidad;
    private javax.swing.JTextField txtBano;
    private javax.swing.JTextField txtCantHabitaciones;
    private javax.swing.JTextField txtCantPersonas;
    private javax.swing.JTextField txtCantidadBanios;
    private javax.swing.JTextField txtCantidadCamas;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtTipoHospedaje;
    private javax.swing.JTextField txtTipoI1;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
