package it.uniroma3.misc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import it.uniroma3.studente.Studente;

/**
 * Servlet implementation class MostraParametri
 */
@WebServlet("/mostraParametri")
public class MostraParametri extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MostraParametri() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		/* GESTIONE RICHIESTA */

		Studente studente = (Studente) request.getAttribute("studente");
		String host = (String) request.getAttribute("host");
		String address = (String) request.getAttribute("address");
		String user = (String) request.getAttribute("user");
		String userAgent = (String) request.getAttribute("userAgent");

		/* GESTIONE RISPOSTA */

		PrintWriter out = response.getWriter();

		response.setContentType("text/html");

		out.println("<!DOCTYPE html>"); 
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\" />");
		out.println("<title>mostra parametri</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Dati inseriti nella form</h1>");
		out.println("<ul>");
		out.println("<li>Nome: <b>"+ studente.getNome() +"</b></li>");
		out.println("<li>Cognome: <b>"+ studente.getCognome() +"</b></li>");
		out.println("<li>Matricola: <b>"+ studente.getMatricola() +"</b></li>");
		out.println("</ul>");
		out.println("<h1>Altri dati relativi alla richiesta</h1>");
		out.println("<br />IP: <b>"+ address +"</b>");
		out.println("<br />Host: <b>"+ host +"</b>");
		out.println("<br />User: <b>"+ user +"</b>");
		out.println("<br />User Agent: <b>"+ userAgent +"</b>");
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
