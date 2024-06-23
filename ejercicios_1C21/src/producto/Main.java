package producto;

import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		Producto producto1 = new Producto(1,"Default",500,50);
		Producto producto2 = new Producto(2,"Default",200,10);
		Producto producto3 = new Producto(3,"Default",100,20);
		Producto producto4 = new Producto(4,"Default",500,2);
//		List<Producto> lista = new LinkedList<Producto>();
//		lista.add(producto1);
//		lista.add(producto2);
//		lista.add(producto3);
//		lista.add(producto4);
		Stock stock = new Stock();
		stock.agregar(producto1);
		stock.agregar(producto2);
		stock.agregar(producto3);
		stock.agregar(producto4);
		System.out.println(stock.posicion(2));
		stock.incrementar10(2);
		System.out.println(stock.posicion(2));
		System.out.println(stock.productosConMasDe(20));
		System.out.println(stock.productosConMenosDe(20));
	}

}
