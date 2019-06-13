package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Loginacion {
    
    private ClaseConneccion con = new ClaseConneccion();
    private String email;
    private String password;
    
    
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
