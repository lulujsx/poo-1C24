//HashSet: almacena los elementos en una tabla hash. 
//No importa el orden que ocupen los elementos.

//TreeSet: almacena los elementos ordenándolos en función de sus valores. 
//Los elementos almacenados deben implementar la interfaz Comparable.

package punto;
import java.util.*;

public class Conjunto {

	public static void main(String[] args) {
		Set<Punto> puntos = new TreeSet<Punto>();
		puntos.add(new Punto(-1,1));
		puntos.add(new Punto(1,1));
		puntos.add(new Punto(1,-1));
		puntos.add(new Punto(-1,-1));
		System.out.println(puntos);
		

	}

}
