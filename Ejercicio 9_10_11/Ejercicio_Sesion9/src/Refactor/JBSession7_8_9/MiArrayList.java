package Refactor.JBSession7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class MiArrayList {

    public void printArrayListYLinkedList(ArrayList<String> array){
        LinkedList<String> lista=new LinkedList<>();

        System.out.print("El ArrayList tiene los valores: ");
        for(int i=0;i< array.size();i++) {
            lista.add(array.get(i));
            System.out.print(array.get(i)+" ");//se necesita la posicion, no se refactoriza el for
        }
        System.out.print("La LinkedList tiene los valores: ");
        for(String elemento:lista)
            System.out.print(elemento+" ");

    }
    public void printOddNumbersArrayList() {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            array.add(i + 1);

        for (int j = 0; j < array.size(); j++) {
            if (array.get(j) % 2 == 0)
                array.remove(array.get(j));
        }
        for (int i = 0; i < array.size(); i++)
            System.out.print(array.get(i) + " ");
    }
}
