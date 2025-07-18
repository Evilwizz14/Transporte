package Vistas.VIEWS;

import Controlador.NavegacionController;
import Modelo.Bus;
import Modelo.Cliente;
import Modelo.Usuario;
import Vistas.VIEWS.CrearReserva;
import dao.ClienteDAO;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class GestionItinerario extends javax.swing.JFrame {

    private Usuario usuarioActual;
    private Cliente clienteSeleccionado;
    private ClienteDAO clienteDAO;

    public GestionItinerario(Usuario usuarioLogeado) {
        this.usuarioActual = usuarioLogeado;
        initComponents();
        cargarClientesEnComboBox();

        this.setLocationRelativeTo(null);
        this.clienteDAO = new ClienteDAO();

        if (usuarioActual != null && usuarioActual.getRol() != null) {
            String nombreRol = usuarioActual.getRol().getNombreRol();
            setTitle("Sistema para el usuario " + usuarioActual.getNombreCompleto());
        } else {
            setTitle("Sistema de User");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAceptar = new javax.swing.JButton();
        cmbClientes = new javax.swing.JComboBox<Cliente>();
        btnConfiguracion = new javax.swing.JButton();
        btnReportes = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        btnReservas = new javax.swing.JButton();
        btnClientes = new javax.swing.JButton();
        btnHome = new javax.swing.JButton();
        bntDestino = new javax.swing.JButton();
        btnBus = new javax.swing.JButton();
        btnItinerario = new javax.swing.JButton();
        btnViaje = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(8, 8, 100));

        jButton7.setBackground(new java.awt.Color(179, 23, 23));
        jButton7.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Cerrar sesión");

        jLabel1.setBackground(new java.awt.Color(8, 8, 100));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Expreso");

        jLabel2.setBackground(new java.awt.Color(8, 8, 100));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Los Chankas");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(232, 232, 232)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(318, 318, 318)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 890, 120);

        jPanel3.setBackground(new java.awt.Color(8, 8, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 890, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 460, 890, 90);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel3.setText("Gestionar itinerario");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(220, 140, 410, 60);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Selecciona el cliente:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(260, 210, 230, 50);

        btnAceptar.setBackground(new java.awt.Color(179, 23, 23));
        btnAceptar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAceptar);
        btnAceptar.setBounds(730, 400, 130, 40);

        cmbClientes.setModel(new javax.swing.DefaultComboBoxModel<Cliente>());
        cmbClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbClientesActionPerformed(evt);
            }
        });
        jPanel1.add(cmbClientes);
        cmbClientes.setBounds(260, 260, 190, 22);

        btnConfiguracion.setBackground(new java.awt.Color(8, 8, 100));
        btnConfiguracion.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        btnConfiguracion.setText("CONFIGURACIÓN");
        btnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracionActionPerformed(evt);
            }
        });
        jPanel1.add(btnConfiguracion);
        btnConfiguracion.setBounds(0, 370, 200, 50);

        btnReportes.setBackground(new java.awt.Color(8, 8, 100));
        btnReportes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnReportes.setForeground(new java.awt.Color(255, 255, 255));
        btnReportes.setText("REPORTES");
        btnReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportesActionPerformed(evt);
            }
        });
        jPanel1.add(btnReportes);
        btnReportes.setBounds(0, 320, 200, 50);

        btnProveedores.setBackground(new java.awt.Color(8, 8, 100));
        btnProveedores.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnProveedores.setForeground(new java.awt.Color(255, 255, 255));
        btnProveedores.setText("PROVEEDORES");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        jPanel1.add(btnProveedores);
        btnProveedores.setBounds(0, 270, 200, 50);

        btnReservas.setBackground(new java.awt.Color(8, 8, 100));
        btnReservas.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnReservas.setForeground(new java.awt.Color(255, 255, 255));
        btnReservas.setText("RESERVAS");
        btnReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservasActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservas);
        btnReservas.setBounds(0, 220, 200, 50);

        btnClientes.setBackground(new java.awt.Color(8, 8, 100));
        btnClientes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnClientes.setForeground(new java.awt.Color(255, 255, 255));
        btnClientes.setText("CLIENTES");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        jPanel1.add(btnClientes);
        btnClientes.setBounds(0, 170, 200, 50);

        btnHome.setBackground(new java.awt.Color(8, 8, 100));
        btnHome.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("HOME");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        jPanel1.add(btnHome);
        btnHome.setBounds(0, 120, 200, 50);

        bntDestino.setText("Destinos");
        bntDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDestinoActionPerformed(evt);
            }
        });
        jPanel1.add(bntDestino);
        bntDestino.setBounds(690, 160, 130, 40);

        btnBus.setText("Lista Buses");
        btnBus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusActionPerformed(evt);
            }
        });
        jPanel1.add(btnBus);
        btnBus.setBounds(690, 220, 130, 40);

        btnItinerario.setText("Itinerario");
        btnItinerario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnItinerarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnItinerario);
        btnItinerario.setBounds(690, 280, 130, 40);

        btnViaje.setText("Viaje Programado");
        btnViaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViajeActionPerformed(evt);
            }
        });
        jPanel1.add(btnViaje);
        btnViaje.setBounds(690, 330, 130, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 888, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarClientesEnComboBox() {
        DefaultComboBoxModel<Cliente> model = new DefaultComboBoxModel<>();
        model.addElement(null);

        ClienteDAO clienteDAO = new ClienteDAO(); // Instancia tu DAO
        List<Cliente> clientes = clienteDAO.obtenerClientesActivos();
        if (clientes.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No se encontraron clientes en la BD", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            for (Cliente cliente : clientes) {
                model.addElement(cliente);
            }
            cmbClientes.setModel(model);
        }
    }

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
//        CrearReserva crearReserva = new CrearReserva(); // Abrimos el nuevo frame
//        crearReserva.setVisible(true);
//        dispose(); // Cerramos el actual

