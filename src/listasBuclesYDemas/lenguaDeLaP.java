package listasBuclesYDemas;

public class lenguaDeLaP {

	public static void main(String[] args) {
		String palabros = "Montserrat";
		
		System.out.println(convertidor(palabros));
	}
	public static String convertidor (String cualquiera) {
		//inicializar el indice; evaluar expresion antes de ejecutar;
		//se ejecuta incremento
		StringBuilder convertida  = new StringBuilder();
		for (int i = 0; i< cualquiera.length(); i++){
			char caracter = cualquiera.charAt(i);
			if (caracter== 'a') {
				convertida.append("apa");
			}else if (caracter =='e') {
				convertida.append("epe");
			}else if (caracter =='i') {
				convertida.append("ipi");
			}else if (caracter =='o') {
				convertida.append("opo");
			}else if (caracter=='u') {
				convertida.append("upu");
			}else {
				convertida.append(caracter);
			}
		}
		return convertida.toString();
	}
}
