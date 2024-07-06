package listasBuclesYDemas;

import java.util.ArrayList;

public class LosNegativosAPositivos {
	
	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();

		list.add(1.0);
		list.add(-1.0);
		list.add(5.0);
		list.add(-6.0);
		list.add(500.1);
		
		System.out.println(convertirPositivos(list));
	}
	
	public static ArrayList<Double> convertirPositivos(ArrayList<Double> cosicasVarias) {
		ArrayList<Double> soloPositivos = new ArrayList<>();
		for (Double element : cosicasVarias) {
			if (element > 0) {
				soloPositivos.add(element);
			}
		}
		return soloPositivos;
	}
}
