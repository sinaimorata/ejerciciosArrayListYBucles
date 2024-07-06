package listasBuclesYDemas;

import java.util.ArrayList;

public class ConvertirDecimales {

	public static void main(String[] args) {
		ArrayList <Integer> list = new ArrayList <>();

		list.add(1);
		list.add(5);
		list.add(45);

		System.out.println(convertirAFlotantes(list));


	}
	public static ArrayList <Float> convertirAFlotantes (ArrayList <Integer> zapato){
		ArrayList <Float> definitiva = new ArrayList <> ();
		for (Integer element:zapato) {
			if (element instanceof Integer) {
				definitiva.add(element.floatValue());
				
				
			}
			
		}
		return definitiva;
	}
	
	}

