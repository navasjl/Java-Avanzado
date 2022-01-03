package Refactor.JBSession7_8_9;

import java.util.Arrays;

public class ArrayBidimensionalEnteros {

    int[][] array;

    public ArrayBidimensionalEnteros(int[][] array){
        this.array=array;
    }
    public void printArrayBidimensional(){
        //for( int i=0;i< array.length;i++)
            //for(int j=0;j< array[i].length;j++)
                //System.out.println("La posicion ("+i+","+j+") tiene valor: "+array[i][j]);
        for(int[] fila: array)
            System.out.println(fila);
    }
}
