package D;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class CochesDBFichero implements CochesDB{

    private String ficheroDatos="coches.txt";
    @Override
    public void conectar() {

    }

    @Override
    public ArrayList<Coche> obtener() {
        ArrayList<Coche> coches = new ArrayList();

        try {
            Scanner scanner = new Scanner(new File(ficheroDatos));

            while (scanner.hasNext()) {
                String cocheActual = scanner.next();
                String []partes = cocheActual.split(",");

                Coche coche = new Coche();
                coche.setMarca(partes[0]);
                coche.setModelo(partes[1]);
                coche.setColor(partes[2]);
                coche.setPuertas(Integer.parseInt(partes[3]));

                coches.add(coche);
            }

            scanner.close();
        } catch (Exception e) {
        }

        return coches;
    }

    @Override
    public Coche buscar(Coche coche) {
        ArrayList<Coche> coches = obtener();

        for (Coche cocheActual : coches) {
            if (cocheActual.getMarca().equalsIgnoreCase(coche.getMarca()) && cocheActual.getModelo().equalsIgnoreCase(coche.getModelo())
            && cocheActual.getColor().equalsIgnoreCase(coche.getColor()) && cocheActual.getPuertas()==coche.getPuertas()) {
                return cocheActual;
            }
        }

        return null;
    }

    @Override
    public void insertar(Coche coche) {
        try {
            //Inserta el coche al final del fichero
            FileOutputStream fileOutputStream = new FileOutputStream(ficheroDatos, true);
            PrintStream printStream = new PrintStream(fileOutputStream);
            printStream.println(separarCochePorComas(coche));
            printStream.flush();
            printStream.close();
        } catch (Exception e) {
        }
    }

    @Override
    public void borrar(Coche coche) {
        ArrayList<Coche> coches = obtener();

        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getMarca().equalsIgnoreCase(coche.getMarca()) &&
                    coches.get(i).getModelo().equalsIgnoreCase(coche.getModelo()) &&
                     coches.get(i).getColor().equalsIgnoreCase(coche.getColor()) &&
                             coches.get(i).getPuertas()==coche.getPuertas()) {

                coches.remove(i);
            }
        }

        try {
            PrintStream printStream = new PrintStream(ficheroDatos);

            //Reescribe el fuchero con los nuevos objetos, separados por comas
            for (Coche cocheActual : coches) {
                String cocheComas = separarCochePorComas(cocheActual);
                printStream.println(cocheComas);
            }

            printStream.close();
        } catch (Exception e) {
        }

    }

    private String separarCochePorComas(Coche coche) {
        return coche.getMarca() + ","
                + coche.getModelo() + ","
                + coche.getColor() + ","
                + coche.getPuertas();
    }
}
