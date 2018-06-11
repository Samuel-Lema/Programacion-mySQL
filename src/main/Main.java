package main;

public class Main extends javax.swing.JFrame {
   
    public Main() {
        initComponents();

        // Inicia la conexión con la BBDD y carga la tabla Heroes en la JTable
        
        Controlador.conectarBBDD();
        Controlador.cargarTabla(tableHeroes, "HEROES");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tableHeroes = new javax.swing.JTable();
        btnAñadir = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lbVida = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        lbDaño = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        tfNombre = new javax.swing.JTextField();
        tfVida = new javax.swing.JTextField();
        tfDaño = new javax.swing.JTextField();
        lbBusqueda = new javax.swing.JLabel();
        cbBusqueda = new javax.swing.JComboBox<>();
        btnBusqueda = new javax.swing.JButton();
        tfBusqueda = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(602, 605));
        setResizable(false);

        tableHeroes.setAutoCreateRowSorter(true);
        tableHeroes.setSurrendersFocusOnKeystroke(true);
        tableHeroes.setVerifyInputWhenFocusTarget(false);
        tableHeroes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableHeroesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableHeroes);
        tableHeroes.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAñadir.setText("Añadir");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        lbVida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbVida.setText("Vida");

        lbNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbNombre.setText("Nombre");

        lbDaño.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbDaño.setText("Daño");

        btnEditar.setText("Actualizar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        lbBusqueda.setText("Busqueda por:");

        cbBusqueda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Codigo", "Nombre", "Vida", "Daño" }));

        btnBusqueda.setText("Buscar");
        btnBusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(lbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cbBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tfNombre, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnEliminar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(tfVida, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbVida, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(lbDaño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(tfDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                        .addGap(18, 18, 18)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbVida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfVida, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDaño, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbBusqueda)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tfBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Gestiona las filas que selecciona en el JTable y recoge sus datos en las TextBox  
    
    private void tableHeroesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableHeroesMouseClicked
        
        if (tableHeroes.getSelectedRow() != -1){
            
            tfNombre.setText(String.valueOf(tableHeroes.getValueAt(tableHeroes.getSelectedRow(), 1)));
            tfVida.setText(String.valueOf(tableHeroes.getValueAt(tableHeroes.getSelectedRow(), 2)));
            tfDaño.setText(String.valueOf(tableHeroes.getValueAt(tableHeroes.getSelectedRow(), 3)));
        }
    }//GEN-LAST:event_tableHeroesMouseClicked
    
    // Llama a la función borrarRow que gestiona el borrado y refresca la JTable
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
                                                  
        Controlador.borrarRow(tableHeroes);                                       
    }//GEN-LAST:event_btnEliminarActionPerformed

    // Llama a la función actualizarRow que gestiona las modificaciones y refresca la JTable
    
    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
           
        Controlador.actualizarRow(tableHeroes);
    }//GEN-LAST:event_btnEditarActionPerformed
    
    // Llama a la función añadirRow que gestiona la insertación y refresca la JTable
    
    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
            
        Controlador.añadirRow(tableHeroes);
    }//GEN-LAST:event_btnAñadirActionPerformed

    // Gestiona el filtrado de Busqueda y lo envia al metodo cargarTabla para que lo gestione posteriormente
    
    private void btnBusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaActionPerformed
            
        switch((String) cbBusqueda.getSelectedItem()){
            case "Codigo": Controlador.cargarTabla(tableHeroes, "HEROES", " WHERE CODIGO LIKE '%" + tfBusqueda.getText() + "%'"); break;
            case "Nombre": Controlador.cargarTabla(tableHeroes, "HEROES", " WHERE NOMBRE LIKE '%" + tfBusqueda.getText() + "%'"); break;
            case "Vida": Controlador.cargarTabla(tableHeroes, "HEROES", " WHERE VIDA LIKE '%" + tfBusqueda.getText() + "%'"); break;
            case "Daño": Controlador.cargarTabla(tableHeroes, "HEROES", " WHERE DAÑO LIKE '%" + tfBusqueda.getText() + "%'"); break;
        }
    }//GEN-LAST:event_btnBusquedaActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbBusqueda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbBusqueda;
    private javax.swing.JLabel lbDaño;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbVida;
    private javax.swing.JTable tableHeroes;
    private javax.swing.JTextField tfBusqueda;
    protected static javax.swing.JTextField tfDaño;
    protected static javax.swing.JTextField tfNombre;
    protected static javax.swing.JTextField tfVida;
    // End of variables declaration//GEN-END:variables
}
