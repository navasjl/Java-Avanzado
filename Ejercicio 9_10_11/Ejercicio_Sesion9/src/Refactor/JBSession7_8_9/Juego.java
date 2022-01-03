package Refactor.JBSession7_8_9;

import java.util.Map;
import java.util.Scanner;

public class Juego {
    public void dados(Map<Integer, String> map) {
        map.put(1,"Fatal");
        map.put(2,"Mala");
        map.put(3,"Regular");
        map.put(4,"Buena");
        map.put(5,"Muy buena");
        map.put(6,"Excelente");

        Scanner dice=new Scanner(System.in);
        System.out.println("Tira el dado: ");
        int points= dice.nextInt();

        if(map.containsKey(points))
            System.out.println("Tu puntuacion es: "+map.get(points));
        else
            System.out.println("El numero tiene que estar entre 1 y 6");

        dice.close();
    }
}
