package videoclub;

public class Pelicula extends Audiovisual {
	
	//Atributos
	private int anio;
	private String director;
	
	//Constructores 
	public Pelicula(String titulo, int anio, Genero genero, String director) {
		super(titulo,genero);
		setAnio(anio);
		setDirector(director);
	}
	
	public Pelicula(String titulo, String director) {
		this(titulo,0,Genero.No_Definido,director);
	}
	
	public Pelicula() {
		this("","");
	}

	
	//Metodos
	
	@Override
	public String toString() {
		return "Pelicula [titulo=" + super.getTitulo() + ", anio=" + anio + 
				", entregado=" + super.isEntregado() + ", genero=" 
				+ super.getGenero()+ ", director=" + director + "]";
	}


	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		if(anio <= 1985 || anio > 2024) {
			throw new Error("Ingrese un año correcto");
		}
		this.anio = anio;
	}

	

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	

	@Override
	public int compareTo(Entregable otra_peli) {
		Pelicula aux;
		if(otra_peli instanceof Pelicula) {
			aux = (Pelicula) otra_peli;
			return Integer.compare(this.anio, aux.anio);
		} else {
			throw new Error("Error de tipos");
		}
	}

	
	

}
