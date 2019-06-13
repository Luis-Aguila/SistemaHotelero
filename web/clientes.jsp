<%-- 
    Document   : cliente
    Created on : 14-abr-2018, 0:56:36
    Author     : boy-l
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Clientes</title>
    </head>
    <body>
        <section class="reserva">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <h2>Ingresar Nuevo Cliente</h2>
                        <form action="Cliente_sv" method="post" class="formulario-reserva">
                            <div class="form-group">
                                <label for="rutcliente">Rut Cliente</label>
                                <input name="rutcliente" type="text" class="form-control font-weight-bold" id="rutcliente" placeholder="Rut cliente" required>
                            </div>
                            <div class="form-group">
                                <label for="nombrecliente">Nombre Cliente</label>
                                <input name="nombrecliente" type="text" class="form-control font-weight-bold" id="nombrecliente" placeholder="Nombre Cliente" required>
                            </div>
                            <div class="form-group">
                                <label for="apellidocliente">Apellido Cliente</label>
                                <input name="apellidocliente" type="text" class="form-control font-weight-bold" id="apellidocliente" placeholder="Apellido Cliente" required>
                            </div>
                            <div class="form-group">
                                <label for="fonocliente">Telefono Contacto</label>
                                <input name="fonocliente" type="text" class="form-control font-weight-bold" id="fonocliente" placeholder="Fono Cliente" required>
                            </div>
                            <div class="form-group">
                                <label for="emailcliente">E-mail Cliente</label>
                                <input name="emailcliente" type="email" class="form-control font-weight-bold" id="emailcliente" placeholder="Email Cliente">
                            </div>
                            <button name="btncliente_nuevo" type="submit" class="btn btn-primary">Guardar Cliente</button>
                        </form>
                    </div>
                    <div class="col-12">
                        <div class="container">
                            <div class="row">
                                <div class="col-12">
                                    <h2>Cliente</h2>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Id Cliente</th>
                                                <th>Nombres</th>
                                                <th>Apellidos</th>
                                                <th>Telefono</th>
                                                <th>E-mail</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="table-danger">
                                            <%
                                                Data.ClaseConneccion con = new Data.ClaseConneccion();
                                                String sql="SELECT rutCliente, nombreCliente, apellidoCliente, fonoCliente, emailCliente FROM cliente";
                                                ResultSet rs = con.executeQuery (sql);
                                                while (rs.next()){

                                             %>
                                                <th scope="row"><%out.println(rs.getString("rutCliente"));%></th>
                                                <td><%out.println(rs.getString("nombreCliente"));%></td>
                                                <td><%out.println(rs.getString("apellidoCliente"));%></td>
                                                <td><%out.println(rs.getString("fonoCliente"));%></td>
                                                <td><%out.println(rs.getString("emailCliente"));%></td>
                                                <td></td>
                                                <td>
                                                    <form action="Cliente_sv" method="POST">
                                                        <input type="hidden" name="rutCliente"  value="<%out.print(rs.getString("rutCliente"));%>">
                                                        <button type="submit" class="btn btn-danger" name="btnborrar_cliente" id="borrar">Eliminar</button>
                                                    </form>
                                                </td>
                                            </tr>
                                            <%}%>
                                        </tbody>
                                    </table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    </body>
</html>
