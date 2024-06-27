package el_bosque_verde;
import java.util.List;
import java.util.ArrayList;

public class ReservaNatural {
	
	private ArrayList<Especie> especies = new ArrayList();
	private ArrayList<Cuidador> cuidadorxs = new ArrayList();
	private ArrayList<Habitat> habitats = new ArrayList();
	
	ReservaNatural(){
		
	}
	
	
	public void agregarEspecie(Especie esp) {
		Boolean exists = false;
		for(int i = 0; i < this.especies.size(); i++ ) {
			if(this.especies.get(i).getNombre() == esp.getNombre()) {
				exists = true;
				break;
			}
		}
			if(exists)
				System.out.println("La especie ya se encuentra registrada.");
			else
				this.especies.add(esp);
	}
	
	//preguntar por esta func
	public void agregarCuidador(Cuidador cuid) {
		this.cuidadorxs.add(cuid);
	}
	
//	Busca una especie por su nombre y devuelve la cantidad de
//	individuos
	
	public Integer buscarEspecie(String nombre) {
//		int contador = 0;
		int cantidadDeIndividuos = 0;
		for(int i=0;i<this.especies.size();i++) {
			if(this.especies.get(i).getNombre() == nombre) {
//				contador++;
				cantidadDeIndividuos += this.especies.get(i).getCantidad();
				break;
			}
		}
		return cantidadDeIndividuos;
//		return contador;
	}
	
	public int sumatoriaTotalEspecies() {
		int total = 0;
		for(int i=0;i < this.especies.size();i++) {
			total += this.especies.get(i).getCantidad();
			}
		return total;
	}
	
//	Calcula el promedio de individuos por especie en la reserva
	
	public void calcularPromedio() {
		float total = sumatoriaTotalEspecies();
		float promedio = 0;
		for(int i=0;i < this.especies.size();i++) {
			promedio = this.especies.get(i).getCantidad() / total;
			System.out.println("El promedio de la especie " + this.especies.get(i).getNombre() + " es del: %" + (promedio*100) );
		}
	}
		
//	Sumatoria de sueldo de los cuidadores
	
	public double calcularSueldoTotal() {
		double total = 0;
		for(int i = 0; i < this.cuidadorxs.size();i++){
			total += this.cuidadorxs.get(i).getSueldo();
		}
		return total;
	}
	
//	Devuelve una representación en cadena de la reserva, mostrando todas 
//	las especies y sus cantidades.
	
	@Override
	public String toString() {
		return "ReservaNatural [Especies=" + especies + "]";
	}

	public static void main(String[] args) {
		Especie especie1 = new Especie("gato","animal",5);
		ReservaNatural reserva1 = new ReservaNatural();
		reserva1.agregarEspecie(especie1);
//		System.out.println(reserva1.buscarEspecie("gato"));
		Especie especie2 = new Especie("perro","animal",3);
		reserva1.agregarEspecie(especie2);
		Especie especie3 = new Especie("conejo","animal",5);
		reserva1.agregarEspecie(especie3);
//		System.out.println("La sumatoria total de individuos de todas las especies es: " + reserva1.sumatoriaTotalEspecies());
		reserva1.calcularPromedio();
		Especie especie4 = new Especie("conejo","animal",5);
		reserva1.agregarEspecie(especie4);
//		especie1.setCantidad(5);
//		System.out.println(especie1.getCantidad());
		System.out.println(reserva1);
		
	}



	
}
