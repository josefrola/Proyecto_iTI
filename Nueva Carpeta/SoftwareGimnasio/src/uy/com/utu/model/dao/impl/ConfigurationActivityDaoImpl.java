/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.utu.model.dao.impl;

import uy.com.utu.cone.sql.ConectaDB;
import uy.com.utu.dto.ConfigurationActivity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uy.com.utu.Model.dao.ConfigurationActivityDaysDao;

/**
 *
 * @author jose
 */
public class ConfigurationActivityDaoImpl implements ConfigurationActivityDaysDao {

    public ConectaDB db;

    public ConfigurationActivityDaoImpl() {
        db = new ConectaDB();
    }

    @Override
    public List<ConfigurationActivity> list() {
        List<ConfigurationActivity> list = null;
        /*String sql = "SELECT CA.ID, CA.NAME, A.NAME, G.NAME, S.NAME_SEXO, CA.FROM_TIME, CA.TIME_TO, CA.MONDAY, CA.TUESDAY, CA.WEDNESDAY,"
                + " CA.THURSDAY, CA.FRIDAY, CA.SATURDAY FROM CONFIGURATION_ACTIVITY AS CA INNER JOIN ACTIVITY AS A ON "
                + "CA.ID_ACTIVITY=A.ID_ACTIVITY INNER JOIN CONFIGURATION_GYM AS G ON CA.ID_GYM=G.ID_GYM INNER JOIN SEXO AS S ON "
                + "CA.ID_SEXO=S.ID_SEXO";*/
        String sql="SELECT NAME, FROM_TIME, TIME_TO, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY,PRICE FROM CONFIGURATION_ACTIVITY";
        try {
            Connection cn = db.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            list = new ArrayList<ConfigurationActivity>();
            while (rs.next()) {
                ConfigurationActivity co = new ConfigurationActivity();
                co.setNameconf(rs.getString(1));               
                co.setFrom_time(rs.getString(2));
                co.setTime_to(rs.getString(3));
                co.setMonday(rs.getString(4));
                co.setTuesday(rs.getString(5));
                co.setWednsesday(rs.getString(6));
                co.setThursday(rs.getString(7));
                co.setFriday(rs.getString(8));
                co.setSaterday(rs.getString(9));
                co.setPrice(rs.getFloat(10));
                list.add(co);                
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        
        return list;
    }

    @Override
    public String insert(ConfigurationActivity actConf) {
        String result = null;
        String sql = "INSERT INTO CONFIGURATION_ACTIVITY (NAME,ID_ACTIVITY,ID_GYM,ID_SEXO,FROM_TIME,TIME_TO,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,PRICE,AGE_FROM,AGE_TO)VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {

            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, actConf.getNameconf());
            ps.setInt(2, actConf.getId_activity());
            ps.setInt(3, actConf.getId_Gym());
            ps.setInt(4, actConf.getId_sexo());
            ps.setString(5, actConf.getFrom_time());
            ps.setString(6, actConf.getTime_to());
            ps.setString(7, actConf.getMonday());
            ps.setString(8, actConf.getTuesday());
            ps.setString(9, actConf.getWednsesday());
            ps.setString(10, actConf.getThursday());
            ps.setString(11, actConf.getFriday());
            ps.setString(12, actConf.getSaterday());
            ps.setFloat(13, actConf.getPrice());
            ps.setInt(14, actConf.getEdadDesde());
            ps.setInt(15, actConf.getEddadHasta());
            ps.executeUpdate();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            result = e.getMessage();
        }
        return result;
    }

    @Override
    public Integer idConAct() {
        Integer id = 0;
        String sql="SELECT MAX(ID) + 1 AS CODE FROM CONFIGURATION_ACTIVITY";
        try{
          Connection cn = db.getConnection();
          PreparedStatement ps = cn.prepareStatement(sql);
          ResultSet rs=ps.executeQuery();
          
          if(rs.next()){
              id=rs.getInt(1);
          }
          ps.close();
          cn.close();         
          
        } catch (SQLException e) {
           System.out.println("Error:" + e.getMessage()); 
        }        
        return id;
    }

    @Override
    public ConfigurationActivity get(Integer id) {
        
        ConfigurationActivity actco= null;
        
        String sql="SELECT ID,NAME,ID_ACTIVITY,ID_GYM,ID_SEXO,FROM_TIME,TIME_TO,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,PRICE FROM CONFIGURATION_ACTIVITY WHERE ID=?";
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
             actco = new ConfigurationActivity();
            if(rs.next()){
                actco.setId(rs.getInt(1));
                actco.setNameconf(rs.getString(2));
                actco.setId_activity(rs.getInt(3));
                actco.setId_Gym(rs.getInt(4));
                actco.setId_sexo(rs.getInt(5) );
                actco.setFrom_time(rs.getString(6));
                actco.setTime_to(rs.getString(7));
                actco.setMonday(rs.getString(8));
                actco.setTuesday(rs.getString(9));
                actco.setWednsesday(rs.getString(10));
                actco.setWednsesday(rs.getString(11));
                actco.setFriday(rs.getString(12));
                actco.setSaterday(rs.getString(13)); 
                actco.setPrice(rs.getFloat(14));
            }
            
            cn.close();
            ps.close();
            
         }catch(SQLException e){
           System.out.println("Error:" + e.getMessage());  
         }        
         return actco;    
    }
    
    

    @Override
    public String delete(Integer id) {
        String result = null;
        String sql="DELETE FROM CONFIGURATION_ACTIVITY WHERE ID=?";
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            cn.close();
            
        }catch (SQLException e){
          result = e.getMessage();  
        }
        
        return result;
    }

    @Override
    public String update(ConfigurationActivity config) {
        String result=null;
        String sql=" UPDATE CONFIGURATION_ACTIVITY SET NAME=?, ID_ACTIVITY=?, ID_GYM=?, ID_SEXO=?, FROM_TIME=?, TIME_TO=?, MONDAY=?,TUESDAY=?, WEDNESDAY=?, THURSDAY=?, FRIDAY=?, SATURDAY= ?, PRICE= ?, AGE_FROM= ?, AGE_TO= ?   WHERE ID= ?";
        
        try{
             Connection cn = db.getConnection();
             PreparedStatement ps=cn.prepareStatement(sql);
             
            ps.setString(1, config.getNameconf());
            ps.setInt(2, config.getId_activity());
            ps.setInt(3, config.getId_Gym());
            ps.setInt(4, config.getId_sexo());
            ps.setString(5, config.getFrom_time());
            ps.setString(6, config.getTime_to());
            ps.setString(7, config.getMonday());
            ps.setString(8, config.getTuesday());
            ps.setString(9, config.getWednsesday());
            ps.setString(10, config.getThursday());
            ps.setString(11, config.getFriday());
            ps.setString(12, config.getSaterday());            
            ps.setFloat(13, config.getPrice());
            ps.setInt(14, config.getEdadDesde());
            ps.setInt(15, config.getEddadHasta());
            ps.setInt(16, config.getId());
            ps.executeUpdate();
            cn.close();
            ps.close();
            
        }catch(SQLException e){
           result = e.getMessage(); 
        }
        
        return result;
    }
    
  


}
