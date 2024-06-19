package vehiculos;

public class Motocicleta extends Vehiculo {
	
	// Atributos
	private Persona acompanante;
	
	// Constructor
	public Motocicleta(int km, Persona chof) {
		super(km,chof);
	}
	
	// Metodos
	private boolean hayAcompanante() {
		return this.acompanante != null;
	}
	
	@Override
	public void cambiarChofer(Persona nuevo_chofer) {
		if(!hayAcompanante()) {			
			super.asignarChofer(nuevo_chofer);
		} else {
			System.out.println("No se puede cambiar de chofer mientras haya acompañante");
		}
	}
	
	public boolean agregarAcompanante(Persona acomp) {
		if(!hayAcompanante()) {
			this.acompanante = acomp;
			return true;
		} else {
			return false;
		}
	}

}
