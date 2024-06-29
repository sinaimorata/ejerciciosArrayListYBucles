package listasBuclesYDemas;

import java.util.ArrayList;

public class ConcatenarCadeninas {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList <>();
		
		list.add("Ya");
		list.add("me");
		list.add("veo");
		list.add("en");
		list.add("Santiago");
		
		totalizador(list);
		
	}
	public static void totalizador(ArrayList<String> zanahoria){
		if (zanahoria.isEmpty()) {
			System.out.println("Lo siento, no puedo hacer nada. Es una lista vacia");
		}else {
			System.out.println(arrejuntarCadenas(zanahoria));
		}		
	}	
	
	public static String arrejuntarCadenas(ArrayList<String> eslabones) {
		String cadenaFinal = "";
		for (String element: eslabones) {
			cadenaFinal = cadenaFinal + " " + element;
		}
		return cadenaFinal;
	}
}
