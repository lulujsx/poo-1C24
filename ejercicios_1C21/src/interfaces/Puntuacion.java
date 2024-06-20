package interfaces;

public class Puntuacion implements Reseteable {
	
	//Atributos
	private int valor;
	
	//Constructor parametrizado
	public Puntuacion(int valor) {
		this.valor = valor;
	}
	
	//Metodos
	@Override
	public void reset() {
		this.valor = 0;
		
	}
	@Override
	public String toString() {
		return "Puntuacion: " + this.valor;
	}

}
