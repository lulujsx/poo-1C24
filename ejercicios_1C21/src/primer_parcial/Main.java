package primer_parcial;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Hotel hotelbb = new Hotel(5);
		hotelbb.ocuparHabitacionCon(3, 1);
		hotelbb.ocuparHabitacionCon(2, 1);
		System.out.println(hotelbb.contarPersonasEnTotal());
		System.out.println(hotelbb.contarHabitacionesCon(2));
		int[] array = hotelbb.contarHabitacionesConNPersonas();
		System.out.println(Arrays.toString(array));

	}

}
