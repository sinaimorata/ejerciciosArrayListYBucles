package listasBuclesYDemas;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<String> libros = new ArrayList <>();

		libros.add("Uno");
		libros.add("Dos");
		
		// llamando a la lista te devuelve todo, pero no la hemos recorrido.
		System.out.println(libros);
		
		for (String elemento:libros) {
			System.out.println(elemento);
		}
	}
}