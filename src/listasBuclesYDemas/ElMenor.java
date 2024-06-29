package listasBuclesYDemas;

import java.util.ArrayList;

public class ElMenor {

	public static void main(String[] args) {
		 ArrayList<Integer> list = new ArrayList<>();

	        list.add(14); 
	        list.add(24);
	        list.add(34);
	        list.add(44);
	        list.add(54);{
	        	
	        }
	        
	        
	     Integer numero = 650;
	     
	     System.out.println(selectSmaller(list,numero));

	}
	public static ArrayList <Integer> selectSmaller (ArrayList <Integer> caca, Integer cifra) {
		
		ArrayList <Integer> resultadito = new ArrayList <>();
		
		for (Integer element: caca) {
			
			if (element < cifra) {
				resultadito.add(element);
			}
		}
		return resultadito;
	}
}
