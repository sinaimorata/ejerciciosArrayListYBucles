package listasBuclesYDemas;

import java.util.ArrayList;

public class ElMayor {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();

	        list.add(14); 
	        list.add(24);
	        list.add(34);
	        list.add(44);
	        list.add(54);{
	        	
	        }
	        
	        
	     Integer numero = 1;
	     
	     System.out.println(selectBigger(list,numero));
	}
	public static ArrayList<Integer> selectBigger (ArrayList <Integer> numbers, Integer unico) {
		ArrayList<Integer> resultante = new ArrayList<>();
		
		for (Integer element: numbers) {
			if (element > unico) {
				 resultante.add(element);	
			}
			
		}
		return resultante;
	}
}
