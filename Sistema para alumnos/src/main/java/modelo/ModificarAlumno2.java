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
 * Servlet implementation class ModificarAlumno2
 */
@WebServlet("/ModificarAlumno2")
public class ModificarAlumno2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificarAlumno2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		int estatus = 0;
		PrintWriter imprime = response.getWriter();
		int idAlumno = Integer.parseInt(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String numerocuenta = request.getParameter("numerocuenta");
		String carrera = request.getParameter("carrera");
		String sexo = request.getParameter("sexo");
		
		Alumno u = new Alumno();
		u.setId(idAlumno);
		u.setNombre(nombre);
		u.setNumerocuenta(numerocuenta);
		u.setCarrera(carrera);
		u.setSexo(sexo);	
		
		estatus = AlumnoDAO.agregar(u);

		
		if (estatus>0) {
			response.sendRedirect("ConsultarAlumno");
		}else {
			imprime.println("Ha ocurrido un error!!");
		}
		imprime.close();
		
		
		
	}

}
