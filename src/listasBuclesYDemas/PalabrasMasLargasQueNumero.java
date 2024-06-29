package listasBuclesYDemas;

import java.util.ArrayList;

public class PalabrasMasLargasQueNumero {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		
		list.add("zapato");
		list.add("a");
		list.add("rinocerontes");
		
		Integer numero =6;
		
		System.out.println(selectLongWords(list,numero));

	}
	public static ArrayList <String> selectLongWords (ArrayList <String> cadenucas, Integer numerico){
		ArrayList<String> definitiva = new ArrayList<>();
		for (String element: cadenucas) {
			if (element.length()<= numerico) {
				definitiva.add(element);
			}
		}
		return definitiva;
	}
}
