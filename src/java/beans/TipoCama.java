
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;
public class TipoCama {
    int idtipocama;
    String nombretipocama;
    private ClaseConneccion con = new ClaseConneccion();

    public TipoCama() {
    }

    public TipoCama(int idtipocama, String nombretipocama) {
        this.idtipocama = idtipocama;
        this.nombretipocama = nombretipocama;
    }

    public void setIdtipocama(int idtipocama) {
        this.idtipocama = idtipocama;
    }

    public void setNombretipocama(String nombretipocama) {
        this.nombretipocama = nombretipocama;
    }

    public int getIdtipocama() {
        return idtipocama;
    }

    public String getNombretipocama() {
        return nombretipocama;
    }
    
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO tipocama (idTipoCama, nombreTipoCama) VALUES (" + idtipocama + ", '" + nombretipocama + "')");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `tipocama` WHERE `tipocama`.`idTipoCama` = "+idtipocama+" ");
    }
    
    public void update(){
        con.executeUpdate("UPDATE persona SET nombreTipoCama = '"+nombretipocama+"' WHERE idTipoCama = "+idtipocama+" ;");
    }
    
    
}
