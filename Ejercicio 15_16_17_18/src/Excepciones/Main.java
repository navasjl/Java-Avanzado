package Excepciones;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * En la clase Main se hará una operación de división entre dos números, se imprimirá los elementos de un array hasta
 * el 6ºelemento y se leerá de un fichero y se lanzarán las excepciones ArtihmeticException, ArraysOutOfBOundsException
 * y IOException, respectivamente, cuando no se puedan realizar las operaciones previamente reseñadas.
 * Adicionalmente se caoturará la excepción de tipo FileNotFoundException en caso de que no exista el fichero del  que se
 * pretende leer
 */
public class Main {
    public static void main(String[] args){

        Aritmetica aritmetica=new Aritmetica();
        ElementosArray elemArray=new ElementosArray();
        Fichero fichero=new Fichero();

        int[] arrayInt=new int[]{1,2,3,4,5,6};

        try{
            aritmetica.dividirPorCero(5,0);
            elemArray.printArray(arrayInt);
            FileInputStream file= new FileInputStream("prueba.txt");
            fichero.leerFichero(file);
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No se pueden leer más de 6 elementos "+e.getMessage());
        }catch(FileNotFoundException e){
            System.out.println("No existe el fichero "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero "+e.getMessage());
        }
    }
}
