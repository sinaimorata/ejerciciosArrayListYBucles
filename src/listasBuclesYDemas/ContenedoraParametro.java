package listasBuclesYDemas;

import java.util.ArrayList;

public class ContenedoraParametro {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        
        list.add("patata");
        list.add("talego");
        list.add("tomate");
        list.add("tartera");

        String cadenaMaestra = "ta";

        System.out.println(selectContains(list, cadenaMaestra));
    }

    public static ArrayList<String> selectContains(ArrayList<String> cadenitillas, String comparadora) {
        ArrayList<String> definitiva = new ArrayList<>();
        for (String element : cadenitillas) {
            if (element.contains(comparadora)) {
                definitiva.add(element);
            }
        }
        return definitiva;
    }
}
