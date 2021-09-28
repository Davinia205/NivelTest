package modelo;

import java.sql.SQLException;

import dao.DaoPregunta;
import modelo.Opciones;

public class Pregunta {
    

	private int idPreguntas;
	private String texto;
	private int puntuacion;
	private Opciones listado[]=new Opciones[3];
	


	public Pregunta(int idPreguntas, String texto, int puntuacion, Opciones[] listado) {
		this.idPreguntas= idPreguntas;
		this.texto = texto;
		this.puntuacion = puntuacion;
		this.listado = listado;
	}

	

	public Pregunta(String texto, int puntuacion) {
		this.texto = texto;
		this.puntuacion = puntuacion;
	}



	public Pregunta(int idPreguntas, String texto, int puntuacion) {
		this.idPreguntas = idPreguntas;
		this.texto = texto;
		this.puntuacion = puntuacion;
	}



	public Pregunta() {
	}
	
	public int getIdPreguntas() {
		return idPreguntas;
	}


	public void setIdPreguntas(int idPreguntas) {
		this.idPreguntas = idPreguntas;
	}

	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public int getPuntuacion() {
		return puntuacion;
	}


	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	public Opciones[] getListado() {
		return listado;
	}


	public void setListado(Opciones[] listado) {
		this.listado = listado;
	}	
	
	
	
	@Override
	public String toString() {
		return "Pregunta [idPreguntas=" + idPreguntas + ", texto=" + texto + ", puntuacion=" + puntuacion + "]";
	}



	public void insertar(Opciones o) throws SQLException {
		DaoPregunta.getInstance().insertardao(this, o);
	}
	
  
}
