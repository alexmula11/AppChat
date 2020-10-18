package dominio;

import java.util.Date;
import java.util.LinkedList;

public class Usuario {
	private String nombre;
	private String apellidos;
	private Date fechaNacimiento;
	private String email;
	private String username;
	private String contraseña;
	private boolean premium;
	private Recientes recientes;
	private LinkedList<Playlist> playlists;
	
	
	public Usuario(String nombre, String apellidos, Date fechaNacimiento, String email, String username, String contraseña) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
		this.email = email;
		this.username = username;
		this.contraseña = contraseña;
		this.premium = false;
		this.recientes = new Recientes();
		this.playlists = new LinkedList<Playlist>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getContraseña() {
		return contraseña;
	}
	
	public boolean isPremium() {
		return premium;
	}
	
	public void doPremium() {
		this.premium = true;
	}
	
	public void undoPremium() {
		this.premium = false;
	}
	
}
