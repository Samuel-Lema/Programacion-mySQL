package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class Conexion {
    
    private final Connection conexion;
    private final Statement prep;
    private ResultSet consulta;
    
    /**
     * Genera una conexión con la BBDD y trabaja con ella.
     * @param ruta aquí se le pasa la ruta a la BBDD para que inicie la conexión
     * @throws SQLException
     */
    public Conexion(String ruta) throws SQLException {
        
        conexion = DriverManager.getConnection("jdbc:sqlite:" + ruta);
        prep = conexion.createStatement();
    }
    
    /**
     * Ejecuta las sentencias que se le pasen por parametro
     * @param query Aquí recoge la sentencia SQL
     */
    public void Query(String query){
        
        try {
            consulta = prep.executeQuery(query);

        } catch (SQLException ex) {}
    }
    
    /**
     * Agrupa un query ségun los parametros dados para su posterior ejecución
     * @param modo Reconoce si es un DELETE, INSERT, O UPDATE de cada sentencia según el nº pasado.
     * @param nombreTabla Aquí se le pasa el nombre de la tabla de la BBDD a ejecutar en la sentencia.
     * @param condicion Aquí se le pasa la sentencia WHERE para hacer condiciones en el query a ejecutar
     */
    public void QueryUpdate(int modo, String nombreTabla, String condicion){

        try {
            switch(modo){
                case 1: prep.executeUpdate("DELETE FROM " + nombreTabla + " " + condicion);
                case 2: prep.executeUpdate("INSERT INTO " + nombreTabla + " " + condicion);
                case 3: prep.executeUpdate("UPDATE " + nombreTabla + " " + condicion);
            }
            
        } catch (SQLException ex) {}
    }
    
    /**
     * Función exclusiva para rellenar un JTable segun el query que genere, solo admite SELECT.
     * @param nombreTabla Aquí se le pasa el nombre de la tabla de la BBDD a ejecutar en la sentencia.
     * @param condicion Aquí se le pasa la sentencia WHERE para hacer condiciones en el query a ejecutar
     * @return Delvuelve un modelo de JTable
     */
    public DefaultTableModel QueryTable(String nombreTabla, String condicion){
        
        Query("SELECT * FROM " + nombreTabla + " " + condicion + ";");
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("Código");
        model.addColumn("Nombre");
        model.addColumn("Vida");
        model.addColumn("Daño");
        
        try {
            
            while(consulta.next()){
                Vector row = new Vector();
                row.add(consulta.getInt(1));
                row.add(consulta.getString(2));
                row.add(consulta.getInt(3));
                row.add(consulta.getInt(4));
                model.addRow(row);
            }
        } catch (SQLException ex) {}
            
        return model;
    }
    
    
}
