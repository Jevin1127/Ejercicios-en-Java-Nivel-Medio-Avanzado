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
 * Servlet implementation class ModificarUsuario
 */
@WebServlet("/ModificarUsuario")
public class ModificarUsuario extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ModificarUsuario() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int estatus = 0;
		int idUsuario;
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.println("<h1>Modificar usuario</h1>");
		idUsuario = Integer.parseInt(request.getParameter("id"));
		Usuario u = UsuarioDAO.ConsultarEmpleadoPorCodigo(idUsuario);
		//Llenar formulario
		salida.print("<form action='ModificarUsuario2' method='post'>");
		salida.print("<table>");
		salida.print("<tr><td></td><td><input type='hidden' name='id' value='"+ u.getId() + "'/></td></tr>");
		salida.print("<tr><td>Nombre</td><td><input type='text' name='nombre' value='"+u.getNombre()+"'/></td></tr>");
		salida.print("<tr><td>Contraseña</td><td><input type='password' name='contrasena' value='"+u.getContrasena() +"'/></td></tr>");
		salida.print("<tr><td>Email</td><td><input type='email' name='email' value='"+ u.getEmail()+"'/></td></tr>");
		salida.print("<tr><td>Pais</td><td><input type='text' name='pais' value='"+ u.getPais()+"'/></td></tr>");
		salida.print("<tr><td colspan='2'><input type='submit' value='Guardar'/></td></tr>");
		salida.print("</table>");
		salida.print("</form>");
		salida.close();
		
	}

}
