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


public class Trabajador extends Persona {
	
	// Atributos
	private double salario;
	private int antiguedad;
	
	// Constructor
	public Trabajador(int dni,String nombre,double sal,int ant) {
		super(dni,nombre);
		this.salario = sal;
		this.antiguedad = ant;
	}
	
	// Metodos
	public void trabajar() {
		System.out.println("TRABAJADOR trabajando");
	}
	
	public double getSalario() {
		return this.salario;
	}
	
	public int getAntiguedad() {
		return this.antiguedad;
	}
	
	public void setSalario(int salariox) {
		this.salario = salariox;
	}
	
	
	
	
}
