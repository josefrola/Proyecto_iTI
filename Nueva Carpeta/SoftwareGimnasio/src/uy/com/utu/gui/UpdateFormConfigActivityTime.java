/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.utu.gui;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import uy.com.utu.cone.sql.ConectaDB;
import uy.com.utu.dto.ConfigurationActivity;
import uy.com.utu.business.ConfigurationActivityBus;

/**
 *
 * @author jose
 */
public class UpdateFormConfigActivityTime extends javax.swing.JFrame {

    public ConfigurationActivity actconf;
    public ConfigurationActivityBus actcionfBus;

    /**
     * Creates new form UpdateFormConfigActivityTime
     */
    public UpdateFormConfigActivityTime() {
        initComponents();
        setLocationRelativeTo(null);
        this.setTitle("Actualizar Datos de Configuración de Actividades");
        this.selectAct.removeAllItems();
        this.SelectGimnasio.removeAllItems();
        this.selectsexo.removeAllItems();
        actcionfBus = new ConfigurationActivityBus();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtname = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SelectGimnasio = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        selectsexo = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        checkboxLunes = new javax.swing.JCheckBox();
        checkboxMartes = new javax.swing.JCheckBox();
        checkboxMiercoles = new javax.swing.JCheckBox();
        checkoxJueves = new javax.swing.JCheckBox();
        checkboxViernes = new javax.swing.JCheckBox();
        checkBoxSabado = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        selectAct = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txthora1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txthora2 = new javax.swing.JTextPane();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtcodigo = new javax.swing.JTextPane();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtcosto = new javax.swing.JTextPane();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane6 = new javax.swing.JScrollPane();
        txtedadhasta = new javax.swing.JTextPane();
        jScrollPane7 = new javax.swing.JScrollPane();
        txtedaddesde1 = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/jose/Imágenes/Imagenes Java/actualizar_plan.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        jLabel10.setText("Nombre Plan");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 70, 120, 20));

        jScrollPane3.setViewportView(txtname);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 260, -1));

        jLabel2.setText("Seleccion Actividad");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel3.setText("Gimnasio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 100, -1));

        SelectGimnasio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(SelectGimnasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 170, -1));

        jLabel4.setText("Sexo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 170, 20));

        selectsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(selectsexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 170, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkboxLunes.setText("Lunes");
        jPanel1.add(checkboxLunes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        checkboxMartes.setText("Martes");
        jPanel1.add(checkboxMartes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        checkboxMiercoles.setText("Miércoles");
        jPanel1.add(checkboxMiercoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, -1, -1));

        checkoxJueves.setText("Jueves");
        jPanel1.add(checkoxJueves, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, -1));

        checkboxViernes.setText("Viernes");
        jPanel1.add(checkboxViernes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        checkBoxSabado.setText("Sabados");
        jPanel1.add(checkBoxSabado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 470, 70));

        jLabel6.setText("Dias de Actividad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        selectAct.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        selectAct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectActActionPerformed(evt);
            }
        });
        getContentPane().add(selectAct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 180, -1));

        jLabel7.setText("Horas");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, 110, 20));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 450, -1));

        jLabel8.setText("Desde");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 50, 20));

        jLabel9.setText("Hasta");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, -1, 20));

        jScrollPane1.setViewportView(txthora1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, -1));

        jScrollPane2.setViewportView(txthora2);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 350, 110, -1));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_save.png"))); // NOI18N
        jButton3.setText("Guardar");
        jButton3.setToolTipText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 130, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_close_1.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.setToolTipText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 120, 40));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uy/com/utu/gui/icono_search.png"))); // NOI18N
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 60, 30));

        jLabel5.setText("Código");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, 20));

        txtcodigo.setEnabled(false);
        jScrollPane4.setViewportView(txtcodigo);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 80, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 450, 30));

        jLabel11.setText("Costo");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, 20));

        txtcosto.setBackground(new java.awt.Color(255, 153, 102));
        jScrollPane5.setViewportView(txtcosto);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 130, -1));

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 0));
        jLabel12.setText("Edades");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 240, 180, -1));

        jLabel13.setText("Desde");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 50, 20));

        jLabel14.setText("Hasta");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 50, 20));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 450, 20));

        jScrollPane6.setViewportView(txtedadhasta);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 270, 70, -1));

        jScrollPane7.setViewportView(txtedaddesde1);

        getContentPane().add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 270, 70, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectActActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectActActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_selectActActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        UpdateConfigActivity();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //String name = String.valueOf(JOptionPane.showInputDialog("Ingrese Nombre a Buscar"));
        try {

            String name = txtname.getText();
            actconf = SerachData(name);

            /*-----------dias --------------*/
            String Monday_check = "Lunes";
            String Tuesday_checl = "Martes";
            String Wednsesday_check = "Miercoles";
            String Thursday_check = "Jueves";
            String Friday_check = "Viernes";
            String Saterday_check = "Sabado";

            if (actconf.getId() != null) {
                txtcodigo.setText(String.valueOf(actconf.getId()));
                txtname.setText(String.valueOf(actconf.getNameconf()));
                Integer id_act = actconf.getId_activity();
                Integer id_gym = actconf.getId_Gym();
                Integer id_sexo = actconf.getId_sexo();
                txthora1.setText(String.valueOf(actconf.getFrom_time()));
                txthora2.setText(String.valueOf(actconf.getTime_to()));
                String Monday = actconf.getMonday();
                String Tuesday = actconf.getTuesday();
                String Wednsesday = actconf.getWednsesday();
                String Thursday = actconf.getThursday();
                String Friday = actconf.getFriday();
                String Saterday = actconf.getSaterday();
                txtcosto.setText(String.valueOf(actconf.getPrice()));
                txtedaddesde1.setText(String.valueOf(actconf.getEdadDesde()));
                txtedadhasta.setText(String.valueOf(actconf.getEddadHasta()));
                       

                if (Monday.equals(Monday_check)) {
                    checkboxLunes.setSelected(true);
                }
                if (Tuesday.equals(Tuesday_checl)) {
                    checkboxMartes.setSelected(true);
                }
                if (Wednsesday.equals(Wednsesday_check)) {
                    checkboxMiercoles.setSelected(true);
                }
                if (Thursday.equals(Thursday_check)) {
                    checkoxJueves.setSelected(true);
                }
                if (Friday.equals(Friday_check)) {
                    checkboxViernes.setSelected(true);
                }
                if (Saterday.equals(Saterday_check)) {
                    checkBoxSabado.setSelected(true);
                }

                SelectActivityConfig(id_act);
                SelectGymConfig(id_gym);
                SelectSexo(id_sexo);

            } else {
                JOptionPane.showMessageDialog(null, "Datos no encontrados");

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al cargar los datos");

        }

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
            java.util.logging.Logger.getLogger(UpdateFormConfigActivityTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateFormConfigActivityTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateFormConfigActivityTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateFormConfigActivityTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateFormConfigActivityTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox SelectGimnasio;
    private javax.swing.JCheckBox checkBoxSabado;
    private javax.swing.JCheckBox checkboxLunes;
    private javax.swing.JCheckBox checkboxMartes;
    private javax.swing.JCheckBox checkboxMiercoles;
    private javax.swing.JCheckBox checkboxViernes;
    private javax.swing.JCheckBox checkoxJueves;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JComboBox selectAct;
    private javax.swing.JComboBox selectsexo;
    private javax.swing.JTextPane txtcodigo;
    private javax.swing.JTextPane txtcosto;
    private javax.swing.JTextPane txtedaddesde1;
    private javax.swing.JTextPane txtedadhasta;
    private javax.swing.JTextPane txthora1;
    private javax.swing.JTextPane txthora2;
    private javax.swing.JTextPane txtname;
    // End of variables declaration//GEN-END:variables

    public ConfigurationActivity SerachData(String name) {

        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT ID,NAME,ID_ACTIVITY,ID_GYM,ID_SEXO,FROM_TIME,TIME_TO,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,PRICE,AGE_FROM,AGE_TO FROM CONFIGURATION_ACTIVITY WHERE NAME= ?";
        try {
            PreparedStatement sqls = conn.prepareStatement(sql);
            sqls.setString(1, name);
            rs = sqls.executeQuery();
            actconf = new ConfigurationActivity();
            if (rs.next()) {
                actconf.setId(rs.getInt(1));
                actconf.setNameconf(rs.getString(2));
                actconf.setId_activity(rs.getInt(3));
                actconf.setId_Gym(rs.getInt(4));
                actconf.setId_sexo(rs.getInt(5));
                actconf.setFrom_time(rs.getString(6));
                actconf.setTime_to(rs.getString(7));
                actconf.setMonday(rs.getString(8));
                actconf.setTuesday(rs.getString(9));
                actconf.setWednsesday(rs.getString(10));
                actconf.setThursday(rs.getString(11));
                actconf.setFriday(rs.getString(12));
                actconf.setSaterday(rs.getString(13));
                actconf.setPrice(rs.getFloat(14));
                actconf.setEdadDesde(rs.getInt(15));
                actconf.setEddadHasta(rs.getInt(16));
            }

            conn.close();
            sqls.close();

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actconf;
    }

    public void SelectActivityConfig(Integer idact) {
        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT NAME FROM ACTIVITY ORDER BY ID_ACTIVITY= ? DESC";
        try {
            PreparedStatement sqls = conn.prepareStatement(sql);
            sqls.setInt(1, idact);
            rs = sqls.executeQuery();
            while (rs.next()) {
                this.selectAct.addItem(rs.getString("NAME"));
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

    public void SelectGymConfig(Integer idgym) {
        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT NAME FROM CONFIGURATION_GYM ORDER BY ID_GYM=? DESC";
        try {
            PreparedStatement sqls = conn.prepareStatement(sql);
            sqls.setInt(1, idgym);
            rs = sqls.executeQuery();
            while (rs.next()) {
                this.SelectGimnasio.addItem(rs.getString("NAME"));
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void SelectSexo(Integer idsexo) {
        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT NAME_SEXO FROM SEXO ORDER BY ID_SEXO=? DESC";
        try {
            PreparedStatement sqls = conn.prepareStatement(sql);
            sqls.setInt(1, idsexo);
            rs = sqls.executeQuery();
            while (rs.next()) {
                this.selectsexo.addItem(rs.getString("NAME_SEXO"));
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }

    private void UpdateConfigActivity() {
        try {

            String spta;
            alldataTicket();
            spta = actcionfBus.Update(actconf);
             
           if(null != spta){
              JOptionPane.showMessageDialog(null, "Error al Actualizar los datos");
           } else{
               JOptionPane.showMessageDialog(null, "Se Actualizarón correctamente  los datos ");
           }
            
        }catch(HeadlessException e){
          JOptionPane.showMessageDialog(null, "Error al actualizar los datos " + e);  
        }

    }

    private void alldataTicket() {
        actconf = new ConfigurationActivity();

        String Selectedact = (String) selectAct.getSelectedItem();
        String selectednamegym = (String) SelectGimnasio.getSelectedItem();
        String selectsexoid = (String) selectsexo.getSelectedItem();

        Integer id_act = 0;
        Integer id_gym = 0;
        Integer id_sexo = 0;

        try {
            id_act = ReturnIdActy(Selectedact);            
            id_gym = ReturnIdGyn(selectednamegym);
            id_sexo = ReturnIdSexo(selectsexoid);

            //variables
            String Monday = "";
            String Tuesday = "";
            String Wednsesday = "";
            String Thursday = "";
            String Friday = "";
            String Saterday = "";

            if (checkboxLunes.isSelected() == true) {
                Monday = "Lunes";
            }
            if (checkboxMartes.isSelected() == true) {
                Tuesday = "Martes";
            }
            if (checkboxMiercoles.isSelected() == true) {
                Wednsesday = "Miercoles";
            }
            if (checkoxJueves.isSelected() == true) {
                Thursday = "Jueves";
            }
            if (checkboxViernes.isSelected() == true) {
                Friday = "Viernes";
            }
            if (checkBoxSabado.isSelected() == true) {
                Saterday = "Sabado";
            }

            actconf.setId(Integer.parseInt(txtcodigo.getText()));
            actconf.setNameconf(txtname.getText());
            actconf.setId_activity(id_act);
            actconf.setId_Gym(id_gym);
            actconf.setId_sexo(id_sexo);
            actconf.setFrom_time(txthora1.getText());
            actconf.setTime_to(txthora2.getText());
            actconf.setMonday(Monday);
            actconf.setTuesday(Tuesday);
            actconf.setWednsesday(Wednsesday);
            actconf.setThursday(Thursday);
            actconf.setFriday(Friday);
            actconf.setSaterday(Saterday);
            actconf.setPrice(Float.parseFloat(txtcosto.getText()));
            actconf.setEdadDesde(Integer.parseInt(txtedaddesde1.getText()));
            actconf.setEddadHasta(Integer.parseInt(txtedadhasta.getText()));

        } catch (SQLException ex) {
            Logger.getLogger(ActivitiesTimetable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Integer ReturnIdActy(String Selectedact) throws SQLException {
        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT ID_ACTIVITY FROM ACTIVITY WHERE NAME= ?";

        PreparedStatement sqls = conn.prepareStatement(sql);
        sqls.setString(1, Selectedact);
        rs = sqls.executeQuery();
        Integer return_id = 0;
        while (rs.next()) {
            return_id = rs.getInt("ID_ACTIVITY");
        }
        return return_id;
    }

    private Integer ReturnIdGyn(String selectednamegym) throws SQLException {
        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT ID_GYM FROM CONFIGURATION_GYM WHERE NAME= ?";
        PreparedStatement sqls = conn.prepareStatement(sql);
        sqls.setString(1, selectednamegym);
        rs = sqls.executeQuery();
        Integer return_idgym = 0;
        while (rs.next()) {
            return_idgym = rs.getInt("ID_GYM");
        }
        return return_idgym;
    }

    private Integer ReturnIdSexo(String selectsexoid) throws SQLException {
        ConectaDB con = new ConectaDB();
        Connection conn = con.getConnection();
        ResultSet rs;
        String sql = "SELECT ID_SEXO FROM SEXO WHERE NAME_SEXO=?";
        PreparedStatement sqls = conn.prepareStatement(sql);
        sqls.setString(1, selectsexoid);
        rs = sqls.executeQuery();
        Integer idSexo = 0;
        while (rs.next()) {
            idSexo = rs.getInt("ID_SEXO");
        }
        return idSexo;
    }

}
