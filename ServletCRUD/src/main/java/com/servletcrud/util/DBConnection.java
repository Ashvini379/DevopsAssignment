/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.servletcrud.util;
import java.sql.*;
/**
 *
 * @author Ashwini
 */
public class DBConnection {
   
       public  Connection  checkUser() {

      try{
       Connection con;
	 //loading drivers for mysql
         Class.forName("com.mysql.cj.jdbc.Driver");

 	 //creating connection with the database 
         con=DriverManager.getConnection
                        ("jdbc:mysql://localhost:3306/user","root","Root@2024");

        return con;   
      }catch(ClassNotFoundException | SQLException e)
      {
          e.printStackTrace();
      }
         return null;                 
  } 
}
