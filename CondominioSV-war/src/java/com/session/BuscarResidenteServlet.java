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
            List<Residente> listaResidentes;
            if(request.getParameter("txt_id")!=null && !request.getParameter("txt_id").trim().equals("")){
                System.out.println("ott" + request.getParameter("txt_id"));
                listaResidentes = residenteFacade.buscarResidentePorId(Integer.parseInt(request.getParameter("txt_id")));
            } else if (request.getParameter("txt_rut")!=null && !request.getParameter("txt_rut").trim().equals("")){
                listaResidentes = residenteFacade.buscarResidentePorRut(request.getParameter("txt_rut"));
            } else if (request.getParameter("txt_nombre")!=null && !request.getParameter("txt_nombre").trim().equals("")){
                listaResidentes = residenteFacade.buscarResidentePorNombre(request.getParameter("txt_nombre"));
            } else if (request.getParameter("txt_depto")!=null && !request.getParameter("txt_depto").trim().equals("")){
                listaResidentes = residenteFacade.buscarResidentePorDepto(request.getParameter("txt_depto"));
            } else {
                listaResidentes = residenteFacade.findAll();
            }
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Residentes</title>"
                    + "<link href=\"semantic/semantic.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n" +
"                       <script src=\"semantic/jquery-3.2.1.min.js\" type=\"text/javascript\"></script>\n" +
"                       <script src=\"semantic/semantic.min.js\" type=\"text/javascript\"></script>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LISTADO DE RESIDENTES</h1>");
            out.println("<div class=\"ui segment\">");
            out.println("<table class=\"ui celled table\">");
            out.println("<thead>");
                out.println("<tr>");
                    out.println("<th class=\"single line\">ID</th>");
                    out.println("<th>RUT</th>");
                    out.println("<th>NOMBRE</th>");
                    out.println("<th>DEPTO</th>");
                    out.println("<th>MODIFICAR</th>");
                    out.println("<th>ELIMINAR</th>");
                out.println("</tr>");
            out.println("</thead>");
            out.println("<tbody>");
            if(listaResidentes.size()>0){
                for(Residente r : listaResidentes){
                    out.println("<tr>");
                        out.println("<td>"+r.getId()+ "</td>");
                        out.println("<td>"+r.getRut()+ "</td>");
                        out.println("<td>"+r.getNombre()+ "</td>");
                        out.println("<td>"+r.getDepto()+ "</td>");
                        out.println("<td><a href='editar-residente.jsp?p_id="+r.getId()+"&p_rut="+r.getRut()+"&p_nombre="+r.getNombre()+"&p_depto="+r.getDepto()+"'>Editar</a></td>");
                        out.println("<td><a href='eliminar-residente.jsp?p_id="+r.getId()+"&p_nombre="+r.getNombre()+"'>Eliminar</a></td>");
                    out.println("</tr>");
                }
            } else {
                out.println("<tr><td style=\"text-align:center;\" colspan='6'>NO SE HAN ENCONTRADO RESULTADOS</td></tr>");
            }
            out.println("</tbody></table></div>");
            out.println("<br><a href='Residentes'>VOLVER A BUSQUEDA</a>");
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
