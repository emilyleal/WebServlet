package br.edu.senaisp.servlet;

public class Calculo {
	
	import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

	@WebServlet(urlPatterns = "/olamundo")

	public class Calculo extends HttpServlet {
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			String valor = req.getParameter("param");
			resp.getWriter().append("<html><h1>Teste de Olá" + valor + "</h1></html>");
		}

	}

	
	
	
	
}
