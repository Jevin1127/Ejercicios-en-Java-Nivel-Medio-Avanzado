package modelo;

import java.io.IOException;
import java.io.PrintWriter;

import controlador.UsuarioDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgregarUsuario
 */
@WebServlet("/AgregarUsuario")
public class AgregarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AgregarUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		int estatus = 0;
		Usuario u = new Usuario();
		PrintWriter imprime = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String contrasena = request.getParameter("contrasena");
		String email = request.getParameter("email");
		String pais = request.getParameter("pais");
		
		u.setNombre(nombre);
		u.setContrasena(contrasena);
		u.setEmail(email);
		u.setPais(pais);
		
		estatus = UsuarioDAO.agregar(u);
		if (estatus>0) {
			imprime.print("<p>El usuario ha sido agregado</p>");
			request.getRequestDispatcher("index.html").include(request, response);
		}
		else {
			imprime.println("No es posible agregar el registro");
		}
		
	} //fin doPost

}
