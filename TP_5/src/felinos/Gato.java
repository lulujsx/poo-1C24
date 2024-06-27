package felinos;

public class Gato extends Felino implements Mascota {
	@Override
	public void trepar() {
		System.out.println("Trepando como un gato...");
	}

	@Override
	public void acariciar() {
		System.out.println("Acariciando a un gato... ¡Prrrrr!");
	}

}
