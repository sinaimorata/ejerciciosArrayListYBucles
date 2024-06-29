package listasBuclesYDemas;

import java.util.ArrayList;

public class TotalizadaNumeroMasAlto {
	
	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList <>();
		ArrayList<Integer>list2 = new ArrayList <>();
		
		list.add(1);
		list.add(2);
		list.add(2400);
		list.add(720);

		totalizador(list);
		totalizador(list2);

		
	}
	// VOID TRABAJA PARA ELLA. NO DEVUELVE NADA HACIA AFUERA. SI 
	//QUIERO PINTAR, LO HAGO EN ELLA TIRANDO DE OTRA F(X)Q SI DEVUELVA ALGO.
	public static void totalizador(ArrayList<Integer> zanahoria){
		if (zanahoria.isEmpty()) {
			System.out.println("Lo siento, no puedo hacer nada. Es una lista vacia");
		}else {
			System.out.println(maxValue(zanahoria));
		}		
	}
	
	public static Integer maxValue (ArrayList <Integer> patata) {
		//.get(index) te da el elemento especificado de la lista x su indice.
		int maximo = patata.getFirst();
		for (Integer element:patata) {

			if (element > maximo) {
				maximo = element;
			}
			
		}
		return maximo;

	}
	
}
