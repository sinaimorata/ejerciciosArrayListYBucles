package listasBuclesYDemas;

import java.util.ArrayList;

public class ContarCadenas {

	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();
		
		list.add("zapato");
		list.add("costillas");
		list.add(4);
		list.add(false);
		
		System.out.println(countStr(list));

	}
	public static int countStr (ArrayList<Object> lista) {
		int contador = 0;
		for(Object element: lista) {
			if (element instanceof String) {
				contador +=1;
			}
		}
		return contador;
	}
}
