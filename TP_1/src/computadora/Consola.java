package computadora;

public class Consola {
	
	private String pantalla;
	private String teclado;
	
	public Consola(String p, String t) {
		this.pantalla = p;
		this.teclado = t;
	}
	
	public void setPantalla(String p) {
		this.pantalla = p;
	}
	
	public void setTeclado(String t) {
		this.teclado = t;
	}
	
	public String getPantalla() {
		return this.pantalla;
	}
	
	public String getTeclado() {
		return this.teclado;
	}
	

}
