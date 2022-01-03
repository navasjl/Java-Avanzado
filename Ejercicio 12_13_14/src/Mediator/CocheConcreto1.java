package Mediator;

/**
 * En el constructor se llama a la clase padre Coche para establecer el objeto de la clase Semaforo que regulará sus
 * comunicaciones.
 *
 * move() indica que el CocheConcreto1 se mueve mientras que stop() indica que el CocheConcreto2 se para
 */
public class CocheConcreto1 extends Coche{

    public CocheConcreto1(Mediator semaforo){
        super(semaforo);
    }

    @Override
    void move(){
        System.out.println("Soy CocheConcreto1, estoy circulando por la carretera");
    }

    @Override
    void stop() {
        System.out.println("Soy CocheConcreto1, estoy esperando a que el semáforo se ponga en verde");
    }
}
