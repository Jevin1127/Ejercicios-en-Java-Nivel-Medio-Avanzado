package guitarras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GuitarraDAO {

	public static class ConexionDB {
		protected static Connection initializeDatabase()
		throws SQLException, ClassNotFoundException
		{
			//Inicializar Base de datos
			String dbDriver = "com.mysql.jdbc.Driver";
			String dbURL = "jdbc:mysql://localhost:3306/";
			String dbName = "mitabla1";
			String dbUsername = "root";
			String dbPassword = "1234";
			Class.forName(dbDriver);
			Connection con= DriverManager.getConnection(dbURL + dbName, dbUsername, 
														dbPassword);
			return con;
		}
	}
}

