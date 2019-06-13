
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class Habitacion {
    int numerohabitacion;
    int preciohabitacion;
    int idtipohabitacion;
    int idtipocama;
    int idestadohabitacion;
    private ClaseConneccion con = new ClaseConneccion();

    public Habitacion() {
    }

    public Habitacion(int numerohabitacion, int preciohabitacion, int idtipohabitacion, int idtipocama, int idestadohabitacion) {
        this.numerohabitacion = numerohabitacion;
        this.preciohabitacion = preciohabitacion;
        this.idtipohabitacion = idtipohabitacion;
        this.idtipocama = idtipocama;
        this.idestadohabitacion = idestadohabitacion;
    }

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
    
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO habitacion (numeroHabitacion, precioHabitacion, TipoHabitacion_idTipoHabitacion, TipoCama_idTipoCama, EstadoHabitacion_idEstadoHabitacion ) VALUES (" + numerohabitacion + ", " + preciohabitacion + ", " + idtipohabitacion + ", " + idtipocama + ", "+idestadohabitacion+" )");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `habitacion` WHERE `habitacion`.`numeroHabitacion` = "+numerohabitacion+"");
    }
    
    public void update(){
        con.executeUpdate("UPDATE habitacion SET precioHabitacion = "+preciohabitacion+", TipoHabitacion_idTipoHabitacion = "+idtipohabitacion+", TipoCama_idTipoCama = "+idtipocama+", EstadoHabitacion_idEstadoHabitacion = "+idestadohabitacion+" WHERE numerohabitacion = "+numerohabitacion+";");
    }
    
    public void estadoreservado(){
        con.executeUpdate("UPDATE habitacion SET EstadoHabitacion_idEstadoHabitacion = "+idestadohabitacion+" WHERE numerohabitacion = "+numerohabitacion+";");
    }
    
    
    
}
