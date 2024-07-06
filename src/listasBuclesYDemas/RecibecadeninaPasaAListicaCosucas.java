package listasBuclesYDemas;

import java.util.ArrayList;

public class RecibecadeninaPasaAListicaCosucas {

	public static void main(String[] args) {


		String delDolor = "lo que hay que sufrir";


			System.out.println(convertidor(delDolor));
		}
		public static ArrayList <String> convertidor (String emocional){
			ArrayList <String> laFinal = new ArrayList <>();

			// Iterar sobre cada carácter de la cadena y agregarlo a la lista
			//inicializar el indice; evaluar expresion antes de ejecutar; se ejecuta incremento
			for (int i = 0; i < emocional.length(); i++) {

				laFinal.add(String.valueOf(emocional.charAt(i)));
			}
			return laFinal;
		}

	}

