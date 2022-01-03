package sesion21;

 import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrayInt=new ArrayList<Integer>();
        Scanner entrada=new Scanner(System.in);

        System.out.println("Introduce una cadena de enteros con el siguiente formato: "
                + "[entero, entero, entero..., entero]");
        String cadenaNumeros=entrada.nextLine();

        try {
            arrayInt=Util.stringToArray(cadenaNumeros);
            System.out.println(arrayInt.toString());
        }catch (Exception e) {
            System.out.println("Error. No se ha escrito la cadena en el formato adecuado "+e.getMessage());
        }

    }
}
