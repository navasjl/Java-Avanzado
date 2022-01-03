package Excepciones;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Esta clase tiene un método que lee de un fichero e imprime su contenido y lanza una excepción si hay un error al leer
 * del fichero
 */
public class Fichero {

    public void leerFichero(FileInputStream file) throws IOException{
        System.out.println(file.read());
    }
}
