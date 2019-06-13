
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class Reserva_has_Habitacion {
    int idreserva;
    int numerohabitacion;
    private ClaseConneccion con = new ClaseConneccion();

    public Reserva_has_Habitacion() {
    }

    public Reserva_has_Habitacion(int idreserva, int numerohabitacion) {
        this.idreserva = idreserva;
        this.numerohabitacion = numerohabitacion;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public void setNumerohabitacion(int numerohabitacion) {
        this.numerohabitacion = numerohabitacion;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public int getNumerohabitacion() {
        return numerohabitacion;
    }
    
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO reserva_has_habitacion (	Reserva_idReserva, Habitacion_numeroHabitacion) VALUES (" + idreserva + ", " + numerohabitacion + ")");
        return true;
    }
    
    
    
}
