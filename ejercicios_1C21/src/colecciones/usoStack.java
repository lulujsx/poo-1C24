package colecciones;
import java.util.Stack;


public class usoStack {

	public static void main(String[] args) {
		Stack<String> pila = new Stack<String>();
		System.out.println(pila.isEmpty());
		pila.push("Gracias");
		pila.push("Obrigado");
		pila.push("Thanks");
		pila.push("Arigato");
		System.out.println(pila.peek());
//		pila.pop();
		System.out.println(pila.peek());
		System.out.println("---------------");
		Stack<String> pilaux = new Stack<String>();
		while(!pila.isEmpty()) {
			String dato = pila.pop();
			System.out.println(dato);
			pilaux.push(dato);
		}
		while(!pilaux.isEmpty()) {
			pila.push(pilaux.pop());
		}
	}

}
