/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Asyst
 */
public class KoneksiDB {
    /**
     * @param args the command line arguments
     */
    public static Connection con;
    public static Statement stm;
    public static Connection getKoneksi(){
        try {
            String url ="jdbc:mysql://localhost/purchasing";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
        
        return con;
    }   
}
