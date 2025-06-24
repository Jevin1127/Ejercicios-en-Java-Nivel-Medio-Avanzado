package sueldoEmp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CalcSueldo
 */
@WebServlet(description = "Calcular sueldo de empleado", urlPatterns = { "/CalcSueldo" })
public class CalcSueldo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CalcSueldo() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		float n1, n2, res=0;
		String opcion;
		response.setContentType("text/html");
		PrintWriter salida = null;
		salida = response.getWriter();
		
		try {
			n1 = Float.parseFloat(request.getParameter("txtNum1"));
			n2 = Float.parseFloat(request.getParameter("txtNum2"));
			opcion = request.getParameter("radioOper");
			
			switch(opcion) {
				case "SUMA": res = n1 + n2;
							break;
				case "RESTA": res = n1 - n2;
							break;
				case "MULTI": res = n1 * n2;
							break;
				case "DIVI": res = n1 / n2;
							break;
				default: salida.println("Opción no válida");
							break;
			}//fin del switch
			salida.println("<font color=orange> Operación: " + opcion + "</font>");
			salida.println("<br>");
			salida.println("<font size=14 color=green> El resultado es: " + res + "</font>");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			salida.println("<br><br>");
			salida.println("Regresar a la página principal <a href=index.html> Haga clic aquí</a>");
		}		
		
	}//fin de doGet

}
