/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.utu.gui;

import java.awt.HeadlessException;
import uy.com.utu.dto.Activity;
import java.util.ArrayList;
import java.util.List;
import javax.sound.midi.SysexMessage;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import uy.com.utu.business.ActivityBus;

/**
 *
 * @author jose
 */
public class FormActivity extends javax.swing.JFrame {

    public ActivityBus activityBus;
    public List<Activity> list;
    public Activity activity;

    DefaultTableModel modelo;

    public boolean option = false;

    /**
     * Creates new form FormActivity
     */
    public FormActivity() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Ingreso de Nueva Actividad");
        activityBus = new ActivityBus();
        list = new ArrayList<Activity>();
        loadActivity();
        searchActivity(2);
    }

    /*
     Función para cargar la tabla con los datos de la db 
     */
    public final void loadActivity() {
        String[] titles = {"Código", "Nombre"};
        modelo = new DefaultTableModel(null, titles);
        String[] row = new String[2];
        list = activityBus.list();

        for (Activity act : list) {
            row[0] = String.valueOf(act.getId());
            row[1] = act.getName();
            modelo.addRow(row);
        }

        tblActivity.setModel(modelo);
    }

    public void allocateTickets() {
        activity = new Activity();
        activity.setId(Integer.parseInt(txt_id.getText()));
        activity.setName(txt_nameActivity.getText());
        activity.setDetails(txt_description.getText());
    }

    public void insertActivity() {
        String rpta;
        allocateTickets();
        rpta = activityBus.InsertActivity(activity);

        if (rpta == null) {
            JOptionPane.showMessageDialog(null, "Actividad Ingresada con correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "Error el ingresar la actividad" + rpta);
        }
    }

    public void idActivity() {
        Integer id = activityBus.idActivity();
        txt_id.setText(String.valueOf(id));
    }

    public void searchActivity(Integer id) {

        try {
            activity = activityBus.get(id);

            if (activity.getId() != null) {
                txt_id.setText(String.valueOf(activity.getId()));
                txt_nameActivity.setText(activity.getName());
                txt_description.setText(activity.getDetails());
            } else {
                JOptionPane.showMessageDialog(null, "Actividad no encontrada");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos" + e);
        }

    }

    public void deleteActivity() {
        try {
            Integer id = Integer.parseInt(txt_id.getText());
            String rpta = activityBus.delete(id);
            if (rpta == null) {
                JOptionPane.showMessageDialog(null, "Actividad eliminada Correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar la actividad " + rpta);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar los datos " + e);
        }

    }

    public void updateActivity() {
        try {

            allocateTickets();
            String rpta = activityBus.update(activity);
            if (null != rpta) {
                JOptionPane.showMessageDialog(null, "Error al actualizar" + rpta);
            } else {
                JOptionPane.showMessageDialog(null, "Actividad actualizada correctamente");
            }

        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos " + e);
        }

    }

    public void cleanEntries() {
        txt_id.setText(null);
        txt_nameActivity.setText(null);
        txt_description.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_id = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_nameActivity = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txt_description = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblActivity = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Actividades");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Código");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 153, -1, -1));

        txt_id.setEnabled(false);
        jScrollPane1.setViewportView(txt_id);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, -1));

        jLabel2.setText("Nombre Actividad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 153, -1, -1));

        jScrollPane2.setViewportView(txt_nameActivity);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 300, -1));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 680, 20));

        jLabel7.setText("Descripción de Actividad");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, 20));

        txt_description.setColumns(20);
        txt_description.setRows(5);
        jScrollPane5.setViewportView(txt_description);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 680, -1));

        jLabel3.setBackground(new java.awt.Color(18, 233, 233));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/actividad_insert.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(""), "Opciones"));
        jPanel1.setLayout(null);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_nuevo.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 20, 50, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_save.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(73, 20, 50, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_close_1.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(233, 20, 50, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_edit.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(126, 20, 50, 30);

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_close.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);
        jButton5.setBounds(180, 20, 50, 30);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 690, 70));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_search.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 148, 60, -1));

        tblActivity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tblActivity.setToolTipText("");
        jScrollPane4.setViewportView(tblActivity);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 680, 120));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        cleanEntries();
        idActivity();
        option = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        option = false;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        deleteActivity();
        loadActivity();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (option == true) {
            insertActivity();
        } else {
            updateActivity();
        }

        loadActivity();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        Integer id = Integer.valueOf(JOptionPane.showInputDialog("Ingrese Código de Actividad"));
        searchActivity(id);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FormActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormActivity.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tblActivity;
    private javax.swing.JTextArea txt_description;
    private javax.swing.JTextPane txt_id;
    private javax.swing.JTextPane txt_nameActivity;
    // End of variables declaration//GEN-END:variables
}
