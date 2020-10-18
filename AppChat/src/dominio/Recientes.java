package dominio;

import java.util.ArrayList;

public class Recientes {
	private static final int CANTIDAD = 10;
	
	private ArrayList<Cancion> lista;
	private int actual;
	private int indice;
	
	public Recientes() {
		this.lista = new ArrayList<Cancion>(CANTIDAD);
		this.actual = 0;
		this.indice = CANTIDAD -1;
	}
	
	public void actualiza (Cancion cancion) {
		lista.set(indice, cancion);
		if (indice > 0) indice--;
		else indice = CANTIDAD -1;
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
