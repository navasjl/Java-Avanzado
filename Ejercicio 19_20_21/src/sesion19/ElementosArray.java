package sesion19;

import java.util.ArrayList;

/**
 * Esta clase tiene un método que imprime los elementos de un array que se le pasa como argumento pero solo imprime hasta
 * el 6º elemento. Si intenta acceder a más de 6 elementos lanzará una excepción de tipo ArrayIndexOutOfBounds Exception
 */
public class ElementosArray {

    public void printArray(int[] array) throws ArrayIndexOutOfBoundsException{

        for(int i=0;i<9;i++){
            if(i>=6)
                throw new ArrayIndexOutOfBoundsException();
            System.out.println(array[i]);
        }
    }
}
