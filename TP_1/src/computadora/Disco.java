package computadora;

public class Disco {
	
	private int controlador;
	private char disco;
	
	public Disco(int ctrl, char disc) {
		this.controlador = ctrl;
		this.disco = disc;
	}

	public void setControlador(int ctrl1) {
		this.controlador = ctrl1;
	}
	
	public int getControlador() {
		return this.controlador;
	}
	
	public void setDisco(char disc1) {
		this.disco = disc1;
	}
	
	public char getDisco() {
		return this.disco;
	}
}
