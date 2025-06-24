package Modelo;

import java.io.IOException;
import java.io.PrintWriter;

import Controlador.TiendaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/AgregarTda")
public class AgregarTda extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int estatus = 0;
		Tienda t = new Tienda();
		PrintWriter imprime = response.getWriter();
		
		String id = request.getParameter("txtIdTda");
		String nombre = request.getParameter("txtNomTda");
		String direccion = request.getParameter("txtDirTda");
		
		t.setIdTienda(id);
		t.setNomTienda(nombre);
		t.setDirTienda(direccion);
	
		
		estatus = TiendaDAO.agregarTDA(t);
		if (estatus>0) {
			imprime.print("<p>La nueva tienda ha sido agregada</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
			imprime.println("No es posible agregar el registro");
		}
	}//fin método doPost
}//fin servlet AgregarTda
