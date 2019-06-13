package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navbar.jsp");
  }

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
      out.write("        <title>Index-Hotel Mejorando</title>\n");
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
      out.write("        <section class=\"index-login index\">\n");
      out.write("            ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <header class=\"encabezado fixed-top\" role=\"banner\" id=\"encabezado\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <a href=\"index.jsp\" class=\"logo img-fluid\">\n");
      out.write("                        <img src=\"images/logoHotel.png\" alt=\"Logo del titulo\">\n");
      out.write("                    </a>\n");
      out.write("                    <nav id=\"menu-principal\" class=\"collapse\">\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"font-weight-bold\"><a href=\"index.jsp?pag=reservas\">Generar Reserva</a></li>\n");
      out.write("                            <li class=\"font-weight-bold\"><a href=\"index.jsp?pag=reservas-all\">Consultas de reservas</a></li>\n");
      out.write("                            <li class=\"font-weight-bold\"><a href=\"index.jsp?pag=clientes\">Clientes</a></li>\n");
      out.write("                            <li class=\"font-weight-bold\"><a href=\"index.jsp?pag=habitaciones\">Habitaciones</a></li>\n");
      out.write("                            <li class=\"font-weight-bold\"><a href=\"login.jsp?cerrar=true\">Cerrar session</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("    \n");
      out.write("            \n");
      out.write("            ");

            String pag = request.getParameter("pag");
            if (pag != null ) {
                pag=pag+".jsp";
            }else{
            pag="content-index.jsp";
            }

            
      out.write("\n");
      out.write("\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, pag, out, true);
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
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
      out.write("        \n");
      out.write("        <!--Carga de archivos js-->\n");
      out.write("        <script src=\"jquery-1.9.1.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
