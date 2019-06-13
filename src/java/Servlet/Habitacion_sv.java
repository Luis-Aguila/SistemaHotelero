/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlet;

import beans.*;
import java.util.*;
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
@WebServlet(name = "Habitacion_sv", urlPatterns = {"/Habitacion_sv"})
public class Habitacion_sv extends HttpServlet {

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
            
            beans.Habitacion h = new beans.Habitacion();
            if(request.getParameter("btnhabitacion") != null){
                int numero = Integer.parseInt(request.getParameter("numerohabitacion").toString());
                int precio = Integer.parseInt(request.getParameter("preciohabitacion").toString());
                String[] itemidhabitacion = request.getParameterValues("tipohabitacion");
                String[] itemidcama = request.getParameterValues("tipocama");
                String[] itestado = request.getParameterValues("estadohabitacion");
                
                int idtipohabitacion = 0;
                int idtipocama = 0;
                int estadohabitacion = 0;
                
                try{
                    if(itemidhabitacion != null){
                        for(int i = 0; i < itemidhabitacion.length; i++){
                            idtipohabitacion = Integer.parseInt(itemidhabitacion[i].trim());
                        }
                    }
                    if(itemidcama != null){
                        for(int i = 0; i < itemidcama.length; i++){
                            idtipocama = Integer.parseInt(itemidcama[i].trim());
                        }
                    }
                    if(itestado != null){
                        for(int i = 0; i < itestado.length; i++){
                            estadohabitacion = Integer.parseInt(itestado[i].trim());
                        }
                    }
                }catch(NumberFormatException e){ // handle your exception
                    
                 }
                
                
               h.setNumerohabitacion(numero);
               h.setPreciohabitacion(precio);
               h.setIdtipohabitacion(idtipohabitacion);
               h.setIdtipocama(idtipocama);
               h.setIdestadohabitacion(estadohabitacion);
                
                h.insert();
                
                response.sendRedirect("index.jsp?pag=/habitaciones");
            }if(request.getParameter("btnborrarhabitacion") != null){
                int numerohabitacion = Integer.parseInt(request.getParameter("numerohabitacion").toString());
                h.setNumerohabitacion(numerohabitacion);
                h.delete();
                
                response.sendRedirect("index.jsp?pag=/habitaciones");
                
            }if(request.getParameter("btnasignarestado") != null){
                int numerohabitacion = Integer.parseInt(request.getParameter("numerohabitacion").toString());
                int estadohabitacion = Integer.parseInt(request.getParameter("estadohabitacion").toString());
                
                
                
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
                
                Reserva_has_Habitacion rhb = new Reserva_has_Habitacion();
                
                    if(estadohabitacion != 1){
                        rhb.setIdreserva(estadohabitacion);
                        rhb.setNumerohabitacion(numerohabitacion);

                        beans.Habitaciones.listado.add(rhb);

                    }else{
                        rhb.setIdreserva(estadohabitacion);
                        rhb.setNumerohabitacion(numerohabitacion);
                        
                        //beans.Habitaciones.listado.iterator();
                    }
                
                
                
            
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
