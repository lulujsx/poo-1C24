package TP_0;

public class Perro {
	
	private String nombre;
	
	public Perro(String nom1) {
		this.nombre = nom1;
	}
	
	public void ladrar() {
		System.out.println("*" + this.nombre +" ladra: Guau,guau*");
	}
	public void comer() {
		System.out.println("*" + this.nombre + " come*");
	}
	public void jugar() {
		System.out.println("*" + this.nombre + " está jugando*");
	}
	public void moverLaCola() {
		System.out.println("*" + this.nombre + " mueve la cola*");
	}
}
