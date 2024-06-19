package vehiculos;

public abstract class Vehiculo {
	
	// Atributos
	private int km_recorridos;
	private Persona chofer;
	
	// Constructor
	public Vehiculo(int km, Persona choferx) {
		this.km_recorridos = km;
		asignarChofer(choferx);
	}
	
	// Metodos
	public int getKmRecorridos() {
		return this.km_recorridos;
	}
	protected void asignarChofer(Persona chofer) {
		this.chofer = chofer;
	}
	
	public abstract void cambiarChofer(Persona nuevo_chofer);
	
	public void getChofer() {
		System.out.println("Chofer: " + this.chofer.getNombre());

	}
	
	
	

}
