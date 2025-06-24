package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Alumno;


public class AlumnoDAO {
	
	public static Connection establecerCon() {
		Connection con = null;
		
		try {						
			//inicializar conexión
			String dbDriver = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306/";
			String dbNombre = "prueba1";
			String dbUsuario = "root";
			String dbContrasena = "1234";
			Class.forName(dbDriver);
			con = DriverManager.getConnection(dbURL + dbNombre, dbUsuario, dbContrasena);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}//fin establecerCon()

	public static int agregar(Alumno u) {
		int estatus = 0;
		
		try {
			Connection con = AlumnoDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO alumno (nombre, numerocuenta, carrera, sexo) " +
														"VALUES (?, ?, ?, ?)");

			ps.setString(1, u.getNombre());
			ps.setString(2, u.getNumerocuenta());
			ps.setString(3, u.getCarrera());
			ps.setString(4, u.getSexo());
			
			estatus = ps.executeUpdate();
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}//fin agregar()
	
	
	public static List<Alumno> ConsultarTodosAlumnos(){

		List <Alumno> lista = new ArrayList<Alumno>();
		
		try {
			Connection con = AlumnoDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("Select * from alumno");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() ) {
				Alumno u = new Alumno();
				u.setId(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setNumerocuenta(rs.getString(3));
				u.setCarrera(rs.getString(4));
				u.setSexo(rs.getString(5));
				lista.add(u);				
			} //fin del while
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return lista;
	}//fin de consultar alumno
	
	
	public static Alumno ConsultarAlumnoPorCodigo(int id) {
		
		Alumno e = new Alumno();
		
		try {
			Connection con = AlumnoDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("Select * from alumno where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e.setId(rs.getInt(1));
				e.setNombre(rs.getString(2));
				e.setNumerocuenta(rs.getString(3));
				e.setCarrera(rs.getString(4));
				e.setSexo(rs.getString(5));
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}	
		return e;
	}//Fin modificar1 
	
	
	public static int consulta(Alumno u) {
		
		int estatus = 0;
		
		try {
			Connection con  = AlumnoDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("Update alumno set nombre=?, numerocuenta=?, " + 
									"carrera=?, sexo=? where id=?;");
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getNumerocuenta());
			ps.setString(3, u.getCarrera());
			ps.setString(4, u.getSexo());
			ps.setInt(5, u.getId());
			
			estatus = ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}//fin modificar
	

	public static int borrar(int id) {
		
		int estatus = 0;
		
		try (Connection con = AlumnoDAO.establecerCon();
				PreparedStatement ps = con.prepareStatement("Delete from alumno where id =?");) {
			ps.setInt(1, id);
			estatus = ps.executeUpdate();
			
		}
		catch (Exception e){
			
		}
		
		return estatus;
	}


	

	
}//fin AlumnoDAO
