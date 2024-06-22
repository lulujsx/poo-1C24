package colecciones;
import java.util.concurrent.ConcurrentLinkedQueue;

public class usoQueue {
	public static void main(String[] args) {
		ConcurrentLinkedQueue<String> cola = new ConcurrentLinkedQueue<String>();
		cola.offer("Gracias");
		cola.offer("Obrigado");
		cola.offer("Thanks");
		cola.offer("Arigato");
		cola.poll();
		System.out.println(cola.peek());
		//recorrer cola
		ConcurrentLinkedQueue<String> colaux = new ConcurrentLinkedQueue<String>();
		while(!cola.isEmpty()) {
			String dato = cola.poll();
			System.out.println(dato);
			colaux.offer(dato);
		}
		while(!colaux.isEmpty()) {
			cola.offer(colaux.poll());
		}
	}

}
