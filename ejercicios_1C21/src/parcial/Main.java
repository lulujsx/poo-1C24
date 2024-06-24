package parcial;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Tour tour1 = new Tour(123,"rory");
		Tour tour2 = new Tour(234,"adrian");
		Tour tour3 = new Tour(345,"lux");
		Stack<Tour> catalogo = new Stack<Tour>();
		catalogo.push(tour1);
		catalogo.push(tour2);
		catalogo.push(tour3);
		catalago.buscarTourPorNombre(catalogo,"rory");
		
	}

}
