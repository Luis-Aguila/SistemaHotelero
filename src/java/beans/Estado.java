
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class Estado {
    int idestado;
    String nombreestado;
    private ClaseConneccion con = new ClaseConneccion();

    public Estado() {
    }

    public Estado(int idestado, String nombreestado) {
        this.idestado = idestado;
        this.nombreestado = nombreestado;
    }

    public void setIdestado(int idestado) {
        this.idestado = idestado;
    }

    public void setNombreestado(String nombreestado) {
        this.nombreestado = nombreestado;
    }

    public int getIdestado() {
        return idestado;
    }

    public String getNombreestado() {
        return nombreestado;
    }
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO estado (idEstado, nombreEstado) VALUES (" + idestado + ", '" + nombreestado + "')");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `estado` WHERE `estado`.`idEstado` = '"+idestado+"'");
    }
    
    public void update(){
        con.executeUpdate("UPDATE estado SET nombreEstado = '"+nombreestado+"' WHERE idEstado = '"+idestado+"';");
    }
    
    
}
