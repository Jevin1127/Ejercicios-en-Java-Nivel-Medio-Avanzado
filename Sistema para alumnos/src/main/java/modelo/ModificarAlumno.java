package modelo;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

import controlador.AlumnoDAO;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ModificarAlumno
 */
@WebServlet("/ModificarAlumno")
public class ModificarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int estatus = 0;
		int idAlumno;
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		salida.println("<h1>Modificar Alumno</h1>");
		idAlumno = Integer.parseInt(request.getParameter("id"));
		Alumno u = AlumnoDAO.ConsultarAlumnoPorCodigo(idAlumno);
		
		//Llenar formulario
		salida.print("<form action='ModificarAlumno2' method='post'>");
		salida.print("<table>");
		salida.print("<tr><td></td><td><input type='hidden' name='id' value='"+ u.getId() + "'/></td></tr>");
		salida.print("<tr><td>Nombre</td><td><input type='text' name='nombre' value='"+u.getNombre()+"'/></td></tr>");
		salida.print("<tr><td>Numero de Cuenta</td><td><input type='text' name='numerocuenta' value='"+u.getNumerocuenta() +"'/></td></tr>");
		salida.print("<tr><td>Carrera</td><td><input type='text' name='carrera' value='"+ u.getCarrera()+"'/></td></tr>");
		salida.print("<tr><td>Sexo</td><td><input type='text' name='sexo' value='"+ u.getSexo()+"'/></td></tr>");
		salida.print("<tr><td colspan='2'><input type='submit' value='Guardar'/></td></tr>");
		salida.print("</table>");
		salida.print("</form>");
		salida.close();
		

		
		
	}

}
