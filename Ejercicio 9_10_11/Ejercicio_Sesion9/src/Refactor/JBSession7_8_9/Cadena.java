package Refactor.JBSession7_8_9;

public class Cadena {


    public Cadena() {
    }

    public String reverse(String cadena){
        StringBuilder result= new StringBuilder();
        for( int i=cadena.length()-1;i>=0;i--)
            result.append(cadena.charAt(i));
        return result.toString();
    }

}
