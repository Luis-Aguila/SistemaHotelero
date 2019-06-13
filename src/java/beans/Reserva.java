
package beans;

import java.util.*;
import java.sql.*;
import Data.ClaseConneccion;

public class Reserva {
    
    int idreserva;
    String rutcliente;
    String fechareserva;
    String frecepcionreserva;
    int diasreserva;
    int precioreserva;
    String rutusuario;
    int estadoreserva;
    private ClaseConneccion con = new ClaseConneccion();

    public Reserva() {
    }

    public Reserva(int idreserva, String rutcliente, String fechareserva, String frecepcionreserva, int diasreserva, int precioreserva, String rutusuario, int estadoreserva) {
        this.idreserva = idreserva;
        this.rutcliente = rutcliente;
        this.fechareserva = fechareserva;
        this.frecepcionreserva = frecepcionreserva;
        this.diasreserva = diasreserva;
        this.precioreserva = precioreserva;
        this.rutusuario = rutusuario;
        this.estadoreserva = estadoreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public void setRutcliente(String rutcliente) {
        this.rutcliente = rutcliente;
    }

    public void setFechareserva(String fechareserva) {
        this.fechareserva = fechareserva;
    }

    public void setFrecepcionreserva(String frecepcionreserva) {
        this.frecepcionreserva = frecepcionreserva;
    }

    public void setDiasreserva(int diasreserva) {
        this.diasreserva = diasreserva;
    }

    public void setPrecioreserva(int precioreserva) {
        this.precioreserva = precioreserva;
    }

    public void setRutusuario(String rutusuario) {
        this.rutusuario = rutusuario;
    }

    public void setEstadoreserva(int estadoreserva) {
        this.estadoreserva = estadoreserva;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public String getRutcliente() {
        return rutcliente;
    }

    public String getFechareserva() {
        return fechareserva;
    }

    public String getFrecepcionreserva() {
        return frecepcionreserva;
    }

    public int getDiasreserva() {
        return diasreserva;
    }

    public int getPrecioreserva() {
        return precioreserva;
    }

    public String getRutusuario() {
        return rutusuario;
    }

    public int getEstadoreserva() {
        return estadoreserva;
    }
    
    public boolean insert(){
        con.executeUpdate("INSERT INTO reserva (fechaReserva, frecepcionReserva, diaReserva, precioReserva,Estado_idEstado, Cliente_rutCliente, Usuario_rutUsuario) VALUES ('" + fechareserva + "', '" + frecepcionreserva + "', " + diasreserva + ", " + precioreserva + "," + estadoreserva + ", '" + rutcliente + "', '" + rutusuario + "')");
        return true;
    }
    
    public void delete(){
        con.executeUpdate("DELETE FROM `reserva` WHERE `reserva`.`idReserva` = '"+idreserva+"'");
    }
    
    public void update(){
        con.executeUpdate("UPDATE persona SET fechaReserva = '"+fechareserva+"', frecepcionReserva = '"+frecepcionreserva+"', diaReserva = "+diasreserva+", precioReserva = "+precioreserva+",Estado_idEstado = "+estadoreserva+",Cliente_rutCliente = '"+rutcliente+"', Usuario_rutUsuario = '"+rutusuario+"'  WHERE idReserva = "+idreserva+";");
    }
    
    
}
