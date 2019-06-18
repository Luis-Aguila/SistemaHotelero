
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;
//Se crea la clase TipoHabitacion
public class TipoHabitacion {
    //Se definen los parametros y/o variables a utilizar
    int idtipohabitacion;
    String nombretipohabitacion;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();
//Se crea un constructor vacio
    public TipoHabitacion() {
    }
    //Constructor con parametros
    public TipoHabitacion(int idtipohabitacion, String nombretipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
        this.nombretipohabitacion = nombretipohabitacion;
    }
    //Se crean los set´s de las variables a utilizar
    public void setIdtipohabitacion(int idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
    }

    public void setNombretipohabitacion(String nombretipohabitacion) {
        this.nombretipohabitacion = nombretipohabitacion;
    }
    //Se crean los get´s de las variables a utilizar
    public int getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public String getNombretipohabitacion() {
        return nombretipohabitacion;
    }
    
        //Metodo de inserción
    public boolean insert(){
        con.executeUpdate("INSERT INTO tipohabitacion (idTipoHabitacion, nombreTipoHabitacion) VALUES (" + idtipohabitacion + ", '" + nombretipohabitacion + "')");
        return true;
    }
      //Método de eliminado  
    public void delete(){
        con.executeUpdate("DELETE FROM `tipohabitacion` WHERE `tipohabitacion`.`idTipoHabitacion` = "+idtipohabitacion+" ");
    }
     //Método de actualización   
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreTipoHabitacion = '"+nombretipohabitacion+"' WHERE idTipoHabitacion = "+idtipohabitacion+" ;");
    }
    
}
