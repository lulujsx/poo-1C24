package ordenamiento;
import java.util.*;

public class SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(1);
		lista.add(3);
		lista.add(2);
		lista.add(4);
		System.out.println(lista);
		
		//Ordeno la lista
		Collections.sort(lista);
		
		System.out.println(lista);
		
		Persona persona1 = new Persona("Lu",26);
		Persona persona2 = new Persona("Adri",33);
		Persona persona3 = new Persona("Peque",21);
		ArrayList<Persona> lista_personas = new ArrayList<Persona>();
		lista_personas.add(persona1);
		lista_personas.add(persona2);
		lista_personas.add(persona3);
		System.out.println(lista_personas.isEmpty());
		Collections.sort(lista_personas);
		System.out.println(lista_personas);
		
		
		
	}
}
