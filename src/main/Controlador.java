package main;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class Controlador {
    
    private static Conexion conexion;
        
    // Llama a "Conexión" para abrir una conexión con la BBDD de la ruta pasada
    
    public static void conectarBBDD(){
        
        try {
            conexion = new Conexion("C:/Users/Kazuto/Documents/NetBeansProjects/BBDD/bbdd.db");
            
        } catch (SQLException ex) {}
    }
    
    // Llama a 'QueryTable' con el nombre de la tabla y introduce el modelo de tabla que recibe en el JTable
    
    public static void cargarTabla(JTable tabla, String nombreTabla){
        
        tabla.setModel(conexion.QueryTable(nombreTabla, ""));
    }
    
    // Llama a 'QueryTable' con el nombre de la tabla y introduce el modelo de tabla que recibe en el JTable
    // Sobrecarga que envia una condicion (Where)
    
    public static void cargarTabla(JTable tabla, String nombreTabla, String condicion){
        
        tabla.setModel(conexion.QueryTable(nombreTabla, condicion));
    }
    
    // Manda un Query con el Nombre de la tabla y la condición de borrado. Muestra un mensaje del resultado.
    
    public static void borrarRow(JTable tabla){
        
        if (tabla.getSelectedRow() != -1){
            
            conexion.QueryUpdate(1, "HEROES", "WHERE CODIGO = " + tabla.getValueAt(tabla.getSelectedRow(), 0) + ";");
            cargarTabla(tabla, "HEROES");
            JOptionPane.showMessageDialog(null, "El heroe ha sido borrado correctamente");
        }
    }
    
    // Manda un Query con el Nombre de la tabla y la condición de añadido. Muestra un mensaje del resultado.
    
    public static void añadirRow(JTable tabla){
        
        conexion.QueryUpdate(2, "HEROES", "VALUES((SELECT MAX(CODIGO) + 1 FROM HEROES), '" 
                    + Main.tfNombre.getText() + "', " 
                    + Integer.valueOf(Main.tfVida.getText()) + ", " 
                    + Integer.valueOf(Main.tfDaño.getText()) + ");");
        cargarTabla(tabla, "HEROES");
        JOptionPane.showMessageDialog(null, "El heroe ha sido añadido correctamente");
    }
    
    // Manda un Query con el Nombre de la tabla y la condición de modificación. Muestra un mensaje del resultado.
    
    public static void actualizarRow(JTable tabla){
        
        if (tabla.getSelectedRow() != -1){
            
            conexion.QueryUpdate(3, "HEROES", "SET Nombre = '" 
                    + Main.tfNombre.getText() + "', Vida = " 
                    + Main.tfVida.getText() + ", Daño = " 
                    + Main.tfDaño.getText() + " WHERE CODIGO = " 
                    + tabla.getValueAt(tabla.getSelectedRow(), 0) + ";");
            cargarTabla(tabla, "HEROES");
            JOptionPane.showMessageDialog(null, "El heroe ha sido modificado correctamente");
        }
    }
}
