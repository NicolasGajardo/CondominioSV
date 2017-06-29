package cl.nicolas.web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.nicolas.controller.AgendarController;
import cl.nicolas.controller.AgendarControllerImpl;

/**
 * Servlet implementation class Contactar
 */
@WebServlet("/Contactar")
public final class Contactar extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static final String URL_PATH_CONTACTAR = "/WEB-INF/Contactar.jsp";
    private static final String URL_PATH_FAIL = "/WEB-INF/html/fail.jsp";
    private static final String URL_PATH_SUCCESSFUL = "/WEB-INF/html/successful.jsp";
    private static final AgendarController agendarController = new AgendarControllerImpl();

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Contactar() {
	super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(URL_PATH_CONTACTAR);
	dispatcher.forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
     *      response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	    throws ServletException, IOException {
	// Formulario
	RequestDispatcher dispatcher;
	Map<String, String[]> parameters = request.getParameterMap();
	if (response.getStatus() != 200 && parameters == null) {
	    dispatcher = getServletContext().getRequestDispatcher(URL_PATH_FAIL);
	    response.setStatus(418);
	    dispatcher.forward(request, response);
	    return;
	}

	List<String> listString = null;
	try {
	    listString = new ArrayList<String>();
	    if (parameters.get("selected_dep") != null && parameters.get("selected_dep").toString() != null) {
		
		listString.add(parameters.get("selected_dep")[0].toString());
	    } else {
		throw new RuntimeException("departamento no seleccionado");
	    }

	    if (parameters.get("input_nombre") != null) {
		if("".equals(parameters.get("input_nombre")[0].toString().trim())){
			throw new RuntimeException("valor incorrecto");
		}
		listString.add(parameters.get("input_nombre")[0].toString());
	    }
	    if (parameters.get("input_apellido") != null) {
		listString.add(parameters.get("input_apellido")[0].toString());
	    }
	    if (parameters.get("input_celular") != null) {
		listString.add(parameters.get("input_celular")[0].toString());
	    }
	    if (parameters.get("input_telefono") != null) {
		listString.add(parameters.get("input_telefono")[0].toString());
	    }
	    if (parameters.get("input_email") != null) {
		listString.add(parameters.get("input_email")[0].toString());
	    }
	} catch (RuntimeException rTEx) {
	    dispatcher = getServletContext().getRequestDispatcher(URL_PATH_FAIL);
	    response.setStatus(418);
	    dispatcher.forward(request, response);
	    return;
	}

	boolean isAgendado = agendarController.agendar(listString);

	if (isAgendado) {
	    dispatcher = getServletContext().getRequestDispatcher(URL_PATH_SUCCESSFUL);
	    response.setStatus(200);
	    dispatcher.forward(request, response);
	    return;
	} else {
	    dispatcher = getServletContext().getRequestDispatcher(URL_PATH_FAIL);
	    response.setStatus(418);
	    dispatcher.forward(request, response);
	    return;
	}
    }

}
