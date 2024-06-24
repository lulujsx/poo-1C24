package diccionario;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Map<Integer,Producto> productos = new TreeMap<Integer,Producto>();
		Producto yerba = new Producto(123,1000);
		Producto azucar = new Producto(234,1000);
		Producto te = new Producto(333,1000);
		Producto arroz = new Producto(444,1000);
		Producto galletitas = new Producto(434,1000);
		
		productos.put(434, galletitas);
		productos.put(123, yerba);
		productos.put(234, azucar);
		productos.put(333, te);
		
		System.out.println(productos);
		
		//Recorrer un mapa
		for(Map.Entry<Integer,Producto> cadaUno : productos.entrySet()) {
			System.out.println(cadaUno);
		}
		

	}

}
