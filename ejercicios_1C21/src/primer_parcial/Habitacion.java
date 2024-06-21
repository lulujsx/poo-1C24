package primer_parcial;

public class Habitacion {
	
	//Atributos
	
	private int cant_mayores;
	private int cant_menores;
	
	//Constructor
	
	public Habitacion(int cant_my, int cant_mn) {
		this.cant_mayores = cant_my;
		this.cant_menores = cant_mn;
	}
	
	//Metodos
	
	public void setMayores(int cant) {
		this.cant_mayores = cant;
	}
	public int getMayores() {
		return this.cant_mayores;
	}
	public void setMenores(int cant) {
		this.cant_menores = cant;
	}
	public int getMenores() {
		return this.cant_menores;
	}
	public int getTotalPersonas() {
		return this.cant_mayores + this.cant_menores;
	}
	public boolean estaOcupada() {
		return this.cant_mayores + this.cant_menores > 0;
	}

}
