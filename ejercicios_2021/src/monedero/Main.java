package monedero;

public class Main {

	public static void main(String[] args) {
		Monedero monedero1 = new Monedero();
		System.out.println(monedero1.consultarDinero());
		monedero1.ingresarDinero(200);
		System.out.println(monedero1.consultarDinero());
//		monedero1.sacarDinero(300);
		System.out.println(monedero1.consultarDinero());
	}

}
