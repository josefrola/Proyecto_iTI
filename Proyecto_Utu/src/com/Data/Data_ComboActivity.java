/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.Data;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;


/**
 *
 * @author jose
 */
public class Data_ComboActivity {
    
    DefaultComboBoxModel modelCombo = new DefaultComboBoxModel();
    
    
    
    public void LoadComboActivity() {
        try{
             Connection con = null;
          Class.forName("com.mysql.jdbc.Driver");
          con=DriverManager.getConnection("jdbc:mysql://localhost:3306", "root","uruguay");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("SELECT ID_ACTIVITY, NAME_ACTIVITY FROM ACTIVITY");
          
            
        }catch(ClassNotFoundException ex){
            Logger.getLogger(Data_ComboActivity.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(Data_ComboActivity.class.getName()).log(Level.SEVERE, null, ex);
        }
          
          
           
        
        
    }
    
    
}
