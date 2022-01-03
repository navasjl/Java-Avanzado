package Mediator;

/**
 * Al igual que en CocheConcreto1
 * En el constructor se llama a la clase padre Coche para establecer el objeto de la clase Semaforo que regulará sus
 * comunicaciones.
 *
 * move() indica que el CocheCocnreto1 se mueve.
 *
 * A diferencia de CocheConcreto1, stop() no solo indicará que CocheConcreto se para sino que, también, indicará al
 * Semaforo con el método setGreen() que los coches están parados esperando a que el semáforo se ponga en verde
 */
public class CocheConcreto2 extends Coche{

    public CocheConcreto2(Mediator semaforo){
        super(semaforo);
    }

    @Override
    void move(){
        System.out.println("Soy CocheConcreto2, estoy circulando por la carretera");
    }

    @Override
    void stop() throws InterruptedException {
        System.out.println("Soy CocheConcreto2, estoy esperando a que el semáforo se ponga en verde");
        semaforo.setGreen();
    }

}
