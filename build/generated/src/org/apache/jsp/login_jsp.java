package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Login- Hotel Mejorando</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0,shrink-to-fit=no\">\n");
      out.write("        \n");
      out.write("        <!--Cargando fuentes-->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <!--Cargando Iconos-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/fontawesome-all.css\"  type=\"text/css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.0.10/css/all.css\" integrity=\"sha384-+d0P83n9kaQMCwj8F4RJB66tzIwOKmrdb46+porD/OvrJ+37WqIM7UoBtwHO6Nlg\" crossorigin=\"anonymous\">\n");
      out.write("        \n");
      out.write("        <!--Carga de archivos css-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/estilos.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <section class=\"index-login\">\n");
      out.write("            <header class=\"encabezado fixed-top\" role=\"banner\" id=\"encabezado\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a href=\"login.jsp\" class=\"logo img-fluid\">\n");
      out.write("                        <img src=\"images/logoHotel.png\" alt=\"Logo del titulo\">\n");
      out.write("                    </a>\n");
      out.write("                    <nav id=\"menu-principal\" class=\"collapse\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"active font-weight-bold\"><a href=\"login.jsp\">Login</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("             </header>\n");
      out.write("           \n");
      out.write("            <div class=\"prentacionlogin\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-4 seccionlogin2\">\n");
      out.write("                            <div class=\"logo-form d-flex justify-content-center\">\n");
      out.write("                                <img src=\"images/logoHotelazul.png\" alt=\"Logo del titulo\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"container \">\n");
      out.write("                                <form action=\"login.jsp\" method=\"post\" class=\"formulario-login\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"email\">Email</label>\n");
      out.write("                                        <input name=\"useremail\" type=\"email\" class=\"form-control font-weight-bold\" id=\"email\" placeholder=\"Ingrese su E-mail\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <label for=\"password\">Password</label>\n");
      out.write("                                        <input name=\"userpass\" type=\"password\" class=\"form-control font-weight-bold\" id=\"password\" placeholder=\"Ingrese su Password\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <button name=\"btnlogin\" type=\"submit\" class=\"btn btn-primary\">Ingresar</button>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-3\">\n");
      out.write("                            \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-5 seccionlogin1\">\n");
      out.write("                            <div class=\"iconologin\">\n");
      out.write("                               <img src=\"images/iconologin.svg\" alt=\"Icono login\">\n");
      out.write("                            </div>\n");
      out.write("                            <h3>Login Usuario</h3>\n");
      out.write("                            <p class=\"text-center\">Asegurese de Ingresar sus credenciales de manera correcta.</p>\n");
      out.write("                            <p class=\"text-center\">En caso de extravio, comuniquece con administración</p>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <footer class=\"piedepagina\" role=\"contentinfo\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <p>2018 © Hotel Mejorando Todos los derechos reservados</p>\n");
      out.write("                <ul class=\"redes-sociales\">\n");
      out.write("                    <li><a href=\"#\"><i class=\"fab fa-facebook-f\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fab fa-twitter\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                    <li><a href=\"#\"><i class=\"fab fa-youtube\" aria-hidden=\"true\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--Carga de archivos js-->\n");
      out.write("        <script src=\"jquery-1.9.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        ");

            beans.Loginacion login = new beans.Loginacion();
            
            if(request.getParameter("btnlogin") != null){
                
                String email = request.getParameter("useremail");
                String password = request.getParameter("userpass");
                                    
                HttpSession sesion = request.getSession();
                
                if(login.Loguear(email, password)==true){
                    sesion.setAttribute("user", email);
                    response.sendRedirect("http://localhost:8080/sistemaHotelero/index.jsp");
                }else{
                    
      out.write("\n");
      out.write("                    <script>\n");
      out.write("                        alert(\"Credenciales Ingresadas son invalidas\");\n");
      out.write("                    </script>\n");
      out.write("                    \n");
      out.write("                    ");

                }
            }
            
            if(request.getParameter("cerrar") != null){
                session.invalidate();
                response.sendRedirect("http://localhost:8080/sistemaHotelero/login.jsp");
            }
        
        
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
