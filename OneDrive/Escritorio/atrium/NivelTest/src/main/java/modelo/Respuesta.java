package modelo;

public class Respuesta {
	private String respuesta;
    private	boolean correcta;
	
	
	public boolean isCorrecta() {
		return correcta;
	}
	public void setCorrecta(boolean correcta) {
		this.correcta = correcta;
	}
	@Override
	public String toString() {
		return "Respuesta [respuesta=" + respuesta + ", correcta=" + correcta + "]";
	}

}
