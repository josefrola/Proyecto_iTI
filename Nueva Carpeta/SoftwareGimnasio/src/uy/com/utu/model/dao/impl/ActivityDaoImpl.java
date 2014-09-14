/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.utu.model.dao.impl;

import uy.com.utu.cone.sql.ConectaDB;
import uy.com.utu.dto.Activity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uy.com.utu.Model.dao.ActivityDao;

/**
 *
 * @author jose
 */
public class ActivityDaoImpl implements ActivityDao {

    public ConectaDB db;

    public ActivityDaoImpl() {
        db = new ConectaDB();
    }

    /*
     creamos una lista para cargar el listadod e actividades 
     y los recorremos con un while
     */
    @Override
    public List<Activity> list() {
        List<Activity> list = null;
        String sql = "SELECT ID_ACTIVITY, NAME, DESCRIPTION FROM ACTIVITY";
        try {
            Connection cn = db.getConnection();
            PreparedStatement st = cn.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            list = new ArrayList<Activity>();
            while (rs.next()) {
                Activity a = new Activity();
                a.setId(rs.getInt(1));
                a.setName(rs.getString(2));
                a.setDetails(rs.getString(3));
                list.add(a);
            }

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return list;
    }

    /*
     función para insertar las actividades en la DB
     */
    @Override
    public String insert(Activity activity) {
        String result = null;
        String sql = "INSERT INTO ACTIVITY(NAME,DESCRIPTION)VALUES(?,?)";
        try {
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, activity.getName());
            ps.setString(2, activity.getDetails());
            ps.executeUpdate();
            ps.close();
            cn.close();

        } catch (SQLException e) {
            result = e.getMessage();
        }

        return result;
    }

    /*
     consultamos el ultimo id de la actividad ingresada en la base de datos
     */
    @Override
    public Integer idActivity() {
        Integer id = 0;
        String sql = "SELECT MAX(ID_ACTIVITY) + 1 AS CODE FROM ACTIVITY";
        try {
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt(1);
            }

            ps.close();
            cn.close();

        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }

        return id;

    }

    /*
     Query por id de actividad . 
     */
    @Override
    public Activity get(Integer id) {
        Activity activity = null;

        String sql = "SELECT ID_ACTIVITY, NAME, DESCRIPTION FROM ACTIVITY WHERE ID_ACTIVITY=?";
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            activity= new Activity();
            if(rs.next()){
               activity.setId(rs.getInt(1));
               activity.setName(rs.getString(2));
               activity.setDetails(rs.getString(3));
            }
            cn.close();
            ps.close();
            
            
        }catch(SQLException e){
            System.out.println("Error:" + e.getMessage());
        }
        
        return activity;
    }

    /*
     Eliminar una actividad solo se podra eliminar si no tiene datos asociados en la base de datos 
     */
    @Override
    public String delete(Integer id) {
        String result = null;
        String sql = "DELETE FROM ACTIVITY WHERE ID_ACTIVITY=?";
        try {
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            cn.close();
            ps.close();

        } catch (SQLException e) {
            result = e.getMessage();
        }
        return result;
    }

    @Override
    public String upadte(Activity activity) {
       String result=null;
       String sql="UPDATE ACTIVITY SET NAME=? , DESCRIPTION=? WHERE ID_ACTIVITY=?";
       try{
           Connection cn = db.getConnection();
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setString(1, activity.getName());
           ps.setString(2, activity.getDetails());
           ps.setInt(3, activity.getId());
           
           ps.executeUpdate();
           
           
           cn.close();
           ps.close();
           
       }catch(SQLException e){
         result = e.getMessage();
       }
       
       return result;
    }

}
