package interfaces;

public class Punto implements Reseteable {
	
	//Atributos
	private double x;
	private double y;
	
	//Constructor parametrizado
	public Punto(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	//Constructor por defecto
	public Punto() {
		this(0.0, 0.0); //invoca al constructor parametrizado
	}
	
	//Metodos
	
	@Override
	public void reset() {
		this.x = 0.0;
		this.y = 0.0;
	}
	
	public double distancia(Punto o) {
		return Math.hypot(o.x - this.x, o.y - this.y); //Metodo que calcula la hipotenusa
	}
	
	//Representacion en cadena
	@Override
	public String toString() {
		return "Punto: [x: " + this.x + " y: " + this.y + "]";
	}
	
	

}
