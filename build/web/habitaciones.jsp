<%-- 
    Document   : habitaciones
    Created on : 14-abr-2018, 0:56:57
    Author     : boy-l
--%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Data.ClaseConneccion con = new Data.ClaseConneccion();
    String sql = "";
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Habitaciones</title>
    </head>
    <body>
        <section class="reserva">
            <div class="container">
                <div class="row">
                    <div class="col-6">
                        <div class="formulario-reserva">
                            <h4>Generar Habitacion</h4>
                            <form action="Habitacion_sv" method="post">
                                <div class="form-group">
                                    <label for="numerohabitacion">Número Habiación</label>
                                    <input name="numerohabitacion" type="text" class="form-control font-weight-bold" id="numerohabitacion" placeholder="Número Habitación" required>
                                </div>
                                <div class="form-group">
                                    <label for="preciohabitacion">Precio Habitación</label>
                                    <input name="preciohabitacion" type="text" class="form-control font-weight-bold" id="preciohabitacion" placeholder="Precio Habitación" required>
                                </div>
                                <div class="form-group">
                                    <select class="custom-select" name="tipohabitacion">
                                        <option selected>Tipo de Habitación</option>
                                        <%
                                            sql="SELECT idTipoHabitacion, nombreTipoHabitacion FROM tipohabitacion";
                                            ResultSet rsth = con.executeQuery (sql);
                                            while (rsth.next()){
                                        %>
                                        <option value="<%out.println(rsth.getString("idTipoHabitacion"));%>"><%out.println(rsth.getString("nombreTipoHabitacion"));%></option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="custom-select" name="tipocama">
                                        <option selected>Tipo de Cama</option>
                                        <%
                                            sql="SELECT idTipoCama, nombreTipoCama FROM tipocama";
                                            ResultSet rstc = con.executeQuery (sql);
                                            while (rstc.next()){
                                        %>
                                        <option value="<%out.println(rstc.getString("idTipoCama"));%>"><%out.println(rstc.getString("nombreTipoCama"));%></option>
                                        <%}%>
                                    </select>
                                </div>
                                <div class="form-group">
                                    <select class="custom-select" name="estadohabitacion">
                                        <option selected>Estado de Habitacion</option>
                                        <%
                                            sql="SELECT idEstadoHabitacion, nombreEstadoHabitacion FROM estadohabitacion";
                                            ResultSet rseh = con.executeQuery (sql);
                                            while (rseh.next()){
                                        %>
                                        <option value="<%out.println(rseh.getString("idEstadoHabitacion"));%>"><%out.println(rseh.getString("nombreEstadoHabitacion"));%></option>
                                        <%}%>
                                    </select>
                                </div>
                                <button name="btnhabitacion" type="submit" class="btn btn-primary">Generar</button>
                            </form>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="container tablas">
                            <div class="row">
                                <div class="col-12 tablahg">
                                    <h2>Habitaciones Generadas</h2>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Número Habitación</th>
                                                <th>Precio</th>
                                                <th>Tipo Habitacion</th>
                                                <th>Tipo Cama</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="table-danger">
                                            <%
                                                sql="SELECT numeroHabitacion, precioHabitacion, nombreTipoHabitacion, nombreTipoCama FROM habitacion h JOIN tipohabitacion th ON (h.TipoHabitacion_idTipoHabitacion = th.idTipoHabitacion) JOIN tipocama tc ON h.TipoCama_idTipoCama = tc.idTipoCama ";
                                                ResultSet rsh = con.executeQuery (sql);
                                                while (rsh.next()){

                                             %>
                                                <th scope="row"><%out.println(rsh.getString("numeroHabitacion"));%></th>
                                                <td><%out.println(rsh.getString("precioHabitacion"));%></td>
                                                <td><%out.println(rsh.getString("nombreTipoHabitacion"));%></td>
                                                <td><%out.println(rsh.getString("nombreTipoCama"));%></td>
                                                <td></td>
                                                <td>
                                                    <form action="Habitacion_sv" method="POST">
                                                        <input type="hidden" name="numerohabitacion"  value="<%out.print(rsh.getString("numeroHabitacion"));%>">
                                                        <button type="submit" class="btn btn-danger" name="btnborrarhabitacion" id="borrar">Eliminar</button>
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
                <div class="row">
                    <div class="col-6">
                        <div class="formulario-reserva">
                            <h4>Generar Tipos de Habitaciones</h4>
                            <form action="TipoHabitacion_sv" method="post">
                                <div class="form-group">
                                    <label for="nombretipohabitacion">Nombre del Tipo de habitación</label>
                                    <input name="nombretipohabitacion" type="text" class="form-control font-weight-bold" id="nombretipohabitacion" placeholder="Nombre del Tipo de habitación" required>
                                </div>
                                <button name="btntipohabitacion" type="submit" class="btn btn-primary">Generar</button>
                            </form>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="container">
                            <div class="row">
                                <div class="col-12">
                                    <h2>Tipos de Habitaciones Generadas</h2>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Id tipo</th>
                                                <th>Nombre Tipo</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="table-danger">
                                                <%
                                                    sql = "SELECT idTipoHabitacion, nombreTipoHabitacion FROM tipohabitacion";
                                                    ResultSet rs = con.executeQuery (sql);
                                                    while (rs.next()){

                                                %>
                                                <th scope="row"><%out.println(rs.getString("idTipoHabitacion"));%></th>
                                                <td><%out.println(rs.getString("nombreTipoHabitacion"));%></td>
                                                <td></td>
                                                <td>
                                                    <form action="TipoHabitacion_sv" method="POST">
                                                        <input type="hidden" name="idtipo"  value="<%out.print(rs.getString("idTipoHabitacion"));%>">
                                                        <button type="submit" class="btn btn-danger" name="btnborrartipohabitacion" id="borrar">Eliminar</button>
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
                <div class="row">
                    <div class="col-6">
                        <div class="formulario-reserva">
                            <h4>Generar Tipos de Cama</h4>
                            <form action="TipoCama_sv" method="post">
                                <div class="form-group">
                                    <label for="nombretipocama">Nombre del Tipo de Cama</label>
                                    <input name="nombretipocama" type="text" class="form-control font-weight-bold" id="nombretipocama" placeholder="Nombre del Tipo de Cama">
                                </div>
                                <button name="btntipocama" type="submit" class="btn btn-primary">Generar</button>
                            </form>
                        </div>
                    </div>
                    <div class="col-6">
                        <div class="container">
                            <div class="row">
                                <div class="col-12">
                                    <h2>Tipos de Camas</h2>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>Id tipo</th>
                                                <th>Nombre Tipo</th>
                                                <th></th>
                                                <th></th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <tr class="table-danger">
                                                <%
                                                    sql="SELECT idTipoCama, nombreTipoCama FROM tipocama";
                                                    ResultSet rss = con.executeQuery (sql);
                                                    while (rss.next()){

                                                %>
                                                <th scope="row"><%out.println(rss.getString("idTipoCama"));%></th>
                                                <td><%out.println(rss.getString("nombreTipoCama"));%></td>
                                                <td></td>
                                                <td>
                                                    <form action="TipoCama_sv" method="POST">
                                                        <input type="hidden" name="idtipo"  value="<%out.print(rss.getString("idTipoCama"));%>">
                                                        <button type="submit" class="btn btn-danger" name="btnborrartipocama" id="borrar">Eliminar</button>
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
        
        <!--Carga de archivos js-->
        <script src="jquery-1.9.1.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
    </body>
</html>