//AARON ME DIJO QUE LO IGNORARA
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void cmbClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbClientesActionPerformed
        // TODO add your handling code here:
        clienteSeleccionado = (Cliente) cmbClientes.getSelectedItem();
        if (clienteSeleccionado != null) {
            int confirmacion = JOptionPane.showConfirmDialog(
                    null,
                    "Selección para Iniciar un Itinerario a: " + clienteSeleccionado.getNombreCompleto(), // Tu mensaje
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION);

            // Aquí puedes añadir tu lógica para manejar la respuesta del usuario
            if (confirmacion == JOptionPane.YES_OPTION) {
                System.out.println("Usuario confirmó iniciar itinerario." + clienteSeleccionado.getNombreCompleto());
            } else {
                System.out.println("Usuario canceló el inicio del itinerario. " + clienteSeleccionado.getNombreCompleto());
            }

        }
    }//GEN-LAST:event_cmbClientesActionPerformed

    private void btnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnConfiguracionActionPerformed

    private void btnReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportesActionPerformed
        // TODO add your handling code here:

        if (usuarioActual != null && usuarioActual.getRol() != null) {
            String nombreRol = usuarioActual.getRol().getNombreRol();

            if ("admin".equalsIgnoreCase(nombreRol)) {
                Reportes GI = new Reportes(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("Admin redirigiendo a Reportes.");
            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado. No tienes permisos para ver la gestión de clientes.", "Permiso Denegado", JOptionPane.WARNING_MESSAGE);
                System.out.println("Intento de acceso no autorizado a Reportes por rol: " + nombreRol);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error de seguridad. No se pudo verificar su rol.", "Error", JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnReportesActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void btnReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservasActionPerformed
        // TODO add your handling code here:

        if (usuarioActual != null && usuarioActual.getRol() != null) {
            String nombreRol = usuarioActual.getRol().getNombreRol();

            if ("admin".equalsIgnoreCase(nombreRol)) {
                GestionItinerario GI = new GestionItinerario(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("Admin redirigiendo a Gestión de Itinerario.");
                return;
            }
            if ("usuario".equalsIgnoreCase(nombreRol)) {
                GestionItinerario GI = new GestionItinerario(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("User redirigiendo a Gestión de Itinerario.");
                return;
            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado. No tienes permisos para ver la gestión de clientes.", "Permiso Denegado", JOptionPane.WARNING_MESSAGE);
                System.out.println("Intento de acceso no autorizado a Gestión de Itinerario por rol: " + nombreRol);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error de seguridad. No se pudo verificar su rol.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReservasActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        // TODO add your handling code here:

        if (usuarioActual != null && usuarioActual.getRol() != null) {
            String nombreRol = usuarioActual.getRol().getNombreRol();

            if ("admin".equalsIgnoreCase(nombreRol)) {
                GestionClientes GI = new GestionClientes(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("Admin redirigiendo a Gestión de Clientes.");

            }
            if ("usuario".equalsIgnoreCase(nombreRol)) {
                GestionClientes GI = new GestionClientes(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("User redirigiendo a Gestión de Clientes.");

            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado. No tienes permisos para ver la gestión de clientes.", "Permiso Denegado", JOptionPane.WARNING_MESSAGE);
                System.out.println("Intento de acceso no autorizado a Gestión de Clientes por rol: " + nombreRol);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error de seguridad. No se pudo verificar su rol.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        // TODO add your handling code here:

        if (usuarioActual != null && usuarioActual.getRol() != null) {
            String nombreRol = usuarioActual.getRol().getNombreRol();

            if ("admin".equalsIgnoreCase(nombreRol)) {
                Principal GI = new Principal(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("Admin redirigiendo a Principal.");

            }
            if ("usuario".equalsIgnoreCase(nombreRol)) {
                Principal GI = new Principal(usuarioActual);
                GI.setVisible(true);
                GI.setLocationRelativeTo(null);
                this.dispose();
                System.out.println("User redirigiendo a Principal.");

            } else {
                JOptionPane.showMessageDialog(this, "Acceso denegado. No tienes permisos para ver la gestión de clientes.", "Permiso Denegado", JOptionPane.WARNING_MESSAGE);
                System.out.println("Intento de acceso no autorizado a Gestión de Clientes por rol: " + nombreRol);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Error de seguridad. No se pudo verificar su rol.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnHomeActionPerformed

    private void bntDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDestinoActionPerformed
        if (usuarioActual == null || usuarioActual.getRol() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error de seguridad. No se pudo verificar su rol.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String nombreRol = usuarioActual.getRol().getNombreRol();

        // Permite acceso tanto a "admin" como a "usuario"
        if ("admin".equalsIgnoreCase(nombreRol) || "usuario".equalsIgnoreCase(nombreRol)) {
            GestionDestino gestionDestino = new GestionDestino(usuarioActual);
            gestionDestino.setVisible(true);
            gestionDestino.setLocationRelativeTo(null);
            this.dispose(); // Cierra la ventana actual

            // Mensaje de depuración
            System.out.println((nombreRol.equalsIgnoreCase("admin") ? "Admin" : "User")
                    + " redirigiendo a GestionDestino.");
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Acceso denegado. No tienes permisos para gestionar destinos.",
                    "Permiso Denegado",
                    JOptionPane.WARNING_MESSAGE
            );
            System.out.println("Intento de acceso no autorizado a GestionDestino por rol: " + nombreRol);
        }

    }//GEN-LAST:event_bntDestinoActionPerformed

    private void btnBusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusActionPerformed
        if (usuarioActual == null || usuarioActual.getRol() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error de seguridad. No se pudo verificar su rol.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return; // Detiene la ejecución si no hay usuario o rol
        }

        String nombreRol = usuarioActual.getRol().getNombreRol();

        // Solo permite acceso a admin y usuario
        if ("admin".equalsIgnoreCase(nombreRol)) {
            ListaBuses listaBuses = new ListaBuses(usuarioActual);
            listaBuses.setVisible(true);
            listaBuses.setLocationRelativeTo(null);
            this.dispose(); // Cierra GestionItinerario
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Acceso denegado. No tienes permisos para ver la lista de buses.",
                    "Permiso Denegado",
                    JOptionPane.WARNING_MESSAGE
            );
        }
    }//GEN-LAST:event_btnBusActionPerformed

    private void btnItinerarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnItinerarioActionPerformed
        if (usuarioActual == null || usuarioActual.getRol() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error de seguridad. No se pudo verificar su rol.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String nombreRol = usuarioActual.getRol().getNombreRol();

        // Permite acceso tanto a "admin" como a "usuario"
        if ("admin".equalsIgnoreCase(nombreRol) || "usuario".equalsIgnoreCase(nombreRol)) {
            GestionViajeItinerario viajeItinerario = new GestionViajeItinerario(usuarioActual);
            viajeItinerario.setVisible(true);
            viajeItinerario.setLocationRelativeTo(null);
            this.dispose(); // Cierra la ventana actual

            // Mensaje de depuración
            System.out.println((nombreRol.equalsIgnoreCase("admin") ? "Admin" : "User")
                    + " redirigiendo a GestionViajeItinerario.");
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Acceso denegado. No tienes permisos para acceder a Viaje Itinerario.",
                    "Permiso Denegado",
                    JOptionPane.WARNING_MESSAGE
            );
            System.out.println("Intento de acceso no autorizado a GestionViajeItinerario por rol: " + nombreRol);
        }
    }//GEN-LAST:event_btnItinerarioActionPerformed

    private void btnViajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViajeActionPerformed
        if (usuarioActual == null || usuarioActual.getRol() == null) {
            JOptionPane.showMessageDialog(
                    this,
                    "Error de seguridad. No se pudo verificar su rol.",
                    "Error",
                    JOptionPane.ERROR_MESSAGE
            );
            return;
        }

        String nombreRol = usuarioActual.getRol().getNombreRol();

        // Permite acceso tanto a "admin" como a "usuario"
        if ("admin".equalsIgnoreCase(nombreRol) || "usuario".equalsIgnoreCase(nombreRol)) {
            GestionViajeProgramado viajeProgramado = new GestionViajeProgramado();
            viajeProgramado.setVisible(true);
            viajeProgramado.setLocationRelativeTo(null);
            this.dispose(); // Cierra la ventana actual

            // Mensaje de depuración
            System.out.println((nombreRol.equalsIgnoreCase("admin") ? "Admin" : "User")
                    + " redirigiendo a GestionViajeProgramado.");
        } else {
            JOptionPane.showMessageDialog(
                    this,
                    "Acceso denegado. No tienes permisos para acceder a Viajes Programados.",
                    "Permiso Denegado",
                    JOptionPane.WARNING_MESSAGE
            );
            System.out.println("Intento de acceso no autorizado a GestionViajeProgramado por rol: " + nombreRol);
        }
    }//GEN-LAST:event_btnViajeActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDestino;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBus;
    private javax.swing.JButton btnClientes;
    private javax.swing.JButton btnConfiguracion;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnItinerario;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnReportes;
    private javax.swing.JButton btnReservas;
    private javax.swing.JButton btnViaje;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Cliente> cmbClientes;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    private void abrirFrame(String crearReserva) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cerrarFrameActual() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
