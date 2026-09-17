/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lissy
 */
public class VariablesCliente {
    
    private static String id_cliente;
    private static String nombre;
    private static String telefono;
    private static String email;
    private static String direccion;

    public static String getId_cliente() {
        return id_cliente;
    }

    public static void setId_cliente(String id_cliente) {
        VariablesCliente.id_cliente = id_cliente;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        VariablesCliente.nombre = nombre;
    }

    public static String getTelefono() {
        return telefono;
    }

    public static void setTelefono(String telefono) {
        VariablesCliente.telefono = telefono;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        VariablesCliente.email = email;
    }

    public static String getDireccion() {
        return direccion;
    }

    public static void setDireccion(String direccion) {
        VariablesCliente.direccion = direccion;
    }
}
