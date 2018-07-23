/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import Model.User;
import com.dbconnection.Dbconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.Response;

/**
 *
 * @author Rahmican
 */
public class Userdao {
    public ArrayList<User> getid() {
        Dbconnection dbhelper = Dbconnection.getInstance();
        Connection conn = null;
        PreparedStatement ps = null;
        ArrayList<User> Id = new ArrayList<>();

        try {
            conn = dbhelper.getConnection();
            ps = conn.prepareStatement("select * from user ");

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User email = new User();
                email.setEmail(rs.getString("email"));

                Id.add(email);
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Userdao.class.getName()).log(Level.SEVERE, null, ex);

        } finally {
            if (conn != null) {
                dbhelper.closeConnection(conn);
            }
        }
        return Id;
    }
    
   
    public String Login (String Email, String Password){
        Dbconnection dbhelper = Dbconnection.getInstance();
        Connection conn = null;
        PreparedStatement ps = null;
       
       String email="";int flag=0;
        try {
            conn = dbhelper.getConnection();
            ps = conn.prepareStatement("select * from User where email=? and upassword=?");
            ps.setString(1, Email);
            ps.setString(2, Password);
            ResultSet rs = ps.executeQuery();
            
            
            while (rs.next()) {
                flag++;
                
                
                email=rs.getString("email");
                
            }
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(Userdao.class.getName()).log(Level.SEVERE, null, ex);
           
        } finally {
            if (conn != null) {
                dbhelper.closeConnection(conn);
            }
        }
        if(flag>0){
        return email;
        }
        else{
            return "false";
        }
    }
    }

