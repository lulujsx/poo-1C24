package ordenamiento;
import java.util.*;

public class Persona implements Comparable<Persona>{

	private String nombre;
	private int edad;
	
	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
//	compareTo retorna 0, si las edades son iguales
//	Retorna negativo si la edad de "this" es menor que la edad de otraPersona
//	Retorna positivo si la edad de "this" es mayor que la edad de otraPersona

	@Override
	public int compareTo(Persona otraPersona) {
		//Vamos a comparar dos objetos Persona
		//Cuales son esos objetos? otraPersona(argumento) y this
		
//		if(this.getEdad() > otraPersona.edad) {
//			return 1; 
//		}
//		
//		if(this.getEdad() < otraPersona.edad) {
//			return -1;
//			
//		}
//		
//		return 0; // Las edades son iguales
		
		 return this.getEdad() - otraPersona.edad;
	}
	
	
	
	
}
