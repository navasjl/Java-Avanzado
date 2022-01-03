package Refactor.JBSession7_8_9;

import java.io.*;
import java.util.Scanner;

public class Fichero {
    public void inputFileToOutputFile(InputStream fileIn, PrintStream fileOut) throws FileNotFoundException, IOException {
        byte[] datos=new byte[20];

        datos=fileIn.readAllBytes();
        fileOut.write(datos);

    }
    public void printASCIIfromInputFile (InputStream ficheroIn) throws FileNotFoundException,IOException{
        int dato=ficheroIn.read();
        while(dato!=-1){
            System.out.print(dato+" ");
            dato=ficheroIn.read();
        }
        if(dato==-1) {
            System.out.println("Se termino de leer");
            ficheroIn.close();
        }
        else
            throw new IOException();
    }
    public void printToOutputFile(PrintWriter ficheroOut) {
        Scanner entrada=new Scanner(System.in);
        for(int i=0;i<5;i++) {
            System.out.println("Introduce un entero hasta un total de cinco: ");
            ficheroOut.write(entrada.nextInt());

        }
        ficheroOut.close();
        entrada.close();
    }
}
