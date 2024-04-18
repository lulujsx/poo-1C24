package TP_1;

public class Main {
public static void main(String[] args) {
	Perro perro1 = new Perro("Spike");
	System.out.println("Se creo el objeto perro1 de la clase Perro.");
	
	Dueno juan = new Dueno("Juan",21);
	System.out.println("Se creo el objeto dueno1 de la clase Dueno.");
	juan.ordenarLadrar(perro1);
	juan.darDeComer(perro1);
	perro1.moverLaCola();
}
}
