<%-- 
    Document   : index.jsp
    Created on : 14-abr-2018, 1:02:35
    Author     : boy-l
--%>
    <%@page session = "true" %>
        <%@page contentType="text/html" pageEncoding="UTF-8"%>
            <!DOCTYPE html>
            <html lang="en">

            <head>
                <title>Index-Hotel Mejorando</title>
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
            </head>

            <body>
                <section class="index-login index">
                    <!--Incluye de manera dinámica las url con subfijo pag...y el navbar lo incluye de manera predeterminada en todo los escenarios-->
                    <%@include file="navbar.jsp" %>


                        <%
            String pag = request.getParameter("pag");
            if (pag != null ) {
                pag=pag+".jsp";
            }else{
            pag="content-index.jsp";
            }

            %>

                            <jsp:include page="<%=pag%>" flush="true" />



                </section>
                <!--Footer del sistema-->
                <footer class="piedepagina" role="contentinfo">
                    <div class="container">
                        <p>2018 © Hotel Mejorando Todos los derechos reservados</p>
                        <ul class="redes-sociales">
                            <li><a href="#"><i class="fab fa-facebook-f" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-twitter" aria-hidden="true"></i></a></li>
                            <li><a href="#"><i class="fab fa-youtube" aria-hidden="true"></i></a></li>
                        </ul>
                    </div>
                </footer>



                <!--Carga de archivos js-->
                <script src="jquery-1.9.1.min.js"></script>
                <script src="js/bootstrap.min.js"></script>

            </body>

            </html>