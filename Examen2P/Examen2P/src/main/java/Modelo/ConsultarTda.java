package Modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Controlador.TiendaDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/ConsultarTda")
public class ConsultarTda extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter imprimir = response.getWriter();
		imprimir.println("<a href='index.html'>Agregar usuario</a>");
		imprimir.println("<h1>Lista de usuarios</h1>");
		
		List<Tienda> lista = TiendaDAO.ConsultarTodasTiendas(); 		
		imprimir.print("<table border='2' width='100%'>");
		imprimir.print("<tr><th>Código</th><th>Nombre</th><th>Dirección</th>" +
					   "<th>modificar</th><th>eliminar</th></tr>");
		for (Tienda t:lista) {
			imprimir.print("<tr><td>" + t.getIdTienda() + "</td><td>" + t.getNomTienda() + "</td><td>" + t.getDirTienda() + 
						   "<td><a href='ModificarTda?IdTienda=" + t.getIdTienda() + "'>modificar</a></td>" +
						   "<td><a href='EliminarTda?IdTienda=" + t.getIdTienda() + "'>eliminar</a></td></tr>");
		} //fin del for
		imprimir.print("</table>");
		imprimir.close();
	}//fin método doGet
} //fin servlet ConsultarTda
