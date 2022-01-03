package D;

import java.util.ArrayList;

public class Coches {

        public CochesDB cochesDB;

        protected Coches() {}

        public Coches(String tipoBBDD) {
            if(tipoBBDD.equalsIgnoreCase("memoria"))
                cochesDB=new CochesDBMemoria();
            else if(tipoBBDD.equalsIgnoreCase("fichero"))
                cochesDB=new CochesDBFichero();
        }



        public ArrayList<Coche> listarCoches() {

            return cochesDB.obtener();
        }

        public Coche obtenerCoche(String marca, String modelo, String color, int puertas) {
            Coche coche = new Coche();
            coche.setMarca(marca);
            coche.setModelo(modelo);
            coche.setColor(color);
            coche.setPuertas(puertas);

            return cochesDB.buscar(coche);
        }

        public void crearCoche(Coche coche) {
            if (cochesDB.buscar(coche) != null) {
                return;
            }

            cochesDB.insertar(coche);
        }

        public void borrarCoche(String marca, String modelo, String color, int puertas) {
            Coche coche = new Coche();
            coche.setMarca(marca);
            coche.setModelo(modelo);
            coche.setColor(color);
            coche.setPuertas(puertas);


            cochesDB.borrar(coche);
        }
}

