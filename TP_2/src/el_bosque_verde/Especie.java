package el_bosque_verde;

public class Especie {
	
	private String nombre;
	private String tipo;
	private int cantidad;
	private Habitat habitat;
	
	Especie(String nombre1, String tipo1, int cant, Habitat habitat1) {
		this.nombre = nombre1;
		this.tipo = tipo1;
		this.cantidad = cant;
		this.habitat = habitat1;
	}
	
	Especie(String nombre1, String tipo1, int cant) {
		this.nombre = nombre1;
		this.tipo = tipo1;
		this.cantidad = cant;
	}
	
	void setNombre(String nombrex) {
		this.nombre = nombrex;
	}
	
	String getNombre() {
		return this.nombre;
	}
	
	void setTipo(String tipox) {
		this.tipo = tipox;
	}
	
	String getTipo() {
		return this.tipo;
	}
	
	void setCantidad(int cantx) {
		this.cantidad = cantx;
	}
	
	int getCantidad() {
		return this.cantidad;
	}

	void setHabitat(Habitat habitatx) {
		this.habitat = habitatx;
	}
	
	Habitat getHabitat() {
		return this.habitat;
	}
	
	@Override
	public String toString() {
		return "[" + this.getNombre() + " tipo: " + this.getTipo() 
		+ " cantidad: " + this.getCantidad() + " habitat: " + this.getHabitat() + "]";
	}
}
