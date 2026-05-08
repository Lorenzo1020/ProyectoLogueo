package Modelo;

public class Usuarios {

	private String usuario;
	private String contrasena;
	private boolean estatus;

	public Usuarios(String usuario, String contrasena, boolean estatus) {
		this.usuario = usuario;
		this.contrasena = contrasena;
		this.estatus = estatus;
	}

	@Override
	public String toString() {
		return "Usuarios [usuario=" + usuario + ", contrasena=" + contrasena + ", estatus=" + estatus + "]\n";
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

}
