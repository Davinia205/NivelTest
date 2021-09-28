package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connection {
		/** Atributos accesibles para la conexión */
		public static DB_Connection instance = null;

		/** creamos objeto de la clase connection */
		public Connection conn;

		/**
		 * establecemos conexión con la base de datos
		 */
		public DB_Connection() throws SQLException {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "Marcromero32");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println("Error en conexión");
				e.printStackTrace();
			}
		}

		/** @return método que crea una instancia para conectar con la base de datos */
		public static DB_Connection estado() throws SQLException {
			if (instance == null) {
				instance = new DB_Connection();
			}
			return instance;
		}

		/** @return método get que permite obtener la conexión desde otra clase */
		public Connection getConn() {
			return conn;
			/** @return método que cierra la conexión */
		}

		/** @return método que cierra la conexión con la base de datos */
		public void cerrarConexion() {
			this.instance = null;
		}

}
