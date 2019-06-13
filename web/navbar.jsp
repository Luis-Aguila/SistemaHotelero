<%-- 
    Document   : navbar
    Created on : 14-abr-2018, 16:49:24
    Author     : boy-l
--%>
<%@page session = "true" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
    </head>
    <body>
            <header class="encabezado fixed-top" role="banner" id="encabezado">
                <div class="container">
                    <a href="index.jsp" class="logo img-fluid">
                        <img src="images/logoHotel.png" alt="Logo del titulo">
                    </a>
                    <nav id="menu-principal" class="collapse">
                        <ul>
                            <li class="font-weight-bold"><a href="index.jsp?pag=reservas">Generar Reserva</a></li>
                            <li class="font-weight-bold"><a href="index.jsp?pag=reservas-all">Consultas de reservas</a></li>
                            <li class="font-weight-bold"><a href="index.jsp?pag=clientes">Clientes</a></li>
                            <li class="font-weight-bold"><a href="index.jsp?pag=habitaciones">Habitaciones</a></li>
                            <li class="font-weight-bold"><a href="login.jsp?cerrar=true">Cerrar session</a></li>
                        </ul>
                    </nav>
                </div>
            </header>
    </body>
</html>
