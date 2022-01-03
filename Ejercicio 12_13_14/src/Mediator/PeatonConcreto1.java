package Mediator;

/**
 * En el constructor se llama a la clase padre Peaton para establecer el objeto de la clase Semaforo que regulará sus
 * comunicaciones.
 *
 * move() indica que el PeatonConcreto1 se mueve mientras que stop() indica que el PeatonConcreto2 se para
 */
public class PeatonConcreto1 extends Peaton{

    public PeatonConcreto1(Mediator semaforo){
        super(semaforo);
    }
    @Override
    void move(){
        System.out.println("Soy PeatonConcreto1, estoy cruzando el paso de cebras");

    }

    @Override
    void stop(){
        System.out.println("Soy PeatonConcreto1, estoy esperando a que el semáforo se ponga en rojo");

    }
}
