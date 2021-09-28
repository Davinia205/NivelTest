package modelo;

import java.sql.SQLException;

import dao.DaoOpcion;
import dao.DaoPregunta;

public class Opciones {
	int idPreguntas;
	String textoOpcion;
	String correcta;
	
	
	public Opciones() {
	}
	
	
	public Opciones(int idPreguntas, String textoOpcion, String correcta) {
		this.idPreguntas = idPreguntas;
		this.textoOpcion = textoOpcion;
		this.correcta = correcta;
	}
	
	
	public int getIdPreguntas() {
		return idPreguntas;
	}
	public void setIdPreguntas(int idPreguntas) {
		this.idPreguntas = idPreguntas;
	}
	public String getTextoOpcion() {
		return textoOpcion;
	}
	public void setTextoOpcion(String textoOpcion) {
		this.textoOpcion = textoOpcion;
	}
	public String getCorrecta() {
		return correcta;
	}
	public void setCorrecta(String correcta) {
		this.correcta = correcta;
	}
	public void insertar() throws SQLException {
		//realizamos llamada al metodo DAO que se encarga de la gestión de JDBC con mysql.
		DaoOpcion.getInstance().insertardaoOpcion();
	}


	@Override
	public String toString() {
		return "Opciones [idPreguntas=" + idPreguntas + ", textoOpcion=" + textoOpcion
				+ ", correcta=" + correcta + "]";
	}
	
}
