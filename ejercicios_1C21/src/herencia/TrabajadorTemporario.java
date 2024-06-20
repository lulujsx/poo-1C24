package herencia;

//CONSIGNA
//
// Un TrabajadorTemporario es un Trabajador, que además posee un contrato con una 
// duracion especifica.
//
// Tomar en cuenta que el trabajador temporario puede comer, pero de una forma
// diferente a todas las personas.


public class TrabajadorTemporario extends Trabajador {
	
	// Atributos
	private int duracion_contrato;
	
	// Constructor
	public TrabajadorTemporario(int dni,String nombre,double salario, int antiguedad, int duracion) {
		super(dni,nombre,salario,antiguedad);
		this.duracion_contrato = duracion;
	}
	
	
	// Metodos
	
	// Sobreescribimos (over-writing) el comportamiento comer() heredado de Persona
	@Override
	public void comer() {
		//super.comer();
		System.out.println("TRABAJADOR TEMPORARIO comiendo");
	}
	
	public int getDuracionContrato() {
		return this.duracion_contrato;
	}
	
	

}
