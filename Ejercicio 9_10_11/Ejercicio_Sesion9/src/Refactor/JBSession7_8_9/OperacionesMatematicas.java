package Refactor.JBSession7_8_9;

public class OperacionesMatematicas {
    public int DividePorCero(int a,int b) throws ArithmeticException {
        //int result = a / b;
        //if (result == 0)
            //throw new ArithmeticException();
        //else
            //return result;

        if (a/b==0)
            throw new ArithmeticException();
        return a/b;

    }
}
