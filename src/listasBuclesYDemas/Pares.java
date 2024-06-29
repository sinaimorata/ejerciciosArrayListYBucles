package listasBuclesYDemas;

import java.util.ArrayList;

public class Pares{

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1); 
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        ArrayList<Integer> listDos = new ArrayList<>();

        list.add(1); 
        list.add(7);
        list.add(3);
        list.add(0);
        list.add(59);
        list.add(13);
 
        System.out.println(selectEven(list));
        System.out.println(selectEven(listDos));
    }

    public static ArrayList<Integer> selectEven(ArrayList<Integer> pares) {
        ArrayList<Integer> paresSeleccionados = new ArrayList<>();

        for (Integer element : pares) {
            if (element % 2 == 0) {
                paresSeleccionados.add(element);
            }
        }
        return paresSeleccionados;
    }
}
