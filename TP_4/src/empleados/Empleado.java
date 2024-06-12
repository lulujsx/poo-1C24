package empleados;

public class Empleado {
	
	private String nombre;
	private float sueldo;
	
	public Empleado(String nom, float sueld){
		this.nombre = nom;
		this.sueldo = sueld;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setSueldo(float sueldo) {
		this.sueldo = sueldo;
	}
	
	public float getSueldo() {
		return this.sueldo;
	}

}
