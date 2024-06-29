package listasBuclesYDemas;

import java.util.ArrayList;

public class MultiplosDeCinco {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(14); 
        list.add(24);
        list.add(34);
        list.add(44);
        list.add(55);
        
        System.out.println(selectMultCinco(list));

	}
	public static ArrayList <Integer> selectMultCinco (ArrayList <Integer> cosicas){
		ArrayList<Integer> resultante = new ArrayList<>();
		for (Integer element:cosicas) {
			if (element %5 == 0) {
				resultante.add(element);
			}
		}
		return resultante;
	}
}
