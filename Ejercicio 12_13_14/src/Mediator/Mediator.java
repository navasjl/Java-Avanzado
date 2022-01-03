package Mediator;


import java.util.ArrayList;
import java.util.List;

/**
 * Esta clase inicializará una lkista de los coches que heredan de la clase Coche y una lista de peatones que heredan de
 * la clase Peaton.
 *
 * Indica los métodos que la clase Semaforo, la cual hereda de Mediator, implemntará para regular el tráfico y las
 * comunicaciones entre el resto de las clases
 */
abstract public class Mediator {

    List<Coche> coches;
    List<Peaton> peatones;

    public void setCoches(List<Coche> coches){
        this.coches=coches;
    }
    public void setPeatones(List<Peaton> peatones){
        this.peatones=peatones;
    }

    abstract void registraCoche(Coche coche);
    abstract void registraPeaton(Peaton peaton);
    abstract void setRed() throws InterruptedException;
    abstract void setGreen() throws InterruptedException;

}
