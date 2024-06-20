package automovil;

public class Automovil{
	
	public String marca;
	
	private String color;
	private Motor motor = new Motor();
	private Ruedas rueda = new Ruedas();	        
	private RuedaAux ruedaaux = new RuedaAux();
	
	Automovil(String lmarca){
	    this.marca=lmarca;
	    System.out.println("auto0 inicializado por constructor solo para la marca "+this.marca+"\n");
	}
	Automovil(){
	}
	void set_marca(String lmarca){
	    this.marca=lmarca;
	}
	
	void get_marca(){
	      String lmarca;
	      lmarca=this.marca;
	      System.out.println(lmarca);
	}
	
	void arrancar(){
	      if((this.ruedaaux).runica == 0){
	         System.out.println("auto1 No puede arrancar falta rueda de auxilio\n");
	         System.out.println("Vamos a agregarla\n");
	         this.ruedaaux=new RuedaAux(1);
	      }else{
	            System.out.println("Ahora Arranca\n");
	        }
	} 

	public static void main(String[] args) {
		System.out.println("Se va a crear el objeto auto0 que tiene \"has to\" objeto motor");
		System.out.println("4 ruedas y 1 rueda de auxilio que puede estar o no.");
		//getchar();
		Automovil auto0 = new Automovil("Ford");
		//getchar();
		System.out.println("Se va a crear el objeto auto1 que tiene \"has to\" objeto motor");
		System.out.println("4 ruedas y 1 rueda de auxilio que puede estar o no.");
		Automovil auto1= new Automovil();
		auto1.set_marca("Chevrolet");//auto1 seteado por set_marca
		                             //por ser marca atributo private
		//getchar();
		System.out.println("auto1 inicializado por set_marca(\"Chevrolet\") para el atributo private marca\n\n");
		System.out.println("Marca auto1 ");
		auto1.get_marca();//mostrado por get_marca(),por ser marca atributo private
		System.out.println(" (atributo private)\n");
		//auto1.color="Rojo" Es viable por ser color atributo public
		auto1.color="Rojo";
		System.out.println("Color auto1 " + auto1.color + " (atributo public) inicializado en main");
		System.out.println(" por auto1.color=\"Rojo\"");//Es viable por ser color atributo public
		System.out.println("Vamos a arrancar auto1");
		//getchar();
		auto1.arrancar();
		//getchar();
		auto1.arrancar();		
	}
}

	   