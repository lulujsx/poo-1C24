package empleados;

public class Main {
	
	public static void main(String[] args) {
		Mozo mozo1 = new Mozo("Adro",2000,500);
		Cajero cajero1 = new Cajero("Lulo",2000);
		System.out.println("El sueldo del cajero " + cajero1.getNombre() + " es: $" + cajero1.getSueldo());
		System.out.println("El sueldo del mozo " + mozo1.getNombre() + " es: $" + mozo1.getSueldo());
	}

}
