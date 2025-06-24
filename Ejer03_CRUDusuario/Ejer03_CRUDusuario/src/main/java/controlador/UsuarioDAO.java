package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import modelo.Usuario;

public class UsuarioDAO {

	public static Connection establecerCon() {
		Connection con = null;
		
		try {		
				
			//inicializar conexión
			String dbDriver = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306/";
			String dbNombre = "lenguaje3";
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
	
	public static int agregar(Usuario u) {
		int estatus = 0;
		
		try {
			Connection con = UsuarioDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("INSERT INTO usuario (nombre, contrasena, email, pais) " +
														"VALUES (?, ?, ?, ?)");
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getContrasena());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPais());
			
			estatus = ps.executeUpdate();
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
	}//fin agregar()
	
	public static List<Usuario> ConsultarTodosUsuarios(){
		List<Usuario> lista = new ArrayList<Usuario>();
		
		try {
			Connection con = UsuarioDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("Select * from usuario");
			ResultSet rs = ps.executeQuery();
			
			while (rs.next() ) {
				Usuario u = new Usuario();
				u.setId(rs.getInt(1));
				u.setNombre(rs.getString(2));
				u.setContrasena(rs.getString(3));
				u.setEmail(rs.getString(4));
				u.setPais(rs.getString(5));
				lista.add(u);				
			} //fin del while
			con.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return lista;		
	}//fin ConsultarTodosUsuarios()
	
	public static Usuario ConsultarEmpleadoPorCodigo(int id) {
		Usuario e = new Usuario();
		
		try {
			Connection con = UsuarioDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("Select * from usuario where id=?");
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e.setId(rs.getInt(1));
				e.setNombre(rs.getString(2));
				e.setContrasena(rs.getString(3));
				e.setEmail(rs.getString(4));
				e.setPais(rs.getString(5));
			}
			
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return e;
		
	} //fin de ConsultarEmpleadoPorCodigo 
	
	public static int actualizar(Usuario u) {
		int estatus =0;
		
		try {
			Connection con  =UsuarioDAO.establecerCon();
			PreparedStatement ps = con.prepareStatement("Update usuario set nombre=?, contrasena=?, " + 
									"email=?, pais=? where id=?;");
			ps.setString(1, u.getNombre());
			ps.setString(2, u.getContrasena());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getPais());
			ps.setInt(5, u.getId());
			
			estatus = ps.executeUpdate();
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return estatus;
		
	} //fin actualizar
	
} //fin UsuarioDAO
