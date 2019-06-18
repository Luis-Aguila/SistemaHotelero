
package beans;
//Se realizan las importaciones de sql y las utilidades de java
import java.util.*;
import java.sql.*;
//se importa la clase ClaseConneccion, para la conexión a la base de datos
import Data.ClaseConneccion;
//Se crea la clase Usuario
public class TipoCama {
    //Se definen los parametros y/o variables a utilizar
    int idtipocama;
    String nombretipocama;
    //Se crea un objeto de la clase ClaseConneccion
    private ClaseConneccion con = new ClaseConneccion();
//Se crea un constructor vacio
    public TipoCama() {
    }
    //Constructor con parametros
    public TipoCama(int idtipocama, String nombretipocama) {
        this.idtipocama = idtipocama;
        this.nombretipocama = nombretipocama;
    }
    //Se crean los set´s de las variables a utilizar
    public void setIdtipocama(int idtipocama) {
        this.idtipocama = idtipocama;
    }

    public void setNombretipocama(String nombretipocama) {
        this.nombretipocama = nombretipocama;
    }
    //Se crean los get´s de las variables a utilizar
    public int getIdtipocama() {
        return idtipocama;
    }

    public String getNombretipocama() {
        return nombretipocama;
    }
    
    //Metodo de inserción    
    public boolean insert(){
        con.executeUpdate("INSERT INTO tipocama (idTipoCama, nombreTipoCama) VALUES (" + idtipocama + ", '" + nombretipocama + "')");
        return true;
    }
     //Método de eliminado   
    public void delete(){
        con.executeUpdate("DELETE FROM `tipocama` WHERE `tipocama`.`idTipoCama` = "+idtipocama+" ");
    }
     //Método de actualización   
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreTipoCama = '"+nombretipocama+"' WHERE idTipoCama = "+idtipocama+" ;");
    }
    
    
}
