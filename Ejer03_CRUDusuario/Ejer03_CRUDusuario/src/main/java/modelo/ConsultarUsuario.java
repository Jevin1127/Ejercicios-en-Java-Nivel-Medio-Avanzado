package modelo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import controlador.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ConsultarUsuario
 */
@WebServlet("/ConsultarUsuario")
public class ConsultarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ConsultarUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter imprimir = response.getWriter();
		imprimir.println("<a href='index.html'>Agregar usuario</a>");
		imprimir.println("<h1>Lista de usuarios</h1>");
		
		List<Usuario> lista = UsuarioDAO.ConsultarTodosUsuarios();
		
		imprimir.print("<table border='1' width='100%'>");
		imprimir.print("<tr><th>Código</th><th>Nombre</th><th>Contraseña</th><th>Email</th> " + 
				       "<th>País</th><th>Modificar</th><th>Eliminar</th></tr>");
		for (Usuario u:lista) {
			imprimir.print("<tr><td>" + u.getId() + "</td><td>" + u.getNombre() + "</td><td>" + u.getContrasena() +
					       "</td><td>" + u.getEmail() + "</td><td>" + u.getPais() + "</td><td>" +
					       "<a href='ModificarUsuario?id=" + u.getId() + "'>modificar</a></td><td>" +
					       "<a href='EliminarUsuario?id=" + u.getId() + "'>eliminar</a></td></tr>");
		} //fin del for
		imprimir.print("</table>");
		imprimir.close();
	}

}
