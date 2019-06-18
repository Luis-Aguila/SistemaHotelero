
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;
//Se crea la clase Reserva_has_Habitacion
public class Reserva_has_Habitacion {
        //Se definen los parametros y/o variables a utilizar
    int idreserva;
    int numerohabitacion;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();
  //Se crea un constructor vacio
    public Reserva_has_Habitacion() {
    }
    //Constructor con parametros
    public Reserva_has_Habitacion(int idreserva, int numerohabitacion) {
        this.idreserva = idreserva;
        this.numerohabitacion = numerohabitacion;
    }
    //Se crean los set´s de las variables a utilizar
    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }
    //Se crean los get´s de las variables a utilizar
    public int getIdreserva() {
        return idreserva;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }
    
        //Metodo de inserción
    public boolean insert(){
        con.executeUpdate("INSERT INTO reserva_has_habitacion (	Reserva_idReserva, Habitacion_numeroHabitacion) VALUES (" + idreserva + ", " + numerohabitacion + ")");
        return true;
    }
    
    
    
}
