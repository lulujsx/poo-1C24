package punto;

import static java.lang.Math.*;

import java.util.Objects;

public class Punto implements Comparable<Punto> {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double consultarX() {
		return x;
		
	}
	
	public double consultarY() {
		return y;
	}
	
	public void cambiarX(double nuevaX) {
		x = nuevaX;
	}
	
	public void cambiarY(double nuevaY) {
		y = nuevaY;
	}
	
	public boolean estaSobreX() {
		return (y == 0);
	}
	
	public boolean estaSobreY() {
		return (x == 0);
		
	}
	
	public boolean esElOrigen() {
		return estaSobreX() && estaSobreY();
		
	}
		
	public static double distancia(Punto a, Punto b) {
	
		return sqrt(pow(a.x - b.x, 2) + pow(a.y - b.y, 2)); 
		
	}
	
	public double distancia(Punto otro) {
		return sqrt(pow(this.x - otro.x, 2) + pow(this.y - otro.y, 2));
		
	}
	
	public double distanciaAlOrigen() {
		return sqrt((pow(this.x,2)+pow(this.y,2)));
	}
	
	
	@Override
	public String toString() {
		return "["+ this.x + ", " + this.y + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		return Double.doubleToLongBits(x) == Double.doubleToLongBits(other.x)
				&& Double.doubleToLongBits(y) == Double.doubleToLongBits(other.y);
	}

	@Override
	
//	Para HashSet
//	public int compareTo(Punto o) {
//		return Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen());
//	}
	
//	Para TreeSet
	public int compareTo(Punto o) {
		int aux;
		if(Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen()) == 0)
			if(Double.compare(this.x, o.x)== 0)
				aux = Double.compare(this.y, o.y);
			else
				aux = Double.compare(this.x, o.x);
		else
			aux = Double.compare(this.distanciaAlOrigen(), o.distanciaAlOrigen());
		return aux;
	}
	
	
	
}