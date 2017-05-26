package it.uniroma3.controller;

import java.io.IOException;
import java.io.PrintWriter;

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
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>"); out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>mostra parametri</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dati inseriti nella form</h1>");
		out.println("<ul>");
		out.println("<li>Nome: <b>"+studente.getNome()+"</b></li>");
		out.println("<li>Cognome: <b>"+studente.getCognome()+"</b></li>");
		out.println("<li>Matricola: <b>"+studente.getMatricola()+"</b></li>");
		out.println("</ul>");
		out.println("<h1>Altri dati relativi alla richiesta</h1>");
		out.println("<br />IP: <b>"+address+"</b>");
		out.println("<br />Host: <b>"+host+"</b>");
		out.println("<br />User: <b>"+user+"</b>");
		out.println("<br />User Agent: <b>"+userAgent+"</b>");
		out.println("</body>\n</html> ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
