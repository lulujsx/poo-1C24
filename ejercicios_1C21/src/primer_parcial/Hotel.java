package primer_parcial;

//Implementar la clase Hotel tal que tenga operaciones para:
//	a) Crearla con la cantidad de habitaciones que tiene.
//	b) Ocupar una habitacion disponible indicando la cantidad de personas 
//	mayores y menores (maximo 8 en total) que la ocupan.
//		void ocuparHabitacionCon(int mayores, int menores)
//	c) Devolver la cantidad total de personas que ocupan todas las habitaciones
//	del hotel.
//	d) Devolver la cantidad de habitaciones que estan ocupadas por tantos mayores
//	como los indicados por parametro
//		int contarHabitacionesCon(int mayores)
//	e) Devolver un arreglo de enteros de longitud 9, tal que en la posicion i
//	del arreglo se guarde la cantidad de habitaciones con i personas.
//Nota: Habitacion tiene que ser modelada como una clase.

public class Hotel {
	
	// Atributos
	private Habitacion[] habitaciones;
	
	// Constructor
	public Hotel(int cantidad) {
		this.habitaciones = new Habitacion[cantidad];
		for(int i = 0; i < cantidad; i++) {
			this.habitaciones[i] = new Habitacion(0,0);
		}
	}
	
	// Metodos
	public void ocuparHabitacionCon(int mayores,int menores) {
		
		//	1. Localizar una habitacion disponible
		//	2. Ocuparla
		
		if(mayores + menores <= 8) {
			
			boolean detener = false;
			int i = 0;
			
			while(!detener && i < this.habitaciones.length) {
				if(this.habitaciones[i].getTotalPersonas() == 0) {
					this.habitaciones[i].setMayores(mayores);
					this.habitaciones[i].setMenores(menores);
					detener = true;
					System.out.println("Se creo una habitacion con " + mayores + " mayores y " + menores + " menores.");
				}
				i++;

			}
		}
		
		
		//	Mi solucion:
		//	for(Habitacion i : this.habitaciones) {
		//		if(i.getTotalPersonas() == 0 && (mayores + menores <= 8)) {
		//			i.setMayores(mayores);
		//			i.setMenores(menores);
		//			break;
		//		} else
		//			throw new Error("La habitacion ya esta ocupada o excede el limite");
		//	}
		
		
	}
	
	public int contarPersonasEnTotal() {
		int total = 0;
		for(Habitacion i : this.habitaciones) {
			total += i.getTotalPersonas();
		}
		return total;
	}
	
	//Punto D
	public int contarHabitacionesCon(int mayores) {
		int total = 0;
		
		for(int i = 0; i < this.habitaciones.length; i++) {
			if(this.habitaciones[i].getMayores()>= mayores) {
				total++;
			}
		}
		return total;
	}
	
	//Punto E
	public int[] contarHabitacionesConNPersonas() {
		int[] cant_habitaciones = new int[9];
		int cant_por_habitacion = 0; 
		
		for(int i = 0; i < cant_habitaciones.length; i++) {
			for(int j = 0; j < this.habitaciones.length; j++) {
				cant_por_habitacion = this.habitaciones[j].getTotalPersonas();
				if(cant_por_habitacion == i) {
					cant_habitaciones[i]++;
				}
				cant_por_habitacion = 0;
			}
		}
		return cant_habitaciones;
	}
	
	

}
