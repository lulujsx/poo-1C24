package automovil;

public class Ruedas {

    public int r1;
    public int r2;
    public int r3;
    public int r4;

    Ruedas(int uno,int dos,int tres,int cuatro){
        this.r1=uno;
        this.r2=dos;
        this.r3=tres;
        this.r4=cuatro;
    }
    Ruedas(){
        this.r1=1;
        this.r2=1;
        this.r3=1;
        this.r4=1;
        System.out.println("Se agregan las cuatro ruedas");
       // getchar();
    }
}
