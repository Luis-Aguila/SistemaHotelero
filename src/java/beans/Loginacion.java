package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;


//Se crea la clase Loginacion
public class Loginacion {
       //Se crea un objeto de la clase ClaseConneccion 
       
    private ClaseConneccion con = new ClaseConneccion();
     //Se definen los parametros y/o variables a utilizar
    private String email;
    private String password;
    //Se crea un metodo publico booleano
    public boolean Loguear(String email, String password){
        this.email = email;
        this.password = password;
        boolean login = false;
        
        try {
            ResultSet rs =  con.executeQuery("SELECT * FROM usuario WHERE emailUsuario = '"+email+"' and passUsuario = '"+password+"'");
            while(rs.next()){
                login = true;
            }
            con.cerrarConexion();
        } catch (SQLException ex) {
            Logger.getLogger(Loginacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        return login;
    }
    
}
