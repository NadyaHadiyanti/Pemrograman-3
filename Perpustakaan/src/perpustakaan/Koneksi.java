/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perpustakaan;
import com.mysql.jdbc.Connection;
import java.sql.*;


/**
 *
 * @author NadiaRezaSavira
 */
public class Koneksi {
   
    public Connection getKoneksi() {
        Connection kon = null;
        Statement stmt = null;
        ResultSet rslt = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            kon = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/perpus", "root", "");
            System.out.println("Berhasil Koneksi");
            return kon;
        } catch (Exception e) {
            System.out.println("Gagal Koneksi"+e.getMessage()); 
            return kon = null;
        }
    }
    
    public static void main(String[] args) {
        Koneksi konek = new Koneksi();
        konek.getKoneksi();
    }
}
