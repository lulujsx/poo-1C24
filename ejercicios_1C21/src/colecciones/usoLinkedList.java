package colecciones;
import java.util.LinkedList;

public class usoLinkedList {

	public static void main(String[] args) {
		LinkedList<String> lista = new LinkedList<String>();
		lista.add("Gracias");
		lista.add("Obrigado");
		lista.add("Thanks");
		lista.add("Arigato");
		System.out.println(lista.isEmpty());
		lista.remove("Gracias");
		System.out.println(lista.size());
		//recorrer lista
		for(String str : lista) {
			System.out.println(str);
		}


	}

}
