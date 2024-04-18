package alumno_lapiz;

public class Alumno {
	private String nombre;
	private int legajo;
	public Alumno(String nom1, int leg1) {
		this.nombre = nom1;
		this.legajo = leg1;
	}
	public void escribir(Lapiz lap1) {
		System.out.println("El alumno " + this.nombre + " escoge un lapiz para escribir.");
		lap1.escribir();
	}
}
