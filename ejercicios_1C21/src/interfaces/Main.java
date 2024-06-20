package interfaces;

public class Main {
	public static void main(String[] args) {
		Punto punto1 = new Punto(1.0,1.0);
		Punto punto2 = new Punto(0.0,0.0);
		System.out.println(punto1.distancia(punto2));
		System.out.println(punto1);
		punto1.reset();
		System.out.println(punto1);
	}
}
