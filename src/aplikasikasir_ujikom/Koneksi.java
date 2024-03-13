/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikasir_ujikom;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Koneksi {
    Connection Koneksi=null;
    
    public static Connection koneksiDB(){
         try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection Koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/kasir_amelia", "root", "");
            return Koneksi;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Tidak terkoneksi ke database");
            return null;
        }
    } 
}
