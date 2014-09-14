/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.utu.cone.sql;

import java.sql.*;

/**
 *
 * @author jose
 */
public class ConectaDB {
    


    

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/PROYECT_UTU", "root", "uruguay");
            System.out.println("Conexion Establecida");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectarse a la Base de datos" + e);
        }
        return con;
    }

   
}
