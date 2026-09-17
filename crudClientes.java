/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author lissy
 */
public class crudClientes {
    conexionsql con = new conexionsql();
    
    // --- INSERTAR ---
    public void InsertarCliente(String nombre, String telefono, String email, String direccion){
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "INSERT INTO clientes (nombre, telefono, email, direccion) "
                       + "VALUES ('" + nombre + "', '" + telefono + "', '" + email + "', '" + direccion + "')";
            
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "¡Cliente Almacenado Correctamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo guardar: " + e.getMessage(),
                    "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // --- ACTUALIZAR ---
    public void ActualizarCliente(String id_cliente, String nombre, String telefono, String email, String direccion){
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "UPDATE clientes SET nombre='" + nombre + "', telefono='" + telefono + "', "
                       + "email='" + email + "', direccion='" + direccion + "' "
                       + "WHERE id_cliente=" + id_cliente + ";";
            
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "¡Cliente Actualizado Correctamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo Actualizar: " + e.getMessage(),
                    "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // --- ELIMINAR ---
    public void EliminarCliente(String id_cliente){
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "DELETE FROM clientes WHERE id_cliente=" + id_cliente + ";";
            
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "¡Cliente Eliminado Correctamente!", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo Eliminar: " + e.getMessage(),
                    "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    // --- MOSTRAR / BUSCAR ---
    public void MostrarCliente(String idBusqueda){
        try {
            Connection conexion = con.conectar();
            java.sql.Statement st = conexion.createStatement();
            
            String sql = "SELECT * FROM clientes WHERE id_cliente = " + idBusqueda + ";";
            
            ResultSet rs = st.executeQuery(sql);
            
            if (rs.next()) {
                VariablesCliente.setId_cliente(rs.getString("id_cliente"));
                VariablesCliente.setNombre(rs.getString("nombre"));
                VariablesCliente.setTelefono(rs.getString("telefono"));
                VariablesCliente.setEmail(rs.getString("email"));
                VariablesCliente.setDireccion(rs.getString("direccion"));
            } else {
                VariablesCliente.setId_cliente("");
                VariablesCliente.setNombre("");
                VariablesCliente.setTelefono("");
                VariablesCliente.setEmail("");
                VariablesCliente.setDireccion("");
                JOptionPane.showMessageDialog(null, "No se encontró el cliente con ese ID.");
            }
            
            st.close();
            conexion.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al buscar el cliente: " + e.getMessage());
        }
    }
}
