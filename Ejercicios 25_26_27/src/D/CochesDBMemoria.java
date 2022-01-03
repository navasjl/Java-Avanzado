package D;

import java.util.ArrayList;

public class CochesDBMemoria implements CochesDB{

    ArrayList<Coche> coches = new ArrayList();

    @Override
    public void conectar() {

    }

    @Override
    public ArrayList<Coche> obtener() {
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
        for (Coche cocheActual : coches) {
            if (cocheActual.getMarca().toLowerCase().equals(coche.getMarca().toLowerCase()) &&
                    cocheActual.getModelo().toLowerCase().equals(coche.getModelo().toLowerCase()) &&
                    cocheActual.getColor().toLowerCase().equals(coche.getColor().toLowerCase()) &&
                    cocheActual.getPuertas()==coche.getPuertas()) {

                return;
            }
        }

        coches.add(coche);
    }

    @Override
    public void borrar(Coche coche) {
        for (int i = 0; i < coches.size(); i++) {
            if (coches.get(i).getMarca().equalsIgnoreCase(coche.getMarca()) &&
                    coches.get(i).getModelo().equalsIgnoreCase(coche.getModelo()) &&
                    coches.get(i).getColor().equalsIgnoreCase(coche.getColor()) &&
                    coches.get(i).getPuertas()==coche.getPuertas()) {

                coches.remove(i);
            }
        }
    }
}
