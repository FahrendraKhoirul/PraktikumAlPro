package modul.pkg10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String[]args) {
        try{
            String url ="jdbc:mysql://localhost/modul10";
            String user= "root";
            String pass= "";
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            stm = con.createStatement();
            System.out.println("Connect success... yeee");
        } catch (ClassNotFoundException | SQLException e){
            System.err.print("Gagal, " + e.getMessage());
        }
    }   
}
