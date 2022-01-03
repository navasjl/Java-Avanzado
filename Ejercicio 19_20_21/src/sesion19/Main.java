package sesion19;

import org.jetbrains.annotations.NotNull;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * En la clase Main se hará una operación de división entre dos números, se imprimirá los elementos de un array hasta
 * el 6ºelemento y se leerá de un fichero y se lanzarán las excepciones ArtihmeticException, ArraysOutOfBOundsException
 * y IOException, respectivamente, cuando no se puedan realizar las operaciones previamente reseñadas.
 *
 * Adicionalmente se capturará la excepción de tipo FileNotFoundException en caso de que no exista el fichero del  que se
 * pretende leer
 */

/**
 * Ampliacion:
 * He añadido como argumentos en Args: 4 "aritmetica" "array" "fichero".
 * El 4 indica el número de argumentos que se le pasa a Args. Se recorrerán con un bucle los argumentos y se
 * realizarán las diferente operaciones con su respectivo tratamiento de la excepción para cada argumento en Args.
 */

public class Main {
    public static void main(String @NotNull [] args){

        try{
            for(int i=0;i<Integer.parseInt(args[0]);i++){
                if(args[i].equalsIgnoreCase("aritmetica")) {
                    Aritmetica aritmetica = new Aritmetica();
                    System.out.println(aritmetica.dividirPorCero(5,1));
                }
                else if(args[i].equalsIgnoreCase("array")){
                    ElementosArray elemArray=new ElementosArray();
                    int[] arrayInt=new int[]{1,2,3,4,5,6};

                    elemArray.printArray(arrayInt);
                }
                else if(args[i].equalsIgnoreCase("fichero")) {
                    Fichero fichero = new Fichero();
                    FileInputStream file= new FileInputStream("prueba.txt");

                    fichero.leerFichero(file);
                }
            }
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("No se pueden leer mas de 6 elementos "+e.getClass());
        }catch(FileNotFoundException e){
            System.out.println("No existe el fichero "+e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al abrir el fichero "+e.getMessage());
        }
    }
}
