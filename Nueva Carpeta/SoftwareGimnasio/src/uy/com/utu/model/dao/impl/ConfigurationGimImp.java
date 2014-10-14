/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.model.dao.impl;
import uy.com.utu.cone.sql.ConectaDB;
import uy.com.utu.dto.ConfigurationGim;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uy.com.utu.Model.dao.ConfigurationGimDao;


/**
 *
 * @author jose
 */
public class ConfigurationGimImp implements ConfigurationGimDao{
    
    public ConectaDB db;
    
    public ConfigurationGimImp(){
        db = new ConectaDB();
    }
    
    
    /*
    Funcion para cargar los datos en una lista 
    */
   @Override
    public List<ConfigurationGim> list() {
        List<ConfigurationGim> list = null;
        String sql ="SELECT ID_GYM, NAME, ADDRESS, PHONE FROM CONFIGURATION_GYM";
        try{
            Connection cn =db.getConnection();
            PreparedStatement st= cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            list= new ArrayList<ConfigurationGim>();
            while(rs.next()){
                ConfigurationGim gym = new ConfigurationGim();
                gym.setIdconfiguration(rs.getInt(1));
                gym.setNameGim(rs.getString(2));
                gym.setAddress(rs.getString(3));
                gym.setPhone(rs.getString(4));
                list.add(gym);
            }
            
        }catch(SQLException e){
          System.out.println("Error :" + e.getMessage());
        }
        
        return list;
    
    }
  

    /*
    Insertamos los datos en la tabla CONFIGURATION_GYM los pasamos por parametros.
    */
    @Override
    public String insert(ConfigurationGim configgim) {
        String result=null;
        String sql="INSERT INTO CONFIGURATION_GYM (NAME,ADDRESS,PHONE)VALUES(?,?,?)";
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, configgim.getNameGim());
            ps.setString(2, configgim.getAddress());
            ps.setString(3, configgim.getPhone());
            ps.executeUpdate();
            ps.close();
            cn.close();
                        
        }catch(SQLException e){
            result = e.getMessage();
            
        }
        return result;
    }
    
    /*
    Query para tomar el ultimo registro insertado en la tabla y le sumamos 1
    de esta manera mostramos el id a insertarse en el Form mas alla  que este id no se inserta 
    recordemos que la tabal es autonumerica. 
    */
    @Override
    public Integer idCongif() {
       Integer id = 0;
       String sql ="SELECT MAX(ID_GYM) + 1 AS CODIGO FROM CONFIGURATION_GYM";
       try{
           Connection cn = db.getConnection();
           PreparedStatement ps =cn.prepareStatement(sql);
           ResultSet rs= ps.executeQuery();
           
           if(rs.next()){
               id=rs.getInt(1);
           }
           
           ps.close();;
           cn.close();
           
       }catch(SQLException e){
           System.out.println("Error:" + e.getMessage());
       }
       
       return id;
    }
    
    
    /*
        Funcion para búcar datos por el id 
    */
    @Override
    public ConfigurationGim get(Integer id) {
        ConfigurationGim gym = null;
        String sql="SELECT ID_GYM,NAME,ADDRESS,PHONE FROM CONFIGURATION_GYM WHERE ID_GYM= ?";
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            gym = new ConfigurationGim();
            
            if(rs.next()){
                gym.setIdconfiguration(rs.getInt(1));
                gym.setNameGim(rs.getString(2));
                gym.setAddress(rs.getString(3));
                gym.setPhone(rs.getString(4));                
            }
            
            cn.close();
            ps.close();
                        
        }catch(SQLException e){
            System.out.println("Error:" + e.getMessage());
        }
        
        return gym;
    }
    
    /*
     Eliminamos los datos 
    */
    @Override
    public String delete(Integer id) {
       String result = null;
       String sql="DELETE FROM CONFIGURATION_GYM WHERE ID_GYM= ?";
       try{
           Connection cn = db.getConnection();
           PreparedStatement ps = cn.prepareStatement(sql);
           ps.setInt(1, id);
           ps.executeUpdate();
           
           cn.close();
           ps.close();
           
           
       }catch(SQLException e){
           result = e.getMessage();
       }
       
       return result;
    }
    
    /*
    Actualizar datos 
    */
    @Override
    public String update(ConfigurationGim configgim) {
        String result = null;
        String sql="UPADTE CONFIGURATION_GYM SET NAME=?, ADDRESS=?, PHONE=? WHERE ID_GYM= ?";
        try{
            
            Connection cn= db.getConnection();
            PreparedStatement ps= cn.prepareStatement(sql);
            ps.setString(1, configgim.getNameGim());
            ps.setString(2, configgim.getAddress());
            ps.setString(3, configgim.getPhone());
            ps.executeUpdate();
            cn.close();
            ps.close();
            
        }catch(SQLException e){
            
        }
        
        return result;
    }

    
    
    
    
}
