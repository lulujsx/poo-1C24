package alumno_lapiz;

public class Main {

	public static void main(String[] args) {
		Lapiz lapiz1 = new Lapiz("negro",3);
		System.out.println(lapiz1.getColor());
		lapiz1.setColor("rojo");
		System.out.println(lapiz1.getColor());
		Alumno alumno1 = new Alumno("Alan", 123);
		alumno1.escribir(lapiz1);

	}

}
