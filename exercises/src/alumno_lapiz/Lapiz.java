package alumno_lapiz;

public class Lapiz {
	private String color;
	private int largo;
	
	public Lapiz(String color1,int largo1) {
		this.color = color1;
		this.largo = largo1;
	}
	public void escribir() {
		System.out.println("Se escribio con un lapiz de " + this.largo + "cm de largo.");
	}
	public void pintar() {
		System.out.println("El lapiz pinta en color " + this.color + ".");
	}
	public void setColor(String col1) {
		this.color = col1;
	}
	public String getColor() {
		return this.color;
	}
	public void setLargo(int lar1) {
		this.largo = lar1;
	}
	public int getlargo() {
		return this.largo;
	}
}
