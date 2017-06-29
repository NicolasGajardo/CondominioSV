/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import persistencia.Residente;
import persistencia.ResidenteFacadeLocal;

/**
 *
 * @author ottoekog
 */
public class BuscarResidenteServlet extends HttpServlet {

    @EJB
    private ResidenteFacadeLocal residenteFacade;

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
            //            if(request.getParameter("txt_nombre")!=null){
//                residenteFacade.
//            }
            List<Residente> listaResidentes = residenteFacade.findAll();

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BuscarResidenteServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BuscarResidenteServlet at " + request.getContextPath() + "</h1>");
            out.println("<table>");
                out.println("<tr>");
                    out.println("<td>ID</td>");
                    out.println("<td>RUT</td>");
                    out.println("<td>NOMBRE</td>");
                    out.println("<td>DEPTO</td>");
                    out.println("<td>MODIFICAR</td>");
                    out.println("<td>ELIMINAR</td>");
                out.println("</tr>");
            for(Residente r : listaResidentes){
                out.println("<tr>");
                    out.println("<td>"+r.getId()+ "</td>");
                    out.println("<td>"+r.getRut()+ "</td>");
                    out.println("<td>"+r.getNombre()+ "</td>");
                    out.println("<td>"+r.getDepto()+ "</td>");
                    out.println("<td><a href='editar-residente.jsp?p_rut="+r.getRut()+"'>Editar</a></td>");
                    out.println("<td><a href='eliminar-residente.jsp?'>Eliminar</a></td>");
                out.println("</tr>");
            }
            out.println("</table>");
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
