package listasBuclesYDemas;

import java.util.ArrayList;

public class ListaDeNominas {

	public static void main(String[] args) {
		ArrayList<Double> list = new ArrayList<>();

		list.add(1512.0);
		list.add(3522.0);
		list.add(1315.25);
		list.add(741.20);

		
		// CALCULAR LA SUMA TOTAL DE LAS NÓMINAS ACTUALIZADAS
		ArrayList<Double> listDos =updateNominas(list);
        double totalPago = sumAll(listDos);
        System.out.println("Total a pagar: " + totalPago);
        System.out.println(updateNominas(list));
	}
		public static ArrayList<Double> updateNominas(ArrayList <Double> ViejasNominas) {
			ArrayList <Double> nominasFinales = new ArrayList <>();
			for (Double nomina: ViejasNominas) {
				if (nomina < 900) {
					nomina = nomina*1.3;
					nominasFinales.add(nomina);
				}else if (nomina >= 900 && nomina <1500) {
					nomina = nomina*1.2;
					nominasFinales.add(nomina);
				}else if (nomina>=1500 && nomina <6000) {
					nomina = nomina*1;
					nominasFinales.add(nomina);
				}else if (nomina >=6000) {
					nomina = nomina*2;
					nominasFinales.add(nomina);
				}
			
				
			}
			return nominasFinales;
		}
		
		public static double sumAll (ArrayList<Double> nominasYaActualizadas) {
			double pagoEmpresa = 0;
			for (double elemento:nominasYaActualizadas) {
			pagoEmpresa += elemento;
			}
			return pagoEmpresa;
		}
}