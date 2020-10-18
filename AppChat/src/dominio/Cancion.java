package dominio;

public class Cancion {
	private String titulo;
	private String interprete;
	private Estilo estilo;
	private String rutaFichero;
	
	public Cancion(String titulo, String interprete, Estilo estilo, String rutaFichero) {
		this.titulo = titulo;
		this.interprete = interprete;
		this.estilo = estilo;
		this.rutaFichero = rutaFichero;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getInterprete() {
		return interprete;
	}
	
	public Estilo getEstilo() {
		return estilo;
	}

	public String getRutaFichero() {
		return rutaFichero;
	}
}
