/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author lissy
 */
public class conexionsql {
    
    Connection conn = null;
    
    String url = "jdbc:postgresql://localhost:5432/sistema_envios"; 
    
    String usuario = "postgres";
    
    String contraseña = "Mabeli1970"; // (O la contraseña que tengan en su postgres)
    
    public Connection conectar(){
            try {
                Class.forName("org.postgresql.Driver");
                conn = DriverManager.getConnection(url, usuario, contraseña);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al conectar BDD!!! " + e,
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            return conn;
    }
}