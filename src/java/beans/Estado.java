
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;
//Se crea la clase Estado
public class Estado {
    //Se definen los parametros y/o variables a utilizar
    int idestado;
    String nombreestado;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();
    //Se crea un constructor vacio
    public Estado() {
    }
    //Constructor con parametros
    public Estado(int idestado, String nombreestado) {
        this.idestado = idestado;
        this.nombreestado = nombreestado;
    }
    //Se crean los set´s de las variables a utilizar
    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public void setNombreestado(String nombreestado) {
        this.nombreestado = nombreestado;
    }
    //Se crean los get´s de las variables a utilizar
    public int getIdestado() {
        return idestado;
    }

    public String getNombreestado() {
        return nombreestado;
    }
      //Metodo de inserción  
    public boolean insert(){
        con.executeUpdate("INSERT INTO estado (idEstado, nombreEstado) VALUES (" + idestado + ", '" + nombreestado + "')");
        return true;
    }
        //Método de eliminado
    public void delete(){
        con.executeUpdate("DELETE FROM `estado` WHERE `estado`.`idEstado` = '"+idestado+"'");
    }
        //Método de actualización
    public void update(){
        con.executeUpdate("UPDATE estado SET nombreEstado = '"+nombreestado+"' WHERE idEstado = '"+idestado+"';");
    }
    
    
}
