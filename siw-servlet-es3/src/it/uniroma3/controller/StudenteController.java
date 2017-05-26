package it.uniroma3.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.studente.Studente;

/**
 * Servlet implementation class StudenteController
 */
@WebServlet("/studente")
public class StudenteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudenteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		/* GESTIONE DELLA RICHIESTA */
		
		String nome = request.getParameter("nome");
		String cognome = request.getParameter("cognome");
		Integer matricola = Integer.parseInt(request.getParameter("matricola"));
		
		String address = request.getRemoteAddr();
		String host = request.getRemoteHost();
		String user = request.getRemoteUser();
		String userAgent = request.getHeader("User-Agent");
		
		Studente studente = new Studente(nome,cognome,matricola);
		
		/* GESTIONE DELLA RISPOSTA */
		
		String servletCalling = "/mostraParametri";
		
		response.setContentType("text/html");
		
		request.setAttribute("studente", studente);
		request.setAttribute("address", address);
		request.setAttribute("host", host);
		request.setAttribute("user", user);
		request.setAttribute("userAgent", userAgent);

		ServletContext application  = getServletContext();
		RequestDispatcher rd = application.getRequestDispatcher(servletCalling);
		rd.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
