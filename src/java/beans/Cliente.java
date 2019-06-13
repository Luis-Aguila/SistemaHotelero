
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class Cliente {
    String rutcliente;
    String nombrecliente;
    String apellidocliente;
    String fonocliente;
    String emailcliente;
    private ClaseConneccion con = new ClaseConneccion();

    public Cliente(String rutcliente, String nombrecliente, String apellidocliente, String fonocliente, String emailcliente) {
        this.rutcliente = rutcliente;
        this.nombrecliente = nombrecliente;
        this.apellidocliente = apellidocliente;
        this.fonocliente = fonocliente;
        this.emailcliente = emailcliente;
    }

    public Cliente() {
    }
    
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

    public boolean insert(){
        con.executeUpdate("INSERT INTO cliente (rutCliente, nombreCliente, apellidoCliente, fonoCliente, emailCliente) VALUES ('" + rutcliente + "', '" + nombrecliente + "','" + apellidocliente + "', '" + fonocliente + "', '" + emailcliente + "')");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `cliente` WHERE `cliente`.`rutCliente` = '"+rutcliente+"'");
    }
    
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreCliente = '"+nombrecliente+"', apellidoCliente = '"+apellidocliente+"', fonoCliente = '"+fonocliente+"', emailCliente = '"+emailcliente+"' WHERE rutCliente = '"+rutcliente+"';");
    }
    
    
    
    
}
