/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.awt.Color;
import modelo.Alojamiento;
import modelo.Reserva;

/**
 *
 * @author Santiago Parra
 */
public class frmReserva1 extends javax.swing.JFrame {

    /**
     * Creates new form frmReserva1
     */
    public static Alojamiento alojamiento = new Alojamiento();
    public static Reserva reserva = new Reserva();
    public frmReserva1() {
        initComponents();
       this.getContentPane().setBackground(Color.white);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        Panel1.setBackground(Color.red);
        for (int i = 1; i <= 31; i++) {
            cbDiaInicio.addItem(i + "");
            cbDiaFin.addItem(i + "");
        }
        for (int i = 2021; i >= 1901; i--) {
            cbAnioFin.addItem(i + "");
            cbAnioInicio.addItem(i + "");
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

        Panel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbDiaInicio = new javax.swing.JComboBox<>();
        cbMesInicio = new javax.swing.JComboBox<>();
        cbAnioInicio = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cbDiaFin = new javax.swing.JComboBox<>();
        cbMesFin = new javax.swing.JComboBox<>();
        cbAnioFin = new javax.swing.JComboBox<>();
        txtSiguiente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel1.setForeground(new java.awt.Color(255, 0, 0));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("RESERVAR");

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jLabel4)
                .addContainerGap(134, Short.MAX_VALUE))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Panel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel3.setText("Fecha Inicio");

        cbDiaInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));

        cbMesInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cbAnioInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel5.setText("Fecha Fin");

        cbDiaFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dia" }));

        cbMesFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mes", "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        cbAnioFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Año" }));

        txtSiguiente.setText("Siguiente");
        txtSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSiguienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(cbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cbAnioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(cbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(cbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(cbAnioFin, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(txtSiguiente, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDiaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMesInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnioInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel5)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbDiaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbMesFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbAnioFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(txtSiguiente)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSiguienteActionPerformed
        reserva.setAlojamiento(alojamiento.getId());
        String mesIinicio = cbMesInicio.getSelectedItem().toString();
        String mesAux="";
        switch (mesIinicio) {
            case "Enero":
                mesAux = "01";
                break;
            case "Febrero":
                mesAux = "02";
                break;
            case "Marzo":
                mesAux = "03";
                break;
            case "Abril":
                mesAux = "04";
                break;

            case "Mayo":
                mesAux = "05";
                break;
            case "Junio":
                mesAux = "06";
                break;
            case "Julio":
                mesAux = "07";
                break;
            case "Agosto":
                mesAux = "08";
                break;
            case "Septiembre":
                mesAux = "09";
                break;
            case "Octubre":
                mesAux = "10";
                break;
            case "Noviembre":
                mesAux = "11";
                break;
            case "Diciembre":
                mesAux = "12";
                break;

        }
        
        String fechaInicio = cbAnioInicio.getSelectedItem().toString() + "-" + mesAux
                + "-" + cbDiaInicio.getSelectedItem().toString();
        
        String mesIFin = cbMesFin.getSelectedItem().toString();
        String mesAuxFin="";
        switch (mesIinicio) {
            case "Enero":
                mesAuxFin = "01";
                break;
            case "Febrero":
                mesAuxFin = "02";
                break;
            case "Marzo":
                mesAuxFin = "03";
                break;
            case "Abril":
                mesAuxFin = "04";
                break;

            case "Mayo":
                mesAuxFin = "05";
                break;
            case "Junio":
                mesAuxFin = "06";
                break;
            case "Julio":
                mesAuxFin = "07";
                break;
            case "Agosto":
                mesAuxFin = "08";
                break;
            case "Septiembre":
                mesAuxFin = "09";
                break;
            case "Octubre":
                mesAuxFin = "10";
                break;
            case "Noviembre":
                mesAuxFin = "11";
                break;
            case "Diciembre":
                mesAuxFin = "12";
                break;

        }
        
        String fechaFin = cbAnioFin.getSelectedItem().toString() + "-" + mesAuxFin
                + "-" + cbDiaFin.getSelectedItem().toString();
        
        reserva.setFechaEntrada(fechaInicio);
        reserva.setFechaSalida(fechaFin);
        frmRegistrarHuesped1 vista = new frmRegistrarHuesped1();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_txtSiguienteActionPerformed

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
            java.util.logging.Logger.getLogger(frmReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmReserva1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmReserva1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JComboBox<String> cbAnioFin;
    private javax.swing.JComboBox<String> cbAnioInicio;
    private javax.swing.JComboBox<String> cbDiaFin;
    private javax.swing.JComboBox<String> cbDiaInicio;
    private javax.swing.JComboBox<String> cbMesFin;
    private javax.swing.JComboBox<String> cbMesInicio;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton txtSiguiente;
    // End of variables declaration//GEN-END:variables
}
