package vistas;

import static java.awt.image.ImageObserver.WIDTH;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CargaDatos extends javax.swing.JFrame {

    public ArrayList<Empresa> listaempresas = new ArrayList<>();

    public CargaDatos() {
        initComponents();
        cargarEmpresas();
    }

    private void limpiar() {
        txtRazon.setText("");
        txtCuit.setText("");
        txtDoc.setText("");
        txtNombre.setText("");
        txtSueldo.setText("");
        txtApellido.setText("");
    }

    private void cargarEmpresas() {

        listaempresas.add(new Empresa("Arcor", 30 - 50279317 - 5));
        listaempresas.add(new Empresa("Danica", 30 - 71714895 - 5));
        listaempresas.add(new Empresa("Beclever S.A", 30 - 71093337 - 1));

        for (Empresa empresa : listaempresas) {
            comboEmpresa.addItem(empresa.getRazonSocial());
        }

    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpPrinc = new javax.swing.JPanel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRazon = new javax.swing.JTextField();
        txtCuit = new javax.swing.JTextField();
        btnCrearEmpresa = new javax.swing.JToggleButton();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDoc = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtSueldo = new javax.swing.JTextField();
        comboCategoria = new javax.swing.JComboBox<>();
        comboEmpresa = new javax.swing.JComboBox<>();
        btnAgreEmpleado = new javax.swing.JToggleButton();
        btnMostrarEmpl = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestión de Datos");
        setBackground(new java.awt.Color(242, 209, 58));
        setLocation(new java.awt.Point(300, 180));

        jpPrinc.setBackground(new java.awt.Color(234, 178, 64));
        jpPrinc.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel2.setText("Ingresar Datos Empresa");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setText("Razón Social");

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel4.setText("CUIT");

        txtRazon.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        txtCuit.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N

        btnCrearEmpresa.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnCrearEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/boton-agregar.png"))); // NOI18N
        btnCrearEmpresa.setText("CREAR EMPRESA");
        btnCrearEmpresa.setToolTipText("Agregar Empresa");
        btnCrearEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearEmpresaActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtRazon, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(txtCuit, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(btnCrearEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCrearEmpresa)
                .addGap(87, 87, 87))
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel2)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtRazon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtCuit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btnCrearEmpresa)
                .addGap(15, 15, 15))
        );

        jpPrinc.add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, 340, 200));

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jLabel5.setText("Ingresar Datos Empleado");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Documento");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Nombre");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Apellido");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Sueldo $");

        comboCategoria.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboCategoria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CATEGORIA", "GERENTE", "SUPERVISOR", "REPOSITOR", "ADMINISTRATIVO" }));
        comboCategoria.setToolTipText("Categoria");

        comboEmpresa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        comboEmpresa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "EMPRESA" }));
        comboEmpresa.setToolTipText("Empresas");
        comboEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEmpresaActionPerformed(evt);
            }
        });

        btnAgreEmpleado.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnAgreEmpleado.setIcon(new javax.swing.ImageIcon("D:\\NetBeans16\\GUI_TPO_EMPRESAS\\src\\sources\\boton-agregar.png")); // NOI18N
        btnAgreEmpleado.setText("AGREGAR EMPLEADO");
        btnAgreEmpleado.setToolTipText("Agrega Empleado");
        btnAgreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgreEmpleadoActionPerformed(evt);
            }
        });

        btnMostrarEmpl.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        btnMostrarEmpl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/ver.png"))); // NOI18N
        btnMostrarEmpl.setText("MOSTRAR EMPLEADOS");
        btnMostrarEmpl.setToolTipText("Muestra Lista Empleados");
        btnMostrarEmpl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarEmplActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtDoc, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtApellido, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(txtSueldo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(comboCategoria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(comboEmpresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnAgreEmpleado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(btnMostrarEmpl, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(125, 125, 125))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(comboCategoria, 0, 146, Short.MAX_VALUE)
                                    .addComponent(comboEmpresa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane2Layout.createSequentialGroup()
                                .addComponent(btnAgreEmpleado)
                                .addGap(18, 18, 18)
                                .addComponent(btnMostrarEmpl)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgreEmpleado)
                    .addComponent(btnMostrarEmpl))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jpPrinc.add(jLayeredPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(367, 6, 420, 260));

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 10)); // NOI18N
        jLabel1.setText("Julian Rios - TUDS 2023");
        jpPrinc.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, 20));

        btnSalir.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sources/salida.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setToolTipText("Cierra Aplicación");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        jpPrinc.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, 38));

        jMenu1.setText("Empresa");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Empleados");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sueldos");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpPrinc, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearEmpresaActionPerformed

        String razonSocial = txtRazon.getText();
        String cuit = txtCuit.getText();

        for (Empresa emp : listaempresas) {
            if (razonSocial.equals(emp) || cuit.equals(emp)) {
                JOptionPane.showMessageDialog(CargaDatos.this, "Esta empresa ya existe", "A T E N C I O N ! !", WIDTH);
            }
        }

        if (!razonSocial.isEmpty() && !cuit.isEmpty()) {

            Empresa nuevaEmpresa = new Empresa(razonSocial, txtCuit.getWidth());
            JOptionPane.showMessageDialog(CargaDatos.this, "Empresa creada: " + razonSocial);
            comboEmpresa.addItem(razonSocial);
            listaempresas.add(nuevaEmpresa);
            System.out.println(nuevaEmpresa.toString());
        } else {
            JOptionPane.showMessageDialog(CargaDatos.this, "Ingrese la razón social y el CUIT de la empresa");
        }

        limpiar();
    }//GEN-LAST:event_btnCrearEmpresaActionPerformed

    private void btnAgreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgreEmpleadoActionPerformed

        String documentoStr = txtDoc.getText();
        String apellido = txtApellido.getText();
        String nombre = txtNombre.getText();
        String categoria = (String) comboCategoria.getSelectedItem();
        String sueldoStr = txtSueldo.getText();
        String empresaStr = (String) comboEmpresa.getSelectedItem();

        if (documentoStr.isEmpty() || apellido.isEmpty()
                || nombre.isEmpty() || sueldoStr.isEmpty()
                || categoria == null || empresaStr == null) {
            JOptionPane.showMessageDialog(CargaDatos.this, "Todos los campos son obligatorios", "A T E N C I O N ! !", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int documento;
        try {
            documento = (Integer) Integer.parseInt(documentoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(CargaDatos.this, "El número de documento debe ser un número entero", "A T E N C I O N ! !", JOptionPane.ERROR_MESSAGE);
            return;
        }

        double sueldo;
        try {
            sueldo = (Double) Double.parseDouble(sueldoStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(CargaDatos.this, "El sueldo debe ser un número", "A T E N C I O N ! !", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Empresa empresa = null;
        for (Empresa e : listaempresas) {
            if (e.getRazonSocial().equals(empresaStr)) {
                empresa = e;
            }
        }
        if (empresa == null) {
            JOptionPane.showMessageDialog(CargaDatos.this, "No se ha encontrado esta empresa", "A T E N C I O N ! !", JOptionPane.ERROR_MESSAGE);
            return;
        }
        empresa.agregarEmpleados(new Empleado(documento, nombre, apellido, categoria, sueldo, empresa));
        JOptionPane.showMessageDialog(CargaDatos.this, "Empleado agreagdo con éxito !!", "A T E N C I O N ! !", JOptionPane.OK_CANCEL_OPTION);
        limpiar();
    }//GEN-LAST:event_btnAgreEmpleadoActionPerformed

    private void btnMostrarEmplActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarEmplActionPerformed

        jpPrinc.removeAll();
        jpPrinc.repaint();
        ArrayList<Empresa> empresas = listaempresas;
        new ListaEmpleados(empresas).setVisible(true);


    }//GEN-LAST:event_btnMostrarEmplActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int option = JOptionPane.showConfirmDialog(CargaDatos.this, "¿Desea salir del sistema?", "A T E N C I O N ! !", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void comboEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEmpresaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboEmpresaActionPerformed

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
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CargaDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CargaDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnAgreEmpleado;
    private javax.swing.JToggleButton btnCrearEmpresa;
    private javax.swing.JToggleButton btnMostrarEmpl;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> comboCategoria;
    private javax.swing.JComboBox<String> comboEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jpPrinc;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCuit;
    private javax.swing.JTextField txtDoc;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRazon;
    private javax.swing.JTextField txtSueldo;
    // End of variables declaration//GEN-END:variables

}
