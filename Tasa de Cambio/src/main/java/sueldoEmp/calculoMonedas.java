package sueldoEmp;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class calculoMonedas
 */
@WebServlet(description = "Clase para calcular el dinero a convertir", urlPatterns = { "/calculoMonedas" })
public class calculoMonedas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public calculoMonedas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		double n1, res=0;
		String opcion;
		response.setContentType("text/html");
		PrintWriter salida = null;
		salida = response.getWriter();
		
		
		try {
			n1 = Float.parseFloat(request.getParameter("txtNum1"));
			opcion = request.getParameter("radioOper");
			
			switch(opcion) {
				case "HNLtoUSD": res = n1 * 0.040;
							break;
				case "HNLtoEUR": res = n1 * 0.037;
							break;
				default: salida.println("Opción no válida");
							break;
			}//fin del switch
			salida.println("<br>");
			salida.println("<font color=orange> Operación: " + opcion + "</font>");
			salida.println("<br>");
			salida.println("<font size=14 color=red> El resultado es: " + res + "</font>");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			salida.println("<br><br>");
			salida.println("Regresar a la página principal <a href=index.html> Haga clic aquí</a>");
		}	
		
	}

}
