
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class TipoHabitacion {
    int idtipohabitacion;
    String nombretipohabitacion;
    private ClaseConneccion con = new ClaseConneccion();

    public TipoHabitacion() {
    }

    public TipoHabitacion(int idtipohabitacion, String nombretipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
        this.nombretipohabitacion = nombretipohabitacion;
    }

    public void setIdtipohabitacion(int idtipohabitacion) {
        this.idtipohabitacion = idtipohabitacion;
    }

    public void setNombretipohabitacion(String nombretipohabitacion) {
        this.nombretipohabitacion = nombretipohabitacion;
    }

    public int getIdtipohabitacion() {
        return idtipohabitacion;
    }

    public String getNombretipohabitacion() {
        return nombretipohabitacion;
    }
    
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO tipohabitacion (idTipoHabitacion, nombreTipoHabitacion) VALUES (" + idtipohabitacion + ", '" + nombretipohabitacion + "')");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `tipohabitacion` WHERE `tipohabitacion`.`idTipoHabitacion` = "+idtipohabitacion+" ");
    }
    
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreTipoHabitacion = '"+nombretipohabitacion+"' WHERE idTipoHabitacion = "+idtipohabitacion+" ;");
    }
    
}
