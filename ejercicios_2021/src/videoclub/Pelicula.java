package videoclub;

public class Pelicula {
	
	//Atributos
	private String titulo;
	private int anio;
	private boolean entregado = false;
	private Genero genero;
	private String director;
	
	//Constructor 
	public Pelicula(String titulo, int anio, Genero genero, String director) {
		super();
		this.titulo = titulo;
		this.anio = anio;
		this.genero = genero;
		this.director = director;
	}
	
	

}
