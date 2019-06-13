
package Data;

import java.sql.*;
public class ClaseConneccion {
    private Connection conexion = null;
    private String servidor = "localhost";
    private String database = "mejorando";
    private String usuario = "root";
    private String password = "";
    private String url = "";

    public ClaseConneccion(String servidor, String database, String usuario, String password) {
        try {

            this.servidor = servidor;
            this.database = database;

            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            url = "jdbc:mysql://" + servidor + "/" + database;
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        }
    }

    public ClaseConneccion() {
        try {

            this.servidor = servidor;
            this.database = database;

            Class.forName("com.mysql.jdbc.Driver");
            //Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            url = "jdbc:mysql://" + servidor + "/" + database;
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexion a Base de Datos " + url + " . . . . .Ok");

        } catch (SQLException ex) {
            System.out.println(ex);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (Exception e) {
            System.out.println( e.getMessage());
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void executeUpdate(String sql) {
        try {
            Statement s = (Statement) this.getConexion().createStatement();
            s.executeUpdate(sql);
            System.out.println("Ejecutado: " + sql);
        } catch (Exception e) {
            System.out.println("Error en: " + sql);
            System.out.println( e.getMessage());
        }
    }

    public ResultSet executeQuery(String sql) {
        ResultSet rs = null;
        try {

            Statement s = (Statement) this.getConexion().createStatement();
            rs = (ResultSet) s.executeQuery(sql);
            System.out.println("Ejecutado: " + sql);
        } catch (Exception e) {
            System.out.println("Error en: " + sql);
            System.out.println( e.getMessage());
        }
        return rs;
    }

    public Connection cerrarConexion() {
        try {
            conexion.close();
            System.out.println("Cerrando conexion a " + url + " . . . . . Ok");
        } catch (SQLException ex) {
             System.out.println("Error cierre de coneccion");
            System.out.println(ex); 
        } catch (Exception e) { 
             System.out.println("Error cierre de coneccion");
            System.out.println( e.getMessage());
        }
        conexion = null;
        return conexion;
    }
    
}

