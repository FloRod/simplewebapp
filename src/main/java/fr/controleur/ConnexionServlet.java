package fr.controleur;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/connexion")
public class ConnexionServlet extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
				response.setContentType("text/html");
		response.sendRedirect(request.getContextPath() + "/vues/connexion.html");

	}
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Set response content type
				System.out.println("Coucou " + request.getParameter("identifiant"));
				System.out.println("ton mot de passe est " + request.getParameter("motDePasse"));

	}
}