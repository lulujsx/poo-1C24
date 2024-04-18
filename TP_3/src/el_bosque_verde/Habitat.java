package el_bosque_verde;

public class Habitat {
	
	private String nombre;
	private double area;
	private Especie especie;
	
	Habitat(String nom,double areax,Especie esp){
		this.nombre = nom;
		this.area = areax;
		this.especie = esp;
	}
	
	void setNombre(String nom1) {
		this.nombre = nom1;
	}
	String getNombre() {
		return this.nombre;
	}
	void setArea(double area1) {
		this.area = area1;
	}
	double getArea() {
		return this.area;
	}
	void setEspecie(Especie esp1) {
		this.especie = esp1;
	}
	Especie getEspecie() {
		return this.especie;
	}
	
}
