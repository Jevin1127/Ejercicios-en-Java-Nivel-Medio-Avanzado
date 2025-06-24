package modelo;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import controlador.AlumnoDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class ConsultarAlumno
 */
@WebServlet("/ConsultarAlumno")
public class ConsultarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConsultarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		response.setContentType("text/html");
		PrintWriter imprimir = response.getWriter();
		imprimir.println("<a href='index.html'>Agregar alumno</a>");
		imprimir.println("<h1>Lista de alumnos</h1>");
		
		List<Alumno> lista = AlumnoDAO.ConsultarTodosAlumnos();
		
		imprimir.print("<table border='1' width='100%'>");
		imprimir.print("<tr><th>Código</th><th>Nombre</th><th>Numero de Cuenta</th><th>Carrera</th> " + 
				       "<th>Sexo</th><th>Modificar</th><th>Eliminar</th></tr>");
		
		for (Alumno u:lista) {
			imprimir.print("<tr><td>" + u.getId() + "</td><td>" + u.getNombre() + "</td><td>" + u.getNumerocuenta() +
					       "</td><td>" + u.getCarrera() + "</td><td>" + u.getSexo() + "</td><td>" +
					       "<a href='ModificarAlumno?id=" + u.getId() + "'>modificar</a></td><td>" +
					       "<a href='EliminarUsuario?id=" + u.getId() + "'>eliminar</a></td></tr>");
		} //fin del for
		imprimir.print("</table>");
		imprimir.close();
		
	}

	private void ConsultarTodosAlumnos() {
		// TODO Auto-generated method stub
		
	}

}
