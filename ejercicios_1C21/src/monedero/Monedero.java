package monedero;

public class Monedero {
	
//	Atributos
//	private Dinero dinero;
	private double dinero;
	
//	Constructores
	
//	Constructor parametrizado
	Monedero(double dinerox){
		this.dinero = dinerox;
	}
	
//	Constructor por defecto/predeterminado
	Monedero(){
		this.dinero = 0.0;
	}
	
//	Metodos

	double consultarDinero() {
		return this.dinero;
	}
	
	void sacarDinero(double monto) {
		if(monto > 0 && monto <= this.dinero) {
			this.dinero -= monto;
		}else {
			throw new Error("No se puede extraer el monto indicado");
		}
	}
	
	void ingresarDinero(double monto) {
		if(monto > 0) {
			this.dinero += monto; 
		} else {
			throw new Error("No se puede i el monto indicado");
		}
	}
}
