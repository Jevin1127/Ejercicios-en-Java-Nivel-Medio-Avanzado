package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import modelo.Vehiculo;

public class VehiculoDAO {
	//metodo establecercon
		public static Connection establecerCon() {
			Connection con = null;
			try {
				//inicializar conexion
				String dbDriver = "com.mysql.jdbc.Driver";
				String dbURL = "jdbc:mysql://localhost:3306/";
				String dbName = "proyectoFinal";
				String dbUsername = "root";
				String dbcontrasena = "honduras2014";
				Class.forName(dbDriver);
				con= DriverManager.getConnection(dbURL + dbName, dbUsername, 
															dbcontrasena);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return con;
			
		}//fin establecerCon
		
		public static int registrar(Vehiculo v ) {
			int estatus=0;
			
			try {
				Connection con = VehiculoDAO.establecerCon();
				PreparedStatement ps= con.prepareStatement("INSERT INTO Vehiculo(codigoVehi,propietariovehi,tipoVehi,modelo,marca,color,precio) VALUES(?,?,?,?,?,?,?)");
				
				ps.setString(1, v.getTxtCodigo());
				ps.setString(2, v.getTxtPropietario());
				ps.setString(3, v.getTipo());
				ps.setString(4, v.getTxtModelo());
				ps.setString(5, v.getMarca());
				ps.setString(6, v.getTxtColor());
				ps.setString(7, v.getTxtPrecio());
				estatus=ps.executeUpdate();
				con.close();
				ps.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return estatus;
			
		}//fin agregar
		
}
