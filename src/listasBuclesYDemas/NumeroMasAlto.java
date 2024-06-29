package listasBuclesYDemas;

import java.util.ArrayList;


public class NumeroMasAlto {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList <>();
		list.add(1);
		list.add(2);
		list.add(24);
		list.add(720);

		System.out.println(maxValue(list));


	}
	
	public static Integer maxValue (ArrayList <Integer> patata) {
		int maximo = patata.get(0);
		for (Integer element:patata) {

			if (element < maximo) {
				maximo = element;
			}
			
		}
		return maximo;

	}
}
