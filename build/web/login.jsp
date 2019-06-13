<%-- 
    Document   : login.jsp
    Created on : 14-abr-2018, 1:01:18
    Author     : boy-l
--%>
<%@page session = "true"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Login- Hotel Mejorando</title>
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
    </head>
    <body>
        <section class="index-login">
            <header class="encabezado fixed-top" role="banner" id="encabezado">
                <div class="container">
                    <a href="login.jsp" class="logo img-fluid">
                        <img src="images/logoHotel.png" alt="Logo del titulo">
                    </a>
                    <nav id="menu-principal" class="collapse">
                        <ul>
                            <li class="active font-weight-bold"><a href="login.jsp">Login</a></li>
                        </ul>
                    </nav>

                </div>

             </header>
           
            <div class="prentacionlogin">
                <div class="container">
                    <div class="row">
                        <div class="col-4 seccionlogin2">
                            <div class="logo-form d-flex justify-content-center">
                                <img src="images/logoHotelazul.png" alt="Logo del titulo">
                            </div>
                            <div class="container ">
                                <form action="login.jsp" method="post" class="formulario-login">
                                    <div class="form-group">
                                        <label for="email">Email</label>
                                        <input name="useremail" type="email" class="form-control font-weight-bold" id="email" placeholder="Ingrese su E-mail">
                                    </div>
                                    <div class="form-group">
                                        <label for="password">Password</label>
                                        <input name="userpass" type="password" class="form-control font-weight-bold" id="password" placeholder="Ingrese su Password">
                                    </div>
                                    <button name="btnlogin" type="submit" class="btn btn-primary">Ingresar</button>
                                </form>
                            </div>
                        </div>
                        <div class="col-3">
                            
                        </div>
                        <div class="col-5 seccionlogin1">
                            <div class="iconologin">
                               <img src="images/iconologin.svg" alt="Icono login">
                            </div>
                            <h3>Login Usuario</h3>
                            <p class="text-center">Asegurese de Ingresar sus credenciales de manera correcta.</p>
                            <p class="text-center">En caso de extravio, comuniquece con administración</p>
                        </div>
                    </div> 
                </div>
            </div>
        </section>
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
        
        
        
        
        
        <%
            beans.Loginacion login = new beans.Loginacion();
            
            if(request.getParameter("btnlogin") != null){
                
                String email = request.getParameter("useremail");
                String password = request.getParameter("userpass");
                                    
                HttpSession sesion = request.getSession();
                
                if(login.Loguear(email, password)==true){
                    sesion.setAttribute("user", email);
                    response.sendRedirect("http://localhost:8080/sistemaHotelero/index.jsp");
                }else{
                    %>
                    <script>
                        alert("Credenciales Ingresadas son invalidas");
                    </script>
                    
                    <%
                }
            }
            
            if(request.getParameter("cerrar") != null){
                session.invalidate();
                response.sendRedirect("http://localhost:8080/sistemaHotelero/login.jsp");
            }
        
        %>
    </body>
</html>
