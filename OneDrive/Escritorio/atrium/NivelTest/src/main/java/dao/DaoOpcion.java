package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import modelo.Opciones;
import modelo.Pregunta;

public class DaoOpcion {
		/**instanciamos un objeto de la clase DBconnection*/
		private static DB_Connection conn = null;
		/**creamos una instancia de la clase*/
		public static DaoOpcion instance = null;
		/**@return método que conecta con la base de datos*/
		public DaoOpcion() throws SQLException {
			conn = DB_Connection.estado();
		}
	    /**
	     * @return método que genera un objeto de la clase
	     */
		public static DaoOpcion getInstance() throws SQLException {
			
			if (instance == null)
				instance = new DaoOpcion();
			return instance;
	 
	    }
		/**@return método que inserta un objeto de la clase Miembro en la base de datos*/
		public void insertardaoOpcion () throws SQLException {
			Opciones o = new Opciones();
			Pregunta p = new Pregunta();
			PreparedStatement ps = conn.getConn().prepareStatement("INSERT INTO opciones (idPreguntas, textoOpcion, correcta) VALUES (?, ?, ?)");
			ps.setInt(1, p.getIdPreguntas());
			ps.setString(2, o.getTextoOpcion());
			ps.setString(3, o.getCorrecta());
			ps.executeUpdate();
			ps.close();
	        
	}

	}



