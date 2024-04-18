package TP_1;

public class Dueno {
	private String nombre;
	private int dni;
	
	public Dueno(String nom1,int dni1) {
		this.nombre = nom1;
		this.dni = dni1;
	}
	
	public void ordenarLadrar(Perro perrito) {
		System.out.println(this.nombre + " le ordena al pedro ladrar.");
		perrito.ladrar();
	}
	public void darDeComer(Perro perrito) {
		System.out.println(this.nombre + " le da de comer al perro.");
		perrito.comer();
	}
}
