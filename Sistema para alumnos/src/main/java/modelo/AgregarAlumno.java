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
 * Servlet implementation class AgregarAlumno
 */
@WebServlet("/AgregarAlumno")
public class AgregarAlumno extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarAlumno() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int estatus = 0;
		Alumno u = new Alumno();
		PrintWriter imprime = response.getWriter();
		
		String nombre = request.getParameter("nombre");
		String numerocuenta = request.getParameter("numerocuenta");
		String carrera = request.getParameter("carrera");
		String sexo = request.getParameter("sexo");
		
		u.setNombre(nombre);
		u.setNumerocuenta(numerocuenta);
		u.setCarrera(carrera);
		u.setSexo(sexo);
		
		estatus = AlumnoDAO.agregar(u);
		if (estatus>0) {
			imprime.print(" El alumno ha sido agregado");
			request.getRequestDispatcher("index.html ").include(request, response);
		}
		else {
			imprime.println(" No es posible agregar el registro del alumno");
		}
		
	}

}
