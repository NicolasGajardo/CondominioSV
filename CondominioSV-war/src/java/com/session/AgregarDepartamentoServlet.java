/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Departamento;
import persistencia.DepartamentoFacadeLocal;

/**
 *
 * @author ottoekog
 */
public class AgregarDepartamentoServlet extends HttpServlet {

    @EJB
    private DepartamentoFacadeLocal departamentoFacade;

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
        
        request.setCharacterEncoding("UTF-8");

        String edificio = request.getParameter("txt_edificio");
        Integer numero = Integer.parseInt(request.getParameter("txt_numero"));
        Integer habitaciones = Integer.parseInt(request.getParameter("txt_habitaciones"));
        Integer banos = Integer.parseInt(request.getParameter("txt_banos"));
        
        Departamento d = new Departamento();
        d.setEdificio(edificio);
        d.setBanos(banos);
        d.setNumero(numero);
        d.setHabitaciones(habitaciones);
        
        departamentoFacade.create(d);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Departamentos</title>");            
            out.println("<link href=\"semantic/semantic.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"        <script src=\"semantic/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n" +
"        <script src=\"semantic/semantic.min.js\" type=\"text/javascript\"></script></head>");
            out.println("<body>");
            out.println("<h1>EL DEPARTAMENTO "+ d.getEdificio() + " "+ d.getNumero() +" FUE CREADO EXITOSAMENTE</h1>");
            out.println("<a href='DepartamentoServlet'>AGREGAR OTRO DEPARTAMENTO</a>");
            out.println("</body>");
            out.println("</html>");
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
