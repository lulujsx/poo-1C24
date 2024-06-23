//Dada una palabra e imprima el mensaje indicando si es palindromo o no. 
//Una palabra es palindromo cuando se lee igual hacia adelante que hacia atras.
//Por ejemplo: sos,seres,reconocer,somos


package palindromo;
import java.util.*;

public class Palindromo {
	
	public static void main(String[] args) {
		Stack<Character> pila = new Stack<Character>();
		String cadena = "somos";
		
		for(int i = 0; i < cadena.length(); i++) {
			pila.push(cadena.charAt(i));
		}
		
		System.out.println(pila);
		
		String desapilada = "";
		
		while(!pila.empty()) {
			desapilada += pila.pop();
		}
		
		System.out.println(desapilada);
		
		System.out.println(cadena.equals(desapilada));
	}
	
}
