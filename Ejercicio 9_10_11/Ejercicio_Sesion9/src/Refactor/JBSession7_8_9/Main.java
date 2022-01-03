package Refactor.JBSession7_8_9;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        Cadena cadena = new Cadena();
        System.out.println(cadena.reverse("Hola Mundo"));

        ArrayCadenas arrayCadenas = new ArrayCadenas();
        arrayCadenas.printArray(new String[]{"Sevilla", "Malaga", "Granada", "Huelva", "Cadiz", "Cordoba", "Jaen", "Almeria"});

        ArrayBidimensionalEnteros arrayBiEnteros = new ArrayBidimensionalEnteros(new int[][]{{1, 2, 3, 4}, {2, 4, 6, 8}});
        arrayBiEnteros.printArrayBidimensional();

        Vector<Integer> vector = new Vector<>();
        vector.add(2);
        vector.add(4);
        vector.add(6);
        vector.add(8);
        vector.add(10);
        Vector5Enteros vector5 = new Vector5Enteros();
        vector5.printVectorSin2y3Elementos(vector);

        MiArrayList arraylist = new MiArrayList();

        ArrayList<String> array = new ArrayList<>();
        array.add("Rojo");
        array.add("Verde");
        array.add("Azul");
        array.add("Amarillo");

        arraylist.printArrayListYLinkedList(array);
        arraylist.printOddNumbersArrayList();

        Juego juego = new Juego();
        Map<Integer, String> map = new HashMap<>();
        juego.dados(map);

        OperacionesMatematicas operacion = new OperacionesMatematicas();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce 2 numeros: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            System.out.println(operacion.DividePorCero(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        }
        scanner.close();


        try {

            Fichero fichero = new Fichero();
            InputStream fileIn = new FileInputStream("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileIn.txt");
            PrintStream fileOut = new PrintStream("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileOut.txt");

            fichero.inputFileToOutputFile(fileIn, fileOut);

            fichero.printASCIIfromInputFile(fileIn);

            PrintWriter ficheroOut = new PrintWriter("C:\\Users\\Jose\\IdeaProjects\\Project_JavaBasico\\src\\Sesion7_8_9\\fileOut_Ejercicio9.txt");
            fichero.printToOutputFile(ficheroOut);

            fileIn.close();
            fileOut.close();
            ficheroOut.close();

            int[] array5enteros = new int[5];
            ArrayEnteros arrayInt = new ArrayEnteros();
            arrayInt.fillInArray(array5enteros);

        } catch (FileNotFoundException e) {
            System.out.println("No existe el fichero" + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error al leer del fichero" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("No se pueden introducir mas valores en ese array");
        }
    }

}
