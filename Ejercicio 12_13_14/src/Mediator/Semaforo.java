package Mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Semaforo extends Mediator{

    List<Coche> coches=new ArrayList<>();
    List<Peaton> peatones=new ArrayList<>();

    /**
     * Registra los coches en el array de coches que no estén ya registrados
     *
     * @param coche  Será el coche a registrar
     */
    @Override
    void registraCoche(Coche coche) {
        if(!coches.contains(coche))
            coches.add(coche);
    }

    /**
     *  Registra los coches en el array de coches que no estén ya registrados
     *
     *  @param peaton  Será el peatón a registrar
     *
     */
    @Override
    void registraPeaton(Peaton peaton) {
        if(!peatones.contains(peaton))
            peatones.add(peaton);
    }

    /**
     * Retrasa el proceso 5 segundos (la duración de nuestro semáforo)
     *
     * Indicará los coches que circulan y los peatones que esperan
     * @throws InterruptedException si da error cuando el proceso se retras 5 segundos
     */
    @Override
    void setGreen() throws InterruptedException {

        TimeUnit.SECONDS.sleep(5);
        System.out.println("SEMAFORO EN VERDE");
        System.out.println("Coches pueden circular y peatones deben esperar");
        for(Coche coche:coches)
            coche.move();
        for(Peaton peaton:peatones)
            peaton.stop();

    }

    /**
     * Retrasa el proceso 5 segundos (la duración de nuestro semáforo)
     *
     * Indicará los peatones que cruzan y los coches que esperan
     * @throws InterruptedException si da error cuando el proceso se retrasa 5 segundos
     *
     */
    @Override
    void setRed() throws InterruptedException {

        TimeUnit.SECONDS.sleep(5);
        System.out.println("SEMAFORO EN ROJO");
        System.out.println("Peatones pueden cruzar");
        for(Peaton peaton:peatones)
            peaton.move();
        for(Coche coche:coches)
            coche.stop();

    }
}
