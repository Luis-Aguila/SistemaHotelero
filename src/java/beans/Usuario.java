
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;

//Se crea la clase Usuario
public class Usuario {
    //Se definen los parametros y/o variables a utilizar
    String rutusuario;
    String nombreusuario;
    String apellidousuario;
    String emailusuario;
    String passwordusuario;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();

    //Se crea un constructor vacio
    public Usuario() {
    }
    //Constructor con parametros
    public Usuario(String rutusuario, String nombreusuario, String apellidousuario, String emailusuario, String passwordusuario) {
        this.rutusuario = rutusuario;
        this.nombreusuario = nombreusuario;
        this.apellidousuario = apellidousuario;
        this.emailusuario = emailusuario;
        this.passwordusuario = passwordusuario;
    }
    //Se crean los set´s de las variables a utilizar
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
    //Se crean los get´s de las variables a utilizar
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
    //Metodo de inserción
    public boolean insert(){
        con.executeUpdate("INSERT INTO usuario (rutUsuario, nombreUsuario, apellidoUsuario, emailUsuario, passUsuario) VALUES ('" + rutusuario + "', '" + nombreusuario + "','" + apellidousuario + "', '" + emailusuario + "', '" + passwordusuario + "')");
        return true;
    }
    //Método de eliminado
    public void delete(){
        con.executeUpdate("DELETE FROM `usuario` WHERE `usuario`.`rutUsuario` = '"+rutusuario+"'");
    }
    //Método de actualización
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreUsuario = '"+nombreusuario+"', apellidoUsuario = '"+apellidousuario+"', emailUsuario = '"+emailusuario+"', passUsuario = '"+passwordusuario+"' WHERE rutUsuario = '"+rutusuario+"';");
    }
    
    
}
