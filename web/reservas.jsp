<%-- 
    Document   : reserva
    Created on : 14-abr-2018, 0:56:03
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
    HttpSession sesion = request.getSession();
    String preciototal = "";
%>
                            <!DOCTYPE html>
                            <html>

                            <head>
                                <title>Reservas</title>
                                <meta charset="UTF-8">
                                <meta name="viewport" content="width=device-width, initial-scale=1.0,shrink-to-fit=no">

                                <!--Cargando fuentes-->
                                <link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">

                                <!--Cargando Iconos-->
                                <link rel="stylesheet" href="css/fontawesome-all.css" type="text/css">
                                <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.0.10/css/all.css" integrity="sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg" crossorigin="anonymous">

                                <!--Carga de archivos css-->
                                <link rel="stylesheet" href="css/bootstrap.css">
                                <link rel="stylesheet" href="css/estilos.css">
                                <link href="css/bootstrap-datetimepicker.min.css" rel="stylesheet">
                            </head>

                            <body>
                                <section class="reserva">
                                    <div class="container">
                                        <div class="row">
                                            <div class="col-7">
                                                <div class="buscar-cliente-reserva">
                                                    <h4>Buscar Cliente</h4>
                                                    <form action="index.jsp?pag=reservas" method="post">
                                                        <div class="input-group">
                                                            <input name="buscarclientereserva" type="text" class="form-control font-weight-bold" id="clientereserva" placeholder="Buscar..." aria-label="" aria-describedby="basic-addon1">
                                                            <div class="input-group-append">
                                                                <button name="btnbcr" class="btn btn-success" type="submit">Buscar</button>
                                                            </div>
                                                        </div>
                                                    </form>
                                                </div>
                                                <!--Busqueda de cliente por medio medio del rut a la base de datos-->
                                                <%
                            String rut = "";
                            String nombre = "";
                            String apellido = "";
                            String fono = "";
                            String email = "";
                            int iterador = 0;
                            
                            if(request.getParameter("btnbcr") != null){
                                String cliente = request.getParameter("buscarclientereserva").toString();
                                
                                sql="SELECT rutCliente, nombreCliente, apellidoCliente, fonoCliente, emailCliente FROM cliente WHERE rutCliente = '"+cliente+"'";
                                ResultSet rs = con.executeQuery (sql);
                                while (rs.next()){
                                    iterador = iterador + 1;
                                    rut = rs.getString("rutCliente");
                                    nombre = rs.getString("nombreCliente");
                                    apellido = rs.getString("apellidoCliente");
                                    fono = rs.getString("fonoCliente");
                                    email = rs.getString("emailCliente");
                                }
                            }
                        %>
                                                    <!--Formulario si encuentra coincidencias-->
                                                    <div class="formulario-reserva">
                                                        <h4>Generar Reserva</h4>
                                                        <form action="reserva_sv" method="post">
                                                            <div class="form-group">
                                                                <label for="clientereserva">Cliente</label>
                                                                <input value="<%if(iterador == 0){out.println(" No hay cliente asociado ");}else{out.println(rut);}%>" name="clientereserva" type="text" class="form-control font-weight-bold" id="clientereserva" placeholder="Cliente Asociado" disabled="true">
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="fechareserva">Fecha reserva</label>
                                                                <div class="row">
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="fdia" class="form-control">
                                                <%
                                                    for(int i = 1; i <=31; i++ ){
                                                        
                                                    
                                                %>
                                                <option value="<%out.println(i);%>"><%out.println(i);%></option>
                                                <%}%>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="fmes" class="form-control">
                                                <option value="Enero">Enero</option>
                                                <option value="Febrero">Febrero</option>
                                                <option value="Marzo">Marzo</option>
                                                <option value="Abril">Abril</option>
                                                <option value="Mayo">Mayo</option>
                                                <option value="Junio">Junio</option>
                                                <option value="Julio">Julio</option>
                                                <option value="Agosto">Agosto</option>
                                                <option value="Septiembre">Septiembre</option>
                                                <option value="Octubre">Octubre</option>
                                                <option value="Noviembre">Noviembre</option>
                                                <option value="Diciembre">Diciembre</option>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="fanio" class="form-control">
                                                <%
                                                    for(int i = 2017; i <=2030; i++ ){
                                                        
                                                    
                                                %>
                                                <option value="<%out.println(i);%>"><%out.println(i);%></option>
                                                <%}%>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="fecharecepcionreserva">Fecha recepción reserva</label>
                                                                <div class="row">
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="frdia" class="form-control">
                                                <%
                                                    for(int i = 1; i <=31; i++ ){
                                                        
                                                    
                                                %>
                                                <option value="<%out.println(i);%>"><%out.println(i);%></option>
                                                <%}%>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="frmes" class="form-control">
                                                <option value="Enero">Enero</option>
                                                <option value="Febrero">Febrero</option>
                                                <option value="Marzo">Marzo</option>
                                                <option value="Abril">Abril</option>
                                                <option value="Mayo">Mayo</option>
                                                <option value="Junio">Junio</option>
                                                <option value="Julio">Julio</option>
                                                <option value="Agosto">Agosto</option>
                                                <option value="Septiembre">Septiembre</option>
                                                <option value="Octubre">Octubre</option>
                                                <option value="Noviembre">Noviembre</option>
                                                <option value="Diciembre">Diciembre</option>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="franio" class="form-control">
                                                <%
                                                    for(int i = 2017; i <=2030; i++ ){
                                                        
                                                    
                                                %>
                                                <option value="<%out.println(i);%>"><%out.println(i);%></option>
                                                <%}%>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="diasreserva">Dias</label>
                                                                <div class="row">
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <select name="diasreserva" class="form-control">
                                                <%
                                                    for(int i = 1; i <=7; i++ ){
                                                        
                                                    
                                                %>
                                                <option value="<%out.println(i);%>"><%out.println(i);%></option>
                                                <%}%>
                                            </select>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                            <div class="form-group">
                                                                <label for="precioreserva">Total</label>
                                                                <input name="precioreserva" type="number" class="form-control font-weight-bold" id="resultado" placeholder="Precio de reserva" required="">
                                                            </div>

                                                            <div class="form-group">
                                                                <label for="usuarioreserva">Usuario Encargado</label>
                                                                <input name="usuarioreserva" type="text" class="form-control font-weight-bold" id="usuarioreserva" placeholder="Encargado de la reserva" required="">
                                                            </div>
                                                            <div class="form-group">
                                                                <div class="row">
                                                                    <div class="col-4">
                                                                        <div class="form-group">
                                                                            <label for="estadoreserva">Estado</label>
                                                                            <select class="form-control">
                                                    <%
                                                        sql="SELECT idEstado, nombreEstado FROM estado";
                                                        ResultSet rse = con.executeQuery (sql);
                                                        while (rse.next()){
                                                    %>
                                                    <option value="<%out.println(rse.getString("idEstado"));%>"><%out.println(rse.getString("nombreEstado"));%></option>
                                                    <%}%>
                                                </select>
                                                                        </div>
                                                                    </div>

                                                                </div>
                                                            </div>
                                                            <button name="btnreserva" type="submit" class="btn btn-primary">Confirmar Reserva</button>
                                                        </form>
                                                    </div>
                                            </div>
                                            <div class="col-5">
                                                <div class="container">
                                                    <div class="row">
                                                        <div class="col-12">
                                                            <h2>Cliente</h2>
                                                            <table class="table">
                                                                <thead>
                                                                    <tr>
                                                                        <th>Rut</th>
                                                                        <th>Nombre</th>
                                                                        <th>Apellido</th>
                                                                        <th>Telefono</th>
                                                                        <th>E-mail</th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <tr class="table-danger">
                                                                        <th scope="row">
                                                                            <%out.println(rut);%>
                                                                        </th>
                                                                        <td>
                                                                            <%out.println(nombre);%>
                                                                        </td>
                                                                        <td>
                                                                            <%out.println(apellido);%>
                                                                        </td>
                                                                        <td>
                                                                            <%out.println(fono);%>
                                                                        </td>
                                                                        <td>
                                                                            <%out.println(email);%>
                                                                        </td>
                                                                    </tr>
                                                                </tbody>
                                                            </table>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-12">
                                                            <h2>Habitaciones</h2>
                                                            <table class="table">
                                                                <thead>
                                                                    <tr>
                                                                        <th>Numero</th>
                                                                        <th>Precio(24h)</th>
                                                                        <th>Tipo</th>
                                                                        <th>Cama</th>
                                                                        <th></th>
                                                                        <th></th>
                                                                    </tr>
                                                                </thead>
                                                                <tbody>
                                                                    <%
                                                sql="SELECT numeroHabitacion, precioHabitacion, nombreTipoHabitacion, nombreTipoCama, EstadoHabitacion_idEstadoHabitacion, nombreEstadoHabitacion FROM habitacion h JOIN tipohabitacion th ON (h.TipoHabitacion_idTipoHabitacion = th.idTipoHabitacion) JOIN tipocama tc ON (h.TipoCama_idTipoCama = tc.idTipoCama)JOIN estadohabitacion ea ON (h.EstadoHabitacion_idEstadoHabitacion = ea.idEstadoHabitacion)";
                                                ResultSet rshd = con.executeQuery (sql);
                                                while (rshd.next()){
                                                    
                                                
                                            %>
                                                                        <tr class="table-danger">
                                                                            <th scope="row">
                                                                                <%out.println(rshd.getString("numeroHabitacion"));%>
                                                                            </th>
                                                                            <td>
                                                                                <%out.println(rshd.getString("precioHabitacion"));%>
                                                                            </td>
                                                                            <td>
                                                                                <%out.println(rshd.getString("nombreTipoHabitacion"));%>
                                                                            </td>
                                                                            <td>
                                                                                <%out.println(rshd.getString("nombreTipoCama"));%>
                                                                            </td>
                                                                            <td></td>
                                                                            <td>
                                                                                <form action="reserva_sv" method="POST" target="el-iframe">
                                                                                    <input type="hidden" name="preciohabitacion" id="phbit" value="<%out.print(rshd.getString(" precioHabitacion "));%>">
                                                                                    <input type="hidden" name="numerohabitacion" value="<%out.print(rshd.getString(" numeroHabitacion "));%>">
                                                                                    <input type="hidden" name="estadohabitacion" value="<%out.print(rshd.getString(" EstadoHabitacion_idEstadoHabitacion "));%>">
                                                                                    <button type="submit" class="btn btn-success" name="btnasignarestado" id="asignarestado" onclick="location.reload()"><%out.print(rshd.getString("nombreEstadoHabitacion"));%></button>
                                                                                </form>
                                                                                <iframe name="el-iframe" style='display:none'></iframe>

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
                                <script src="js/bootstrap-datetimepicker.min.js"></script>
                            </body>

                            </html>