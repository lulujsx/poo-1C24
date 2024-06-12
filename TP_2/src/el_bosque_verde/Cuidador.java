package el_bosque_verde;

public class Cuidador {
	
	private String nombre;
	private int legajo;
	private double sueldo;
	private Especie especie;
	
	Cuidador(String nom, int leg, double sueldox, Especie esp){
		this.nombre = nom;
		this.legajo = leg;
		this.sueldo = sueldox;
		this.especie = esp;
	}
	Cuidador(String nom, int leg){
		this.nombre = nom;
		this.legajo = leg;
	}
	
	void setNombre(String nom1) {
		this.nombre = nom1;
	}
	String getNombre() {
		return this.nombre;
	}
	void setLegajo(int leg1) {
		this.legajo = leg1;
	}
	int getLegajo() {
		return this.legajo;
	}
	void setSueldo(double sueldox) {
		this.sueldo = sueldox;
	}
	double getSueldo() {
		return this.sueldo;
	}
	void setEspecie(Especie esp1) {
		this.especie = esp1;
	}
	Especie getEspecie() {
		return this.especie;
	}
}
