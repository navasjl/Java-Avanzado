package Refactor.JBSession7_8_9;

public class ArrayEnteros {

    public void fillInArray(int[] array) throws ArrayIndexOutOfBoundsException{
        boolean sigue=true;
        int cont=0;

        while(cont< array.length && sigue) {
            array[cont] = cont + 1;
            System.out.println(array[cont]);
            cont++;
            if(cont==5){
                sigue=false;
                throw new ArrayIndexOutOfBoundsException();
            }

        }
    }
}
