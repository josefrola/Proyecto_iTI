/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package uy.com.utu.model.dao.impl;
import uy.com.utu.cone.sql.ConectaDB;
import uy.com.utu.dto.SociosAll;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import uy.com.utu.Model.dao.SociosAllDao;
       

/**
 *
 * @author jose
 */
public class SociosAllImpl implements SociosAllDao{
   
    public ConectaDB db;
    
    
    public SociosAllImpl(){
        db= new ConectaDB();
    }

    @Override
    public List<SociosAll> list() {
       List<SociosAll>list=null;
       String sql="SELECT NAME,LAST_NAME,ADDRESS,PHONE,MOVILE FROM SOCIO";
       try{
           Connection cn = db.getConnection();
           PreparedStatement st = cn.prepareStatement(sql);
           ResultSet rs = st.executeQuery(sql);
           list = new ArrayList<SociosAll>();
           
           while(rs.next()){
               SociosAll s = new SociosAll();
               s.setNameSocio(rs.getString(1));
               s.setLastNameSocio(rs.getString(2));
               s.setAddress(rs.getString(3));
               s.setPhone(rs.getString(4));
               s.setMovile(rs.getString(5));
               list.add(s);
           }
           
       }catch(SQLException e){
           System.out.println("Error:" + e.getMessage());
       }
       
       return list;
    }

    @Override
    public String insert(SociosAll sociosall) {
       String result=null;
       String sql="INSERT INTO SOCIO(NAME,LAST_NAME,AGE,CI,SEXO,ADDRESS,PHONE,MOVILE,TYPE,ID_PLAN,ACTIVITY)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
       try{
          Connection cn = db.getConnection();
          PreparedStatement ps = cn.prepareStatement(sql);
          ps.setString(1, sociosall.getNameSocio());
          ps.setString(2, sociosall.getLastNameSocio());
          ps.setInt(3, sociosall.getAge());
          ps.setString(4, sociosall.getCI());
          ps.setInt(5, sociosall.getIdSexo());
          ps.setString(6, sociosall.getAddress());
          ps.setString(7, sociosall.getPhone());
          ps.setString(8, sociosall.getMovile());
          ps.setString(9, sociosall.getType());
          ps.setInt(10, sociosall.getIdPlan());
          ps.setString(11, sociosall.getActivity());
          ps.close();
          cn.close();
           
       }catch(SQLException e){
           result = e.getMessage();
       }
       
       return result;
    }

    @Override
    public Integer idSociosall() {
        Integer id =0;
        String sql="SELECT MAX(ID_SOCIO) + 1 AS ID_SOCIO FROM SOCIO";
        
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
                id=rs.getInt(1);
            }
            
            ps.close();
            cn.close();
            
        }catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        
        return id;
    }

    @Override
    public SociosAll get(Integer id) {
        SociosAll socioall= null;
        String sql="SELECT NAME,LAST_NAME,AGE,CI,SEXO,ADDRESS,PHONE,MOVILE,TYPE,ID_PLAN,ACTIVITY FROM SOCIO WHERE ID_SOCIO";
        try{
            Connection cn = db.getConnection();
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            socioall= new SociosAll();
            if(rs.next()){
                socioall.setNameSocio(rs.getString(1));
                socioall.setLastNameSocio(rs.getString(2));
                socioall.setAge(rs.getInt(3));
                socioall.setCI(rs.getString(4));
                socioall.setIdSexo(rs.getInt(5));
                socioall.setAddress(rs.getString(6));
                socioall.setPhone(rs.getString(7));
                socioall.setMovile(rs.getString(8));
                socioall.setType(rs.getString(9));
                socioall.setIdPlan(rs.getInt(10));
                socioall.setActivity(rs.getString(11));
                
            }
            
            cn.close();
            ps.close();
            
        }catch(SQLException e){
          System.out.println("Error: " + e.getMessage());  
        }
        
        return socioall;
    }

    @Override
    public String delete(Integer id) {
       String result = null;
       String sql="DELETE FROM SOCIO WHERE ID_SOCIO=? ";
       try{
           Connection cn=db.getConnection();
           PreparedStatement ps=cn.prepareStatement(sql);
           ps.setInt(1, id);
           ps.executeUpdate();           
       }catch(SQLException e){
           result=e.getMessage();
       }
       return result;
    }

    @Override
    public String update(SociosAll sociosall) {
       String resul=null;
       String sql="UPDATE SOCIO SET NAME=?, LAST_NAME=?, AGE=?, CI=?, SEXO=?, ADDRESS=?, PHONE=?, MOVILE=?,TYPE=?, ID_PLAN=?, ACTIVITY=? WHERE ID_SOCIO=?";
       try{
           
          Connection cn = db.getConnection();
          PreparedStatement ps = cn.prepareStatement(sql);
          ps.setString(1, sociosall.getNameSocio());
          ps.setString(2, sociosall.getLastNameSocio());
          ps.setInt(3, sociosall.getAge());
          ps.setString(4, sociosall.getCI());
          ps.setInt(5, sociosall.getIdSexo());
          ps.setString(6, sociosall.getAddress());
          ps.setString(7, sociosall.getPhone());
          ps.setString(8, sociosall.getMovile());
          ps.setString(9, sociosall.getType());
          ps.setInt(10, sociosall.getIdPlan());
          ps.setString(11, sociosall.getActivity());
          ps.close();
          cn.close();
           
       }catch(SQLException e){
           
       }
       return resul;
    }
}
