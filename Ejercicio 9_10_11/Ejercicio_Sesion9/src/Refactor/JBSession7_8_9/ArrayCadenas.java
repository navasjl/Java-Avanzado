package Refactor.JBSession7_8_9;

import java.util.Arrays;

public class ArrayCadenas {

    public void printArray(String[] array){
        //for(String i:array)
            //System.out.print(i+" ");
        Arrays.stream(array).forEach(i-> System.out.println(i+" "));
    }
}
