
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class Usuario {
    String rutusuario;
    String nombreusuario;
    String apellidousuario;
    String emailusuario;
    String passwordusuario;
    private ClaseConneccion con = new ClaseConneccion();

    public Usuario() {
    }

    public Usuario(String rutusuario, String nombreusuario, String apellidousuario, String emailusuario, String passwordusuario) {
        this.rutusuario = rutusuario;
        this.nombreusuario = nombreusuario;
        this.apellidousuario = apellidousuario;
        this.emailusuario = emailusuario;
        this.passwordusuario = passwordusuario;
    }

    public void setRutusuario(String rutusuario) {
        this.rutusuario = rutusuario;
    }

    public void setNombreusuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public void setApellidousuario(String apellidousuario) {
        this.apellidousuario = apellidousuario;
    }

    public void setEmailusuario(String emailusuario) {
        this.emailusuario = emailusuario;
    }

    public void setPasswordusuario(String passwordusuario) {
        this.passwordusuario = passwordusuario;
    }

    public String getRutusuario() {
        return rutusuario;
    }

    public String getNombreusuario() {
        return nombreusuario;
    }

    public String getApellidousuario() {
        return apellidousuario;
    }

    public String getEmailusuario() {
        return emailusuario;
    }

    public String getPasswordusuario() {
        return passwordusuario;
    }
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO usuario (rutUsuario, nombreUsuario, apellidoUsuario, emailUsuario, passUsuario) VALUES ('" + rutusuario + "', '" + nombreusuario + "','" + apellidousuario + "', '" + emailusuario + "', '" + passwordusuario + "')");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `usuario` WHERE `usuario`.`rutUsuario` = '"+rutusuario+"'");
    }
    
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreUsuario = '"+nombreusuario+"', apellidoUsuario = '"+apellidousuario+"', emailUsuario = '"+emailusuario+"', passUsuario = '"+passwordusuario+"' WHERE rutUsuario = '"+rutusuario+"';");
    }
    
    
}
