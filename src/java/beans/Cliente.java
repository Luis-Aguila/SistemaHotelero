
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;
//Se crea la clase Usuario
public class Cliente {
    //Se definen los parametros y/o variables a utilizar
    String rutcliente;
    String nombrecliente;
    String apellidocliente;
    String fonocliente;
    String emailcliente;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();
    //Constructor con parametros
    public Cliente(String rutcliente, String nombrecliente, String apellidocliente, String fonocliente, String emailcliente) {
        this.rutcliente = rutcliente;
        this.nombrecliente = nombrecliente;
        this.apellidocliente = apellidocliente;
        this.fonocliente = fonocliente;
        this.emailcliente = emailcliente;
    }
    //Se crea un constructor vacio
    public Cliente() {
    }
    //Se crean los set´s de las variables a utilizar
    public void setRutcliente(String rutcliente) {
        this.rutcliente = rutcliente;
    }

    public void setNombrecliente(String nombrecliente) {
        this.nombrecliente = nombrecliente;
    }

    public void setApellidocliente(String apellidocliente) {
        this.apellidocliente = apellidocliente;
    }

    public void setFonocliente(String fonocliente) {
        this.fonocliente = fonocliente;
    }

    public void setEmailcliente(String emailcliente) {
        this.emailcliente = emailcliente;
    }
    //Se crean los get´s de las variables a utilizar
    public String getRutcliente() {
        return rutcliente;
    }

    public String getNombrecliente() {
        return nombrecliente;
    }

    public String getApellidocliente() {
        return apellidocliente;
    }

    public String getFonocliente() {
        return fonocliente;
    }

    public String getEmailcliente() {
        return emailcliente;
    }
    //Metodo de inserción
    public boolean insert(){
        con.executeUpdate("INSERT INTO cliente (rutCliente, nombreCliente, apellidoCliente, fonoCliente, emailCliente) VALUES ('" + rutcliente + "', '" + nombrecliente + "','" + apellidocliente + "', '" + fonocliente + "', '" + emailcliente + "')");
        return true;
    }
        //Método de eliminado
    public void delete(){
        con.executeUpdate("DELETE FROM `cliente` WHERE `cliente`.`rutCliente` = '"+rutcliente+"'");
    }
        //Método de actualización
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreCliente = '"+nombrecliente+"', apellidoCliente = '"+apellidocliente+"', fonoCliente = '"+fonocliente+"', emailCliente = '"+emailcliente+"' WHERE rutCliente = '"+rutcliente+"';");
    }
    
    
    
    
}
