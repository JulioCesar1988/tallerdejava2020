package com.tallerjava;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Menu
 */
@WebServlet("/Menu")
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String email = request.getParameter("email");
		String clave = request.getParameter("pwd");
		String perfil = request.getParameter("perfil");
		System.out.println(" Usuario : " + email);
		System.out.println(" Clave : " + clave);
		System.out.println(" Perfil : " + perfil);
		switch (perfil) {
		case "administrador":
			// code block
			response.sendRedirect("http://localhost:8080/taller2020/administrador.html");
			break;
		case "publicador":
			// code block
			response.sendRedirect("http://localhost:8080/taller2020/publicador.html");
			break;
		default:
			// code block
			response.sendRedirect("http://localhost:8080/taller2020/error.html");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
