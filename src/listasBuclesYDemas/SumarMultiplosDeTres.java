package listasBuclesYDemas;

import java.util.ArrayList;

public class SumarMultiplosDeTres {

	public static void main(String[] args) {
		ArrayList<Integer>list = new ArrayList<>();
		list.add(1);
		list.add(3);
		list.add(5);
		list.add(9);
		
		System.out.println(sumMultOfTres(list));
	}
    public static Integer sumMultOfTres (ArrayList<Integer>zanahoria) {
    	int total = 0;
    	for (Integer elemento:zanahoria) {
    		if (elemento %3 ==0) {
    		total = total + elemento;
    		
    		}
        		
    	}
    	
    	return total;
    	
    }
    
}
