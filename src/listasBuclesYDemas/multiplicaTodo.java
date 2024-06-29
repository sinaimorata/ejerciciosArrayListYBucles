package listasBuclesYDemas;

import java.util.ArrayList;

public class multiplicaTodo {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList <> ();
		
		list.add(1);
		list.add(2);
		list.add(4);
		list.add(6);
		
		System.out.println(multiply_all(list));

	}
	public static Integer multiply_all (ArrayList<Integer> caca) {
		int total = 1;
		for (Integer elemento: caca) {
			total = total*elemento;
		}
		return total;
	}
	
}
