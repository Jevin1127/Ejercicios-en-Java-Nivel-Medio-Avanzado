package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Tienda;

public class TiendaDAO {
	public static Connection conectar() {
		Connection con = null;	
		try {		
				
			//inicializar conexión
			String dbDriver = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306/";
			String dbNombre = "examen";
			String dbUsuario = "root";
			String dbContrasena = "unah21%*";
			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbURL + dbNombre, dbUsuario, dbContrasena);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}//fin del método conectar
	
	public static int agregarTDA(Tienda T) {
		int estatus = 0;
		
		try {
			Connection con = TiendaDAO.conectar();
			PreparedStatement ps = con.prepareStatement("INSERT INTO Tienda (IdTienda, NomTienda, DirTienda) " +
														"VALUES (?, ?, ?)");
			ps.setString(1, T.getIdTienda());
			ps.setString(2, T.getNomTienda());
			ps.setString(3, T.getDirTienda());			
			estatus = ps.executeUpdate();
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}//fin agregarTda()
	
	public static List<Tienda> ConsultarTodasTiendas(){
		List<Tienda> listaTda = new ArrayList<Tienda>();		
		try {
			Connection con = TiendaDAO.conectar(); 
			PreparedStatement ps = con.prepareStatement("Select * from tienda");
			ResultSet rs = ps.executeQuery();			
			while (rs.next() ) {
				Tienda t = new Tienda();
				t.setIdTienda(rs.getString(1));
				t.setNomTienda(rs.getString(2));
				t.setDirTienda(rs.getString(3));				
				listaTda.add(t);				
			} //fin del while
			con.close();			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listaTda;		
	}//fin ConsultarTodosUsuarios()
	
}//fin de la clase TiendaDAO
