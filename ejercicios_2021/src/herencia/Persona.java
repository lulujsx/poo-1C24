package herencia;

/*
* 	CONSIGNA (EJEMPLO HERENCIA)
* 
*   Todas las personas se caracterizan por su DNI y su nombre.
*	Ademas pueden comer y dormir (informar de esto por pantalla).
*
*   Un trabajador es una persona que ademas tiene salario y antiguedad.
*   Los trabajadores pueden trabajar (informar de esto por pantalla).
*   
*   Un estudiante es una persona con promedio, 
*   que puede estudiar (informar de esto por pantalla)
*   
* */

public class Persona {
	
	// Atributos
	private int dni;
	private String nombre;
	
	// Constructor
	public Persona(int dni, String nombre) {
		this.dni = dni;
		this.nombre = nombre;
	}
	public Persona() {
		
	}
	
	// Metodos
	
	// Nivel de acceso protected (protegido)
	// El elemento sera visible dentro de la clase donde se lo definio
	// y desde sus subclases
	protected void comer() {
		System.out.println("PERSONA comiendo");
	}
	
	public void dormir() {
		System.out.println("PERSONA durmiendo");
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public int getDni() {
		return this.dni;
	}
	
	
	
	

}
