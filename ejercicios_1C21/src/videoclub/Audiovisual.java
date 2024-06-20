package videoclub;

public abstract class Audiovisual implements Entregable {
	
	private String titulo;
	private boolean entregado = false;
	private Genero genero;
	
	public Audiovisual(String titulo, Genero genero) {
		setTitulo(titulo);
		setGenero(genero);
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	
	@Override
	public void entregar() {
		this.entregado = true;
	}

	@Override
	public void devolver() {
		if(this.entregado == true)
			this.entregado = false;
		
	}

	@Override
	public boolean isEntregado() {
		return this.entregado;
	}



}
