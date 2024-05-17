/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formatoHabeasCorpus;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Lucia
 */
public class PrincipalAccion extends javax.swing.JFrame {

    Historial historial = new Historial();
    int formatoEnVista = -1; //Cuando es -1 es porque no está viendo un formato del historial

    /**
     * Creates new form Principal
     */
    public PrincipalAccion() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH); // me permite maximizar la pantalla al ejecutar la aplicación
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        eliminarFormato = new javax.swing.JButton();
        formatoSiguiente = new javax.swing.JButton();
        formatoAnterior = new javax.swing.JButton();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        c4 = new javax.swing.JTextField();
        c5 = new javax.swing.JTextField();
        c6 = new javax.swing.JTextField();
        c7 = new javax.swing.JTextField();
        c8 = new javax.swing.JTextField();
        c9 = new javax.swing.JTextField();
        c10 = new javax.swing.JTextField();
        c11 = new javax.swing.JTextField();
        c12 = new javax.swing.JTextField();
        c13 = new javax.swing.JTextField();
        c14 = new javax.swing.JTextField();
        c15 = new javax.swing.JTextField();
        separadorPag12 = new javax.swing.JSeparator();
        separadorPag23 = new javax.swing.JSeparator();
        pag1Formato = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        guardarFormato = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        nuevoFormato = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);
        setSize(new java.awt.Dimension(1900, 0));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(1706, 9740));
        jPanel1.setPreferredSize(new java.awt.Dimension(1716, 8979));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 55, 1666, 3));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 15, 10, 27));

        eliminarFormato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        eliminarFormato.setText("Eliminar formato");
        eliminarFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarFormatoActionPerformed(evt);
            }
        });
        jPanel1.add(eliminarFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(728, 15, 160, -1));

        formatoSiguiente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        formatoSiguiente.setText("Siguiente formato >>");
        formatoSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatoSiguienteActionPerformed(evt);
            }
        });
        jPanel1.add(formatoSiguiente, new org.netbeans.lib.awtextra.AbsoluteConstraints(1435, 15, 200, -1));

        formatoAnterior.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        formatoAnterior.setText("<< Anterior formato");
        formatoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formatoAnteriorActionPerformed(evt);
            }
        });
        jPanel1.add(formatoAnterior, new org.netbeans.lib.awtextra.AbsoluteConstraints(1198, 15, 220, -1));

        c1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 180, -1));

        c2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 230, 30));

        c3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 530, 90, -1));

        c4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 550, 90, 30));

        c5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 550, 100, 30));

        c6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c6, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 580, 250, 30));

        c7.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c7, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 615, 280, -1));

        c8.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 640, 130, 20));

        c9.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 670, 230, -1));

        c10.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c10, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 700, 270, -1));

        c11.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c11, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 1350, 270, 30));

        c12.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 1410, 190, -1));

        c13.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 1410, 150, 30));

        c14.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1440, 360, 20));

        c15.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jPanel1.add(c15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 1470, 360, 20));
        jPanel1.add(separadorPag12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 4500, 1666, 10));
        jPanel1.add(separadorPag23, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 6730, 1666, 10));

        pag1Formato.setBackground(new java.awt.Color(255, 255, 255));
        pag1Formato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/files/habeus corpus-1.png"))); // NOI18N
        jPanel1.add(pag1Formato, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 2280, 1666, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Visaulizadores de formatos guardados:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(941, 19, 250, -1));

        guardarFormato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        guardarFormato.setText("Guardar formato");
        guardarFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarFormatoActionPerformed(evt);
            }
        });
        jPanel1.add(guardarFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(508, 15, 200, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Acciones sobre los formatos:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 19, 180, -1));

        nuevoFormato.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nuevoFormato.setText("Nuevo formato");
        nuevoFormato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoFormatoActionPerformed(evt);
            }
        });
        jPanel1.add(nuevoFormato, new org.netbeans.lib.awtextra.AbsoluteConstraints(308, 15, 180, -1));

        jScrollPane2.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1584, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 5625, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nuevoFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoFormatoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "¡El formato se limpiará para iniciar uno nuevo!");
        limpiarCamposDeLaInterfaz();
        JOptionPane.showMessageDialog(null, "¡El formato se limpió para iniciar uno nuevo!");
    }//GEN-LAST:event_nuevoFormatoActionPerformed

    private void guardarFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarFormatoActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null, "¡El formato se guardará!");
        if (formatoEnVista < 0) {
            Formato nuevoFormato = new Formato(tomarCamposDeInterfaz());
            historial.guardarFormato(nuevoFormato);
        } else {
            Formato nuevoFormato = new Formato(tomarCamposDeInterfaz());
            historial.actualizarFormato(formatoEnVista, nuevoFormato);
        }
        limpiarCamposDeLaInterfaz();
        JOptionPane.showMessageDialog(null, "¡El formato se guardó!");
    }//GEN-LAST:event_guardarFormatoActionPerformed

    private void formatoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatoAnteriorActionPerformed
        // TODO add your handling code here:
        if (historial.getFormatosGuardados().size() == 0) {
            JOptionPane.showMessageDialog(null, "¡No hay formatos en el historial para mostar!");
            return;
        }

        if (formatoEnVista < 1) {
            formatoEnVista = historial.getFormatosGuardados().size() - 1;
        } else {
            formatoEnVista--;
        }
        cargarFormatoEnLaInterfaz(historial.getFormatoGuardado(formatoEnVista));
        JOptionPane.showMessageDialog(null, "¡Se visualiza el formato anteriormente guardado!");
    }//GEN-LAST:event_formatoAnteriorActionPerformed

    private void formatoSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formatoSiguienteActionPerformed
        // TODO add your handling code here:
        if (historial.getFormatosGuardados().size() == 0) {
            JOptionPane.showMessageDialog(null, "¡No hay formatos en el historial para mostar!");
            return;
        }

        JOptionPane.showMessageDialog(null, "¡Se visualizará el formato siguiente o primero guardado!");
        if (formatoEnVista > historial.getFormatosGuardados().size() - 2) {
            formatoEnVista = 0;
        } else {
            formatoEnVista++;
        }
        cargarFormatoEnLaInterfaz(historial.getFormatoGuardado(formatoEnVista));
        JOptionPane.showMessageDialog(null, "¡Se visualiza el formato siguiente o primero guardado!");
    }//GEN-LAST:event_formatoSiguienteActionPerformed

    private void eliminarFormatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarFormatoActionPerformed
        // TODO add your handling code here:

        if (formatoEnVista < 0) {
            JOptionPane.showMessageDialog(null, "¡Es necesario visualizar un formato para eliminarlo!");
            return;
        }

        JOptionPane.showMessageDialog(null, "¡El formato se eliminará!");
        historial.eliminarFormatoGuardado(formatoEnVista);
        limpiarCamposDeLaInterfaz();
        JOptionPane.showMessageDialog(null, "¡El formato se eliminó!");
    }//GEN-LAST:event_eliminarFormatoActionPerformed

    public String[] tomarCamposDeInterfaz() {
        String camposSuministrados[] = {
            c1.getText(),
            c2.getText(),
            c3.getText(),
            c4.getText(),
            c5.getText(),
            c6.getText(),
            c7.getText(),
            c8.getText(),
            c9.getText(),
            c10.getText(),
            c11.getText(),
            c12.getText(),
            c13.getText(),
            c14.getText(),
            c15.getText(),
            c16.getText(),
            c17.getText(),
            c18.getText(),
            
           
           
        };

        return camposSuministrados;
    }

    public void limpiarCamposDeLaInterfaz() {
        c1.setText("");
        c2.setText("");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
        c9.setText("");
        c10.setText("");
        c11.setText("");
        c12.setText("");
        c13.setText("");
        c14.setText("");
        c15.setText("");
        c16.setText("");
        c17.setText("");
        c18.setText("");
       
       
       

        formatoEnVista = -1;
    }

    public void cargarFormatoEnLaInterfaz(Formato formato) {
        c1.setText(formato.getCampos()[0]);
        c2.setText(formato.getCampos()[1]);
        c3.setText(formato.getCampos()[2]);
        c4.setText(formato.getCampos()[3]);
        c5.setText(formato.getCampos()[4]);
        c6.setText(formato.getCampos()[5]);
        c7.setText(formato.getCampos()[6]);
        c8.setText(formato.getCampos()[7]);
        c9.setText(formato.getCampos()[8]);
        c10.setText(formato.getCampos()[9]);
        c11.setText(formato.getCampos()[10]);
        c12.setText(formato.getCampos()[11]);
        c13.setText(formato.getCampos()[12]);
        c14.setText(formato.getCampos()[13]);
        c15.setText(formato.getCampos()[14]);
        c16.setText(formato.getCampos()[15]);
        c17.setText(formato.getCampos()[16]);
        c18.setText(formato.getCampos()[17]);
       
        
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
            java.util.logging.Logger.getLogger(PrincipalAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalAccion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalAccion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c10;
    private javax.swing.JTextField c11;
    private javax.swing.JTextField c12;
    private javax.swing.JTextField c13;
    private javax.swing.JTextField c14;
    private javax.swing.JTextField c15;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private javax.swing.JTextField c4;
    private javax.swing.JTextField c5;
    private javax.swing.JTextField c6;
    private javax.swing.JTextField c7;
    private javax.swing.JTextField c8;
    private javax.swing.JTextField c9;
    private javax.swing.JButton eliminarFormato;
    private javax.swing.JButton formatoAnterior;
    private javax.swing.JButton formatoSiguiente;
    private javax.swing.JButton guardarFormato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JButton nuevoFormato;
    private javax.swing.JLabel pag1Formato;
    private javax.swing.JSeparator separadorPag12;
    private javax.swing.JSeparator separadorPag23;
    // End of variables declaration//GEN-END:variables
}
