package listasBuclesYDemas;

import java.util.ArrayList;

public class TodasConcatenadas {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("patata");
		list.add("talego");
		list.add("tomate");
		list.add("tartera");

		ArrayList<String> listDos = new ArrayList<>();
		listDos.add("");
		listDos.add("patata");
		listDos.add("");
		listDos.add("tomate");


		controlador(list);
		controlador(listDos);
	}
	public static void controlador (ArrayList <String> zapato) {
		
		
		if ( zapato.isEmpty()) {
			System.out.print("Has pasado una cadena vacia y esto es inoperativo");
		}else {
			
			System.out.println(concatAll(zapato));
		}
	}

	
	public static String concatAll (ArrayList <String> muchasCadeninas) {

			String cadenaFinal = "";
			for (String element: muchasCadeninas) {
				cadenaFinal = cadenaFinal + " " + element;
			}
			return cadenaFinal;

		}
	}
