package colecciones;
import java.util.ArrayList;

public class usoArrayList {
	
	public static void main(String[] args) {
		ArrayList<String> vector = new ArrayList<String>();
//		System.out.println(vector.size());
		vector.add("Rufi");
		vector.add("Lulu");
		vector.add("Adri");
		//vector.remove(2);
		vector.remove("Adri");
//		System.out.println(vector.size());
//		System.out.println(vector.get(1));
		ArrayList<Boolean> vectorBooleano = new ArrayList<Boolean>(30);
		vectorBooleano.add(Boolean.TRUE);
		ArrayList<ArrayList<Character>> vectorArrayListCharacter = new ArrayList<ArrayList<Character>>();
		ArrayList<Character> vectorCharacter1 = new ArrayList<Character>();
		vectorCharacter1.add('a');
		vectorCharacter1.add('b');
		vectorCharacter1.add('c');
		ArrayList<Character> vectorCharacter2 = new ArrayList<Character>();
		vectorCharacter2.add('d');
		vectorCharacter2.add('e');
		vectorCharacter2.add('f');
		vectorArrayListCharacter.add(vectorCharacter1);
		vectorArrayListCharacter.add(vectorCharacter2);
//		System.out.println(vectorArrayListCharacter.get(1));
//		System.out.println(vectorArrayListCharacter.get(1).get(0));
		
		for(ArrayList<Character> i : vectorArrayListCharacter) {
			for(Character j : i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < vectorArrayListCharacter.size();i++) {
			for(int j = 0; j < vectorArrayListCharacter.get(i).size();j++) {
				System.out.print(vectorArrayListCharacter.get(i).get(j)+" ");
			}
			System.out.println();
		}
	}

}
