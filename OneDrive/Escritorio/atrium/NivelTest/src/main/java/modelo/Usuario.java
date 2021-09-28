package modelo;

public class Usuario {
	int idUsuario;
	String nombre;
	String apellidos;
	String email;
	int edad;
	String nivel;
	
	
	public Usuario(String nombre, String apellidos, String email, int edad, String nivel) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.edad = edad;
		this.nivel = nivel;
	}

	
	public Usuario(int idUsuario, String nombre, String apellidos, String email, int edad, String nivel) {
		this.idUsuario = idUsuario;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.email = email;
		this.edad = edad;
		this.nivel = nivel;
	}


	public Usuario() {
	}


	@Override
	public String toString() {
		return "Usuario [idUsuario=" + idUsuario + ", nombre=" + nombre + ", apellidos=" + apellidos + ", email=" + email + ", edad=" + edad
				+ ", nivel=" + nivel + "]";
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public int getId() {
		return idUsuario;
	}


	public void setId(int id) {
		this.idUsuario = idUsuario;
	}


	public String getNivel() {
		return nivel;
	}


	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

}
