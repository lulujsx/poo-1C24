package vehiculos;

public class Autobus extends Vehiculo {
	
	//Atributos
	private Persona[] pasajeros;
	
	private int asiento_vacio = 0;
	
	//Constructor
	public Autobus(int kms,Persona chof,int cant_pasajeros) {
		super(kms,chof);
		this.pasajeros = new Persona[cant_pasajeros];
	}
	
	//Metodos
	public void subirPasajero(Persona pasajero) {
		if(this.asiento_vacio < this.pasajeros.length) {			
			this.pasajeros[asiento_vacio] = pasajero;
			this.asiento_vacio++;
		}
	}
	
	public void bajarPasajero() {
		if(hayPasajeros()) {			
			this.asiento_vacio--;
		}
	}
	
	private boolean hayPasajeros() {
		return this.asiento_vacio > 0;
	}

	@Override
	public void cambiarChofer(Persona nuevo_chofer) {
		if(!hayPasajeros()) {
			super.asignarChofer(nuevo_chofer);
		}
		
	}
	
	
	
}
