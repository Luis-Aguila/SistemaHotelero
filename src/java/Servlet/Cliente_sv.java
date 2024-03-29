/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author boy-l
 */
@WebServlet(name = "Cliente_sv", urlPatterns = {"/Cliente_sv"})
public class Cliente_sv extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            //Se crea un objeto de la clase TipoHabitacion para su trabajo
            beans.Cliente c = new beans.Cliente();
            //Si se presiona el boton de nombre btncliente_nuevo, se inserta un nuevo cliente
            if(request.getParameter("btncliente_nuevo") != null){
                String rut = request.getParameter("rutcliente").toString();
                String nombre = request.getParameter("nombrecliente").toString();
                String apellido = request.getParameter("apellidocliente").toString();
                String fono = request.getParameter("fonocliente").toString();
                String email = request.getParameter("emailcliente").toString();
                //Se envian los datos a la clase
                c.setRutcliente(rut);
                c.setNombrecliente(nombre);
                c.setApellidocliente(apellido);
                c.setFonocliente(fono);
                c.setEmailcliente(email);
                //Se insertan a la base de datos
                c.insert();
                //Si se presiona el boton de nombre btnborrar_cliente, se elimina el cliente
            }if(request.getParameter("btnborrar_cliente") != null){
                String rutcliente = request.getParameter("rutCliente").toString();
                
                c.setRutcliente(rutcliente);
                
                c.delete();
            }
            
            //Se redirecciona a la pagina de clientes
            response.sendRedirect("index.jsp?pag=/clientes");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
