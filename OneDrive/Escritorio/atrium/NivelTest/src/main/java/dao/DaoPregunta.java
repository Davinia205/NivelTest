package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Opciones;
import modelo.Pregunta;

public class DaoPregunta {
	/**instanciamos un objeto de la clase DBconnection*/
	private static DB_Connection conn = null;
	/**creamos una instancia de la clase*/
	public static DaoPregunta instance = null;
	/**@return método que conecta con la base de datos*/
	public DaoPregunta() throws SQLException {
		conn = DB_Connection.estado();
	}
    /**
     * @return método que genera un objeto de la clase
     */
	public static DaoPregunta getInstance() throws SQLException {
		
		if (instance == null)
			instance = new DaoPregunta();
		return instance;
 
    }
	/**@return 
	 * @return método que inserta un objeto de la clase Miembro en la base de datos*/
	public void insertardao(Pregunta p, Opciones o) throws SQLException {
		int idPreg = 0;
		PreparedStatement ps = conn.getConn().prepareStatement("INSERT INTO preguntas (texto, puntuacion) VALUES (?, ?)", PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setString(1, p.getTexto());
		ps.setInt(2, p.getPuntuacion());
		ps.executeUpdate();
		ResultSet rs = ps.getGeneratedKeys();
		if(rs != null && rs.next()){
            idPreg = rs.getInt(1);
        } else {
        	throw new SQLException ("No generated section ID returned");
        }
		PreparedStatement ps2 = conn.getConn().prepareStatement("INSERT INTO opciones (idPreguntas, textoOpcion, correcta) VALUES (?, ?, ?)");
		
		ps2.setInt(1, idPreg);
		ps2.setString(2, o.getTextoOpcion());
		ps2.setString(3, o.getCorrecta());
		ps.executeUpdate();
		ps2.executeUpdate();
		ps.close();
        ps2.close();
		
     }
		
	}

	
			    

	
			
		
	
	
	





