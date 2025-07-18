/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas.VIEWS;

import Modelo.Cliente;
import Modelo.Destino;
import Modelo.Usuario;
import dao.ClienteDAO;
import dao.DestinoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel; // Import DefaultTableModel

/**
 *
 * @author User
 */
public class GestionDestino extends javax.swing.JFrame {

     private DestinoDAO destinoDAO; // Declare your DAO
    private DefaultTableModel modeloTablaDestinos; // Declare the table model
    private ClienteDAO clienteDAO;
    private Usuario usuarioActual;
    private Cliente clienteSeleccionado;
    
    public GestionDestino(Usuario usuarioLogeado) {
        initComponents();
        this.usuarioActual=usuarioLogeado;
        this.setLocationRelativeTo(null); // Center the frame on the screen
        destinoDAO = new DestinoDAO(); // Initialize the DAO
        
        
        if (usuarioActual != null && usuarioActual.getRol() != null) {
            String nombreRol = usuarioActual.getRol().getNombreRol();
            setTitle("Sistema para el usuario " + usuarioActual.getNombreCompleto());
        }else{
            setTitle("Sistema de User");
        }
        
        configurarTabla(); // Set up the table model
        cargarDestinosEnTabla(); // Load data when the frame starts
    }

     private void configurarTabla() {
        modeloTablaDestinos = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make cells non-editable
            }
        };
        modeloTablaDestinos.addColumn("ID");
        modeloTablaDestinos.addColumn("Nombre Destino");
        modeloTablaDestinos.addColumn("Descripción");
         modeloTablaDestinos.addColumn("Estado");

        tbdestino.setModel(modeloTablaDestinos);
    }

    // Method to load destinations into the table
    private void cargarDestinosEnTabla() {
    modeloTablaDestinos.setRowCount(0); // Limpiar tabla existente
    
    // Cambiar a obtener solo destinos activos
    List<Destino> destinos = destinoDAO.obtenerDestinosActivos();
    
    if (destinos != null && !destinos.isEmpty()) {
        for (Destino d : destinos) {
            Object[] row = new Object[]{
                d.getIdDestino(),
                d.getNombreDestino(),
                d.getDescripcion(),
                d.getEstado()
            };
            modeloTablaDestinos.addRow(row);
        }
    } else {
        JOptionPane.showMessageDialog(this,
            "No se encontraron destinos activos.",
            "Información",
            JOptionPane.INFORMATION_MESSAGE);
    }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnConfiguracion = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnCrear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbdestino = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        btnConfiguracion.setBackground(new java.awt.Color(0, 46, 121));
        btnConfiguracion.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-config-23 (1).png"))); // NOI18N
        btnConfiguracion.setText(" CONFIGURACIÓN");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jPanel2.add(btnConfiguracion);
        btnConfiguracion.setBounds(-20, 340, 210, 50);

        btnHome.setBackground(new java.awt.Color(0, 46, 121));
        btnHome.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-house-23.png"))); // NOI18N
        btnHome.setText(" HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel2.add(btnHome);
        btnHome.setBounds(-20, 90, 210, 50);

        btnClientes.setBackground(new java.awt.Color(0, 46, 121));
        btnClientes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-customers-23.png"))); // NOI18N
        btnClientes.setText(" CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnClientes);
        btnClientes.setBounds(-20, 140, 210, 50);

        btnReservas.setBackground(new java.awt.Color(0, 46, 121));
        btnReservas.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-calendar-23.png"))); // NOI18N
        btnReservas.setText(" RESERVAS");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        jPanel2.add(btnReservas);
        btnReservas.setBounds(-20, 190, 210, 50);

        btnProveedores.setBackground(new java.awt.Color(0, 46, 121));
        btnProveedores.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-supplier-23.png"))); // NOI18N
        btnProveedores.setText(" PROVEEDORES");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel2.add(btnProveedores);
        btnProveedores.setBounds(-20, 240, 210, 50);

        btnReportes.setBackground(new java.awt.Color(0, 46, 121));
        btnReportes.setFont(new java.awt.Font("Century Gothic", 1, 16)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-report-23 (1).png"))); // NOI18N
        btnReportes.setText(" REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel2.add(btnReportes);
        btnReportes.setBounds(-20, 290, 210, 50);

        jPanel3.setBackground(new java.awt.Color(0, 46, 121));

        jButton7.setBackground(new java.awt.Color(179, 23, 23));
        jButton7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-lock-30.png"))); // NOI18N
        jButton7.setText("Cerrar sesión");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(8, 8, 100));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-bus-58.png"))); // NOI18N
        jLabel2.setText("  Expreso los Chankas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 352, Short.MAX_VALUE)
                .addComponent(jButton7)
                .addGap(18, 18, 18))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 890, 90);

        jTextField1.setBackground(new java.awt.Color(0, 46, 121));
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField1);
        jTextField1.setBounds(-20, 90, 210, 460);

        btnVolver.setBackground(new java.awt.Color(153, 153, 153));
        btnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-left-arrow-21.png"))); // NOI18N
        btnVolver.setText("VOLVER");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver);
        btnVolver.setBounds(710, 120, 130, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("GESTIÓN DE DESTINOS");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(250, 120, 190, 30);

        btnEliminar.setBackground(new java.awt.Color(179, 23, 23));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-trash-can-21.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminar);
        btnEliminar.setBounds(340, 390, 140, 30);

        btnModificar.setBackground(new java.awt.Color(0, 123, 255));
        btnModificar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(255, 255, 255));
        btnModificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-edit-21 (1).png"))); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel2.add(btnModificar);
        btnModificar.setBounds(500, 390, 160, 30);

        btnCrear.setBackground(new java.awt.Color(40, 167, 69));
        btnCrear.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGENES/icons8-plus-sign-21.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel2.add(btnCrear);
        btnCrear.setBounds(680, 390, 110, 30);

        tbdestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbdestino.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID_Destino", "Nombre Destino", "Descripción", "Estado"
            }
        ));
        jScrollPane2.setViewportView(tbdestino);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(350, 190, 440, 150);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        FormularioDestino formulario = new FormularioDestino(this, true);
        formulario.setModoEdicion(true, null);
        formulario.setVisible(true);
        cargarDestinosEnTabla();
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tbdestino.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, 
                "Por favor, seleccione un destino de la tabla para eliminar.", 
                "Ningún Destino Seleccionado", 
                JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idDestino = (int) modeloTablaDestinos.getValueAt(selectedRow, 0);
        String nombreDestino = (String) modeloTablaDestinos.getValueAt(selectedRow, 1);

        int confirm = JOptionPane.showConfirmDialog(
            this,
            "¿Está seguro de que desea marcar como INACTIVO el destino: " + nombreDestino + "?",
            "Confirmar Eliminación Lógica",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE
        );

        if (confirm == JOptionPane.YES_OPTION) {
            boolean exito = destinoDAO.eliminarDestinoLogico(idDestino);
            if (exito) {
                JOptionPane.showMessageDialog(this, 
                    "Destino marcado como INACTIVO exitosamente.", 
                    "Éxito", 
                    JOptionPane.INFORMATION_MESSAGE);
                cargarDestinosEnTabla();
            } else {
                JOptionPane.showMessageDialog(this, 
                    "Error al marcar el destino como INACTIVO.", 
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int selectedRow = tbdestino.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione un destino de la tabla para modificar.", "Ningún Destino Seleccionado", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int idDestino = (int) modeloTablaDestinos.getValueAt(selectedRow, 0);

        Destino destinoAModificar = destinoDAO.obtenerDestinoPorId(idDestino);

        if (destinoAModificar != null) {
            FormularioDestino formulario = new FormularioDestino(this, true);
            formulario.setModoEdicion(false, destinoAModificar);
            formulario.setVisible(true);
            cargarDestinosEnTabla();
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo cargar el destino para modificación.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnReportesActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tbdestino;
    // End of variables declaration//GEN-END:variables
}
