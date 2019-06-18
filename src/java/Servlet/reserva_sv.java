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
import javax.servlet.http.HttpSession;

/**
 *
 * @author boy-l
 */
//Se asigna un nombre al servlet y la tipificación de la url para su llamado
@WebServlet(name = "reserva_sv", urlPatterns = {"/reserva_sv"})
public class reserva_sv extends HttpServlet {

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
            HttpSession sesion = request.getSession();
            //Se crean los objetos de la clase Habitacion, Reserva y Reserva_has_Habitacion para su trabajo.
            beans.Habitacion h = new beans.Habitacion();
            beans.Reserva r = new beans.Reserva();
            beans.Reserva_has_Habitacion rh = new beans.Reserva_has_Habitacion();
            //Si se presiona el boton de nombre btnbcr, se procede a buscar el elemento por id
            if(request.getParameter("btnbcr") != null){
                int idcliente = Integer.parseInt(request.getParameter("buscarclientereserva").toString());
                //Si se presiona el boton de nombre btnasignarestado, se asigna un estado a la habitación
            }if(request.getParameter("btnasignarestado") != null){
                int numerohabitacion = Integer.parseInt(request.getParameter("numerohabitacion").toString());
                int estadohabitacion = Integer.parseInt(request.getParameter("estadohabitacion").toString());
                int precio = Integer.parseInt(request.getParameter("preciohabitacion").toString().trim());
                request.getSession().setAttribute("precio", precio);

                if(estadohabitacion == 3){
                    estadohabitacion = 1;
                }else if(estadohabitacion == 2){
                    estadohabitacion = 3;
                }else if(estadohabitacion == 1){
                    estadohabitacion = 2;
                }

                h.setNumerohabitacion(numerohabitacion);
                h.setIdestadohabitacion(estadohabitacion);
                h.estadoreservado();
                
                response.sendRedirect("index.jsp?pag=/reservas");
                //Si se presiona el boton de nombre btnreserva, se genera una nueva reserva
            }if(request.getParameter("btnreserva") != null){
                
                String[] fdias = request.getParameterValues("fdia");
                String[] fmeses = request.getParameterValues("fmes");
                String[] fanios = request.getParameterValues("fanio");
                String[] frdias = request.getParameterValues("frdia");
                String[] frmeses = request.getParameterValues("frmes");
                String[] franios = request.getParameterValues("franio");
                String[] diasreservas = request.getParameterValues("diasreservas");
                int precio = Integer.parseInt(request.getParameter("precioreserva").toString());
                String usuario = request.getParameter("usuarioreserva").toString();
                String cliente = "17034147-3";
                int idestado = 1;
                
                String fdia = "";
                String fmes = "";
                String fanio = "";
                String frdia = "";
                String frmes = "";
                String franio = "";
                int dias = 0;
                
                
                try{
                    if(fdias != null){
                        for(int i = 0; i < fdias.length; i++){
                            fdia = fdias[i].trim();
                        }
                    }
                    if(fmeses != null){
                        for(int i = 0; i < fmeses.length; i++){
                            fmes = fmeses[i].trim();
                        }
                    }
                    if(fanios != null){
                        for(int i = 0; i < fanios.length; i++){
                            fanio = fanios[i].trim();
                        }
                    }
                    if(frdias != null){
                        for(int i = 0; i < frdias.length; i++){
                            frdia = frdias[i].trim();
                        }
                    }
                    if(frmeses != null){
                        for(int i = 0; i < frmeses.length; i++){
                            frmes = frmeses[i].trim();
                        }
                    }
                    if(franios != null){
                        for(int i = 0; i < franios.length; i++){
                            franio = franios[i].trim();
                        }
                    }
                    
                    if(diasreservas != null){
                        for(int i = 0; i < diasreservas.length; i++){
                            dias = Integer.parseInt(diasreservas[i].trim());
                        }
                    }
                }catch(NumberFormatException e){ // handle your exception
                    
                 }
                
                String freserva = fdia + " / " + fmes + " / " + fanio;
                String frreserva = frdia + " / " + frmes + " / " + franio;
                //inserción de datos a la clase
                r.setFechareserva(freserva);
                r.setFrecepcionreserva(frreserva);
                r.setDiasreserva(dias);
                r.setPrecioreserva(precio);
                r.setEstadoreserva(idestado);
                r.setRutcliente(cliente);
                r.setRutusuario(usuario);
                //Insercion de datos a la base de datos
                r.insert();
                //redirección a reserva
                response.sendRedirect("index.jsp?pag=/reservas");
            }
            
            
            
            
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
