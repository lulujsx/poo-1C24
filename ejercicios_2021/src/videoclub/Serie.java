package videoclub;

public class Serie extends Audiovisual {
	
	private int temporadas;
	private String creador;

	public Serie(String titulo, Genero genero, int temporadas,String creador) {
		super(titulo, genero);
		this.temporadas = temporadas;
		this.creador = creador;
		
	}

	@Override
	public int compareTo(Entregable otraSerie) {
		Serie aux;
		if(otraSerie instanceof Serie) {
			aux = (Serie) otraSerie;
			return Integer.compare(this.temporadas, aux.temporadas);
		}
	}

}
