/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.gui;


import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose
 */
public class MDISoftware extends javax.swing.JFrame {

    /**
     * Creates new form MDISoftware
     */
    public MDISoftware() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/menu_act.png"))); // NOI18N
        fileMenu.setMnemonic('f');
        fileMenu.setText("Actividades");

        openMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_menu_activity.png"))); // NOI18N
        openMenuItem.setMnemonic('o');
        openMenuItem.setText(" Actividad");
        openMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(openMenuItem);

        saveAsMenuItem.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/icono_conf_activity_monitor.png")); // NOI18N
        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Configurar Actividades");
        saveAsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveAsMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveAsMenuItem);

        saveMenuItem.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/icono_clock_activity.png")); // NOI18N
        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Agregar Nuevo Plan");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(saveMenuItem);

        jMenuItem2.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/icono_clock_activity_up.png")); // NOI18N
        jMenuItem2.setText("Actualizar Plan");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem2);

        exitMenuItem.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/icono_list.png")); // NOI18N
        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Listado de Planes");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        jMenuItem1.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/icono_config_activity.png")); // NOI18N
        jMenuItem1.setText("Configurar Gimancios");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        menuBar.add(fileMenu);

        editMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/socios.png"))); // NOI18N
        editMenu.setMnemonic('e');
        editMenu.setText("Socios");

        cutMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_nuevo_socio.png"))); // NOI18N
        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Socios");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        menuBar.add(editMenu);

        helpMenu.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/menu_act.png")); // NOI18N
        helpMenu.setMnemonic('h');
        helpMenu.setText("Funcionarios");

        contentMenuItem.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/icono_list.png")); // NOI18N
        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Funcionarios");
        helpMenu.add(contentMenuItem);

        menuBar.add(helpMenu);

        jMenu1.setText("Promociones");
        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1191, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
       FormListadoConfAct aclist= new FormListadoConfAct();
       aclist.setVisible(true);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void openMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openMenuItemActionPerformed
       FormActivity act = new FormActivity();
       act.setVisible(true);
    }//GEN-LAST:event_openMenuItemActionPerformed

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
       ActivitiesTimetable tm = null;
        try {
            tm = new ActivitiesTimetable();
        } catch (SQLException ex) {
            Logger.getLogger(MDISoftware.class.getName()).log(Level.SEVERE, null, ex);
        }
       tm.setVisible(true);
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       FormLocationActivity la= new FormLocationActivity();
       la.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void saveAsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveAsMenuItemActionPerformed
        ActivitiesTimetable at = null;
        try {
            at = new ActivitiesTimetable();
        } catch (SQLException ex) {
            Logger.getLogger(MDISoftware.class.getName()).log(Level.SEVERE, null, ex);
        }
        at.setVisible(true);
    }//GEN-LAST:event_saveAsMenuItemActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
       FormEditarSocios so = null;
        try {
            so = new FormEditarSocios();
        } catch (SQLException ex) {
            Logger.getLogger(MDISoftware.class.getName()).log(Level.SEVERE, null, ex);
        }
       so.setVisible(true);
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        UpdateFormConfigActivityTime upac = new UpdateFormConfigActivityTime();
        upac.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(MDISoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MDISoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MDISoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MDISoftware.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MDISoftware().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
