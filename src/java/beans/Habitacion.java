
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;
//Se crea la clase Habitacion
public class Habitacion {
    //Se definen los parametros y/o variables a utilizar
    int numerohabitacion;
    int preciohabitacion;
    int idtipohabitacion;
    int idtipocama;
    int idestadohabitacion;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();
    //Se crea un constructor vacio
    public Habitacion() {
    }
    //Constructor con parametros
    public Habitacion(int numerohabitacion, int preciohabitacion, int idtipohabitacion, int idtipocama, int idestadohabitacion) {
        this.numerohabitacion = numerohabitacion;
        this.preciohabitacion = preciohabitacion;
        this.idtipohabitacion = idtipohabitacion;
        this.idtipocama = idtipocama;
        this.idestadohabitacion = idestadohabitacion;
    }
    //Se crean los set´s de las variables a utilizar
    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public void setPreciohabitacion(int preciohabitacion) {
        this.preciohabitacion = preciohabitacion;
    }

    public void setIdtipohabitacion(int idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
    }

    public void setIdtipocama(int idtipocama) {
        this.idtipocama = idtipocama;
    }

    public void setIdestadohabitacion(int idestadohabitacion) {
        this.idestadohabitacion = idestadohabitacion;
    }
    
    
   //Se crean los get´s de las variables a utilizar
    public int getNumerohabitacion() {
        return numerohabitacion;
    }

    public int getPreciohabitacion() {
        return preciohabitacion;
    }

    public int getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public int getIdtipocama() {
        return idtipocama;
    }

    public int getIdestadohabitacion() {
        return idestadohabitacion;
    }
    
    //Metodo de inserción   
    public boolean insert(){
        con.executeUpdate("INSERT INTO habitacion (numeroHabitacion, precioHabitacion, TipoHabitacion_idTipoHabitacion, TipoCama_idTipoCama, EstadoHabitacion_idEstadoHabitacion ) VALUES (" + numerohabitacion + ", " + preciohabitacion + ", " + idtipohabitacion + ", " + idtipocama + ", "+idestadohabitacion+" )");
        return true;
    }
       //Método de eliminado 
    public void delete(){
        con.executeUpdate("DELETE FROM `habitacion` WHERE `habitacion`.`numeroHabitacion` = "+numerohabitacion+"");
    }
        //Método de actualización
    public void update(){
        con.executeUpdate("UPDATE habitacion SET precioHabitacion = "+preciohabitacion+", TipoHabitacion_idTipoHabitacion = "+idtipohabitacion+", TipoCama_idTipoCama = "+idtipocama+", EstadoHabitacion_idEstadoHabitacion = "+idestadohabitacion+" WHERE numerohabitacion = "+numerohabitacion+";");
    }
        //Método de actualización de estado
    public void estadoreservado(){
        con.executeUpdate("UPDATE habitacion SET EstadoHabitacion_idEstadoHabitacion = "+idestadohabitacion+" WHERE numerohabitacion = "+numerohabitacion+";");
    }
    
    
    
}
