package Refactor.JBSession7_8_9;

import java.util.Vector;

public class Vector5Enteros {

    public void printVectorSin2y3Elementos(Vector<Integer> vector){
        for(int i=0;i<5;i++)
            vector.add(i+1);
        vector.remove(1);//remove the 2nd element from Vector
        vector.remove(1);//remove the 2nd element from new Vector,which is the 3rd from the original one
        for(int i=0;i<vector.size();i++)
            System.out.print(vector.get(i).toString()+" ");
    }
}
