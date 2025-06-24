package modelo;

import jakarta.servlet.http.HttpServlet;
import java.io.IOException;

import controlador.AlumnoDAO;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EliminarAlumno
 */
@WebServlet("/EliminarAlumno")
public class EliminarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String sIdAlumno = request.getParameter("id");
		int idAlumno= Integer.parseInt(sIdAlumno);
		
		AlumnoDAO.borrar(idAlumno);
		response.sendRedirect("ConsultarAlumno");
		
	}

}
