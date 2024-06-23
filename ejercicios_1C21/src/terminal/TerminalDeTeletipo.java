package terminal;

import java.util.Stack;

public class TerminalDeTeletipo {
	
	private Stack<Character> pila;
	
	TerminalDeTeletipo(){
		this.pila = new Stack<Character>();
	}
	
	public void vaciarPila() {
		while(!this.pila.empty()) {
			this.pila.pop();
		}
	}
	public void procesar(String cadena) {
		
		for(int i = 0; i < cadena.length();i++) {
			if(cadena.charAt(i) == '&') {
				vaciarPila();
			} else if(cadena.charAt(i) == '/') {
				if(!this.pila.empty()) {
					this.pila.pop();
				} 
			} else {
				this.pila.push(cadena.charAt(i));
			}
		}
		
	}
	
	public String darVuelta() {
		String s = "";
		Stack<Character> aux = new Stack<Character>();
		while(!this.pila.empty()) {
			aux.push(this.pila.pop());
		}
		while(!aux.empty()) {
			s += aux.pop();
		}
		return s;
	}
	
	public static void main(String[] args) {
		TerminalDeTeletipo tt = new TerminalDeTeletipo();
		tt.procesar("AXRD&F/GHJK//W");
		System.out.println(tt.darVuelta());
	}
	

}
