package vehiculos;

public class TestVehiculo {
	
	public static void main(String[] args) {
		Persona adrito = new Persona("Adri",69);
		Persona lulu = new Persona("Lulu",40183);
		Motocicleta moto = new Motocicleta(0,adrito);
		moto.agregarAcompanante(lulu);
		moto.cambiarChofer(lulu);
		moto.getChofer();
	}

}
