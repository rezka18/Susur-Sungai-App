/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class koneksi {
    private Connection con;

    public Connection getCon() {
        try {
            String url = "jdbc:mysql://localhost:3306/susursungai"; // Ganti dengan nama database Anda
            String user = "root"; // Username database
            String password = ""; // Password database
            if (con == null) {
                con = DriverManager.getConnection(url, user, password);
            }
            System.out.println("Koneksi Berhasil");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }
    
}
