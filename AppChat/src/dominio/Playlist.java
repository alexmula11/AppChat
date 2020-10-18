package dominio;

import java.util.ArrayList;


public class Playlist {

	private String nombre;
	private ArrayList<Cancion> lista;
	private int actual;
	
	public Playlist(String nombre) {
		this.nombre = nombre;
		this.lista = new ArrayList<Cancion>();
		this.actual = 0;
	}
	
	public boolean add(Cancion cancion) {
		return lista.add(cancion);
	}
	
	public boolean delete(Cancion cancion) {
		return lista.remove(cancion);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Cancion getActual() {
		return lista.get(actual);
	}
	
	public Cancion getSiguiente() {
		this.actual = this.actual++ % lista.size();
		return lista.get(actual);
	}
	
	public Cancion getAnterior() {
		if (actual > 0)
			this.actual = this.actual--;
		else 
			this.actual = lista.size() - 1;
		return lista.get(actual);
	}
}
