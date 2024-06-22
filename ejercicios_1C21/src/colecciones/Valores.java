package colecciones;
import java.util.*;

//1) Se ingresa por teclado un conjunto de valores enteros. El ingreso de datos
//finalizará cuando ingrese el valor 0 (cero). Luego se ingresa otro conjunto de
//valores enteros y, por cada uno de estos, se debe informar si el valor ingresado
//pertenece o no al primer conjunto.

public class Valores {
	//Atributos
	private LinkedList<Integer> lista_valores;
	
	//Constructor
	public Valores() {
		this.lista_valores = new LinkedList<Integer>();
	}
	
	//Metodos	
	public void agregarValor(int entero) {
		this.lista_valores.add(entero);
	}
	
	public int getCantidadDeElementos() {
		return this.lista_valores.size();
	}
	
	public ArrayList<Boolean> pertenencia(Valores valores){
		ArrayList<Boolean> arrayList = new ArrayList<Boolean>(valores.getCantidadDeElementos());
		for(Integer integer : lista_valores)
			arrayList.add((lista_valores.indexOf(integer) != -1 ? Boolean.TRUE : Boolean.FALSE));
		return arrayList;
	}
	

	
	public static void main(String[] args) {
		Valores valores = new Valores();
		valores.agregarValor(1);
		valores.agregarValor(2);
		valores.agregarValor(3);
		valores.agregarValor(4);
		Valores valores_otro = new Valores();
		valores_otro.agregarValor(1);
		valores_otro.agregarValor(-1);
		valores_otro.agregarValor(3);
		valores_otro.agregarValor(4);
		System.out.println(valores.pertenencia(valores_otro));
			
		
	}
	

}
