package felinos;

public class Main {
public static void main(String[] args) {
	Felino unLeonFelino = new Leon();
	
	Puma unPumaPuma = new Puma();
	Gato unGatoGato = new Gato();
	
	Mascota otroGatoMascota = new Gato();
	Mascota unPerroMascota = new Perro();
	
	Object unGatoObject = new Gato();
	
	// pumas solo trepan
	unPumaPuma.trepar();
	
	// leones felinos solo trepan
	unLeonFelino.trepar();
	
	// si queremos que un león ruja
	((Leon) unLeonFelino).rugir();
	
	// los gatos con referencia Gato trepan y además se los puede acariciar
	unGatoGato.trepar();
	unGatoGato.acariciar();
	
	// los gatos con referencia Mascota sólo pueden ser acariciados, salvo 
	// que se los castee a Gato
	otroGatoMascota.acariciar();
	((Gato) otroGatoMascota).trepar();
	
	// a los perros también se los puede acariciar
	unPerroMascota.acariciar();
	
	// como Gato y Perro implementan la interfaz Mascota, se puede definir
	// un arreglo de objetos de tipo Mascota
	Mascota[] mascotas = new Mascota[5];
	
	// perros y gatos 
	mascotas[0] = unGatoGato;
	mascotas[1] = otroGatoMascota;
	mascotas[2] = unPerroMascota;
	
	// si quiero agregar un león en el arreglo, el programa no compila
	// error: Type mismatch: cannot convert from Felino to Mascota
//	mascotas[3] = unLeonFelino;
	
	// algo similar ocurre con un puma
	// error: Type mismatch: cannot convert from Puma to Mascota
//	mascotas[3] = unPumaPuma;
}
}
