package guitarras;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import guitarras.GuitarraDAO.ConexionDB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AgregarVehi
 */
@WebServlet("/AgregarVehi")
public class AgregarVehi extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public AgregarVehi() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			//inicializar bd
			Connection con = ConexionDB.initializeDatabase();
			
			//crear query
			PreparedStatement st = con.prepareStatement("Insert into vehiculo values (?, ?, ?, ?) ");
			st.setInt(1, Integer.parseInt(request.getParameter("txtID")));
			st.setString(2, request.getParameter("txtMarca"));
			st.setString(3, request.getParameter("txtModelo"));
			st.setInt(4, Integer.parseInt(request.getParameter("txtAnnio")));
			
			//ejecutar query
			st.executeUpdate();
			st.close();
			con.close();
			
			//Mostrar mensaje de confirmación
			PrintWriter salida = response.getWriter();
			salida.println("<html><body><b>El registro fue insertado correctamente</b></body></html>");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
