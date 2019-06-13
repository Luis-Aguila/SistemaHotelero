<%-- 
    Document   : reservas-all
    Created on : 26-abr-2018, 10:22:50
    Author     : boy-l
--%>
<%@page import="java.util.*"%>
<%@page import="beans.*"%>
<%@page session = "true" %>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Data.ClaseConneccion con = new Data.ClaseConneccion();
    String sql = "";
%>
<!DOCTYPE html>
<html>
    <head>
        <title>Consulta - Reservas</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0,shrink-to-fit=no">
        
        <!--Cargando fuentes-->
        <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

        <!--Cargando Iconos-->
        <link rel="stylesheet" href="css/fontawesome-all.css"  type="text/css">
        <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">
        
        <!--Carga de archivos css-->
        <link rel="stylesheet" href="css/bootstrap.css">
        <link rel="stylesheet" href="css/estilos.css">
        <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">
        
        
        
    </head>
    <body>
        <section class="reservas-all" style="margin-top: 5rem">
            <div class="container">
                <div class="row">
                    <div class="col-8">
                        <h1>Resumenes de reservas</h1>
                        
                        <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Id Reserva</th>
                                                <th>Fecha reserva</th>
                                                <th>Fecha Recepción</th>
                                                <th>Dias Reserva</th>
                                                <th>Total</th>
                                                <th>Estado</th>
                                                <th>Rut Cliente</th>
                                                <th>Rut Usuario</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <%
                                                sql="SELECT idReserva, fechaReserva, frecepcionReserva, diaReserva, precioReserva, nombreEstado, Cliente_rutCliente, Usuario_rutUsuario FROM reserva r JOIN Estado e on (r.Estado_idEstado = e.idEstado)";
                                                ResultSet rs = con.executeQuery (sql);
                                                while (rs.next()){
                                            %>
                                            <tr class="table-danger">
                                                <th scope="row"><%out.println(rs.getString("idReserva"));%></th>
                                                <td><%out.println(rs.getString("fechaReserva"));%></td>
                                                <td><%out.println(rs.getString("frecepcionReserva"));%></td>
                                                <td><%out.println(rs.getString("diaReserva"));%></td>
                                                <td><%out.println(rs.getString("precioReserva"));%></td>
                                                <td><%out.println(rs.getString("nombreEstado"));%></td>
                                                <td><%out.println(rs.getString("Cliente_rutCliente"));%></td>
                                                <td><%out.println(rs.getString("Usuario_rutUsuario"));%></td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                    </table>
                    </div>
                                        <div class="col-4">
                                            <h2>Detalles de habitaciones</h2>
                                        </div>
                    
                    
                </div>
            </div>
        </section>
    </body>
</html>
