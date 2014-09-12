/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Data;

import java.sql.*;
import java.util.Vector;
import com.Business.Business_Activity;

/**
 *
 * @author jose
 */
public class DataConnexion {

    /*
     atributos de la clase
     */
    private static Connection con;
    private static DataConnexion INSTANCE = null;


    /*
     constructor
     */
    private DataConnexion() {

    }

    /*
     datos de la conexion 
     */
   public static void ConnectionDb() {
        String host = "localhost:3306";
        String user = "root";
        String pass = "uruguay";
        String dbname = "PROYECT_UTU";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            String newConnectionURL = "jdbc:mysql://" + host + "/" + dbname
                    + "?" + "user=" + user + "&password=" + pass;
            con = DriverManager.getConnection(newConnectionURL);
        } catch (Exception e) {
            System.out.println("Error en l'obertura de la connexió.");
        }
    }

    /*
     crea una instanacia de conexion 
     */
    private synchronized static void createInstance() {
        if (INSTANCE == null) {
            INSTANCE = new DataConnexion();
            ConnectionDb();
        }
    }

    /*
     metodo para obtener la instancia si existe la retorno en caso contrario la creo 
     @retrun instances si existe
     */
    public static DataConnexion getInstance() {
         if (INSTANCE == null) createInstance();
	        return INSTANCE;
    }

    /*
     metodo para cerrar la conexion
     */
    public void closeConnection() {
        try {

        } catch (Exception e) {
            System.out.println("Error al cerra la conexion");
        }
    }

    /*public static Vector<Business_Activity> LoadData() {
        Vector<Business_Activity> act = new Vector<>();
        Business_Activity cb = null;

        try {
            PreparedStatement ps = con.prepareStatement("SELECT ID_ACTIVITY, NAME_ACTIVITY FROM ACTIVITY");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                cb = new Business_Activity();
                cb.setId(rs.getInt(1));
                cb.setName(rs.getString(2));
                act.add(cb);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return act;

    }*/

}
