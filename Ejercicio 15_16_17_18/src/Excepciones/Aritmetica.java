package Excepciones;

/**
 * Esta clase usa el metodo que divide un número entre otro. Si se divide entre cero lanza una Excepción de tipo
 * ArithmeticException
 */
public class Aritmetica {

    public int dividirPorCero(int a, int b) throws ArithmeticException{
        if(b==0)
            throw new ArithmeticException("No se puede didvidir por cero");
        return a/b;
    }
}
