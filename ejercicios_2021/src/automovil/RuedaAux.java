package automovil;

public class RuedaAux {
	
	public int runica;

    RuedaAux(int i){
        this.runica=i;
    }
    
    RuedaAux()
    {
        this.runica=0;//Si valor 1 lleva rueda de auxilio
        if(this.runica==0)
        {
            System.out.println("No tiene rueda de auxilio\n");
        }
        else
        {
            System.out.println("Tiene rueda de auxilio");
        }
    }


}
