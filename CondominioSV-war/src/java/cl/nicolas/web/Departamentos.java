package cl.nicolas.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Departamento
 */
@WebServlet("/Departamentos")
public class Departamentos extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String URL_PATH = "/WEB-INF/Departamentos.jsp";

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Departamentos() {
	super();
	// TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(URL_PATH);
	dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	this.doNothing();
    }

    private void doNothing(){}
}
