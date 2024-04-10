package trabajopractico3;

import javax.swing.JOptionPane;

public class formLogin extends javax.swing.JFrame {

    public formLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        jlMail = new javax.swing.JLabel();
        jlContraseña = new javax.swing.JLabel();
        jtMail = new javax.swing.JTextField();
        jbRegistrar = new javax.swing.JButton();
        jpContraseña = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 102, 255));
        setResizable(false);

        lbTitulo.setBackground(new java.awt.Color(153, 153, 153));
        lbTitulo.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(102, 0, 102));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("FORMULARIO DE INGRESO");

        jlMail.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jlMail.setForeground(new java.awt.Color(102, 0, 102));
        jlMail.setText("CORREO ");

        jlContraseña.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jlContraseña.setForeground(new java.awt.Color(102, 0, 102));
        jlContraseña.setText("CONTRASEÑA");

        jtMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtMailActionPerformed(evt);
            }
        });

        jbRegistrar.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jbRegistrar.setForeground(new java.awt.Color(102, 0, 102));
        jbRegistrar.setText("REGISTRAR");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jpContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlContraseña)
                            .addComponent(jlMail))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtMail, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                            .addComponent(jpContraseña)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(lbTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(jbRegistrar)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(lbTitulo)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlMail))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlContraseña)
                    .addComponent(jpContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jbRegistrar)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtMailActionPerformed
        // no lo puedo borrar we
    }//GEN-LAST:event_jtMailActionPerformed

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed
        String email = jtMail.getText(); // Obtener el correo electrónico ingresado
        String password = new String(jpContraseña.getPassword()); // Obtener la contraseña ingresada

        if (email.equals("alumno@ulp.edu.ar") && password.equals("12345678")) {
            JOptionPane.showMessageDialog(this, "¡Bienvenido!");
        } else {
            JOptionPane.showMessageDialog(this, "Usuario y/o contraseña incorrectos");
    }//GEN-LAST:event_jbRegistrarActionPerformed

        jtMail.setText(""); 
        jpContraseña.setText("");
    }
    
    
    
    private void jpContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpContraseñaActionPerformed
        // tampoco lo puedo borrar
    }//GEN-LAST:event_jpContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formLogin().setVisible(true);
            }
        });
    }

    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbRegistrar;
    private javax.swing.JLabel jlContraseña;
    private javax.swing.JLabel jlMail;
    private javax.swing.JPasswordField jpContraseña;
    private javax.swing.JTextField jtMail;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
