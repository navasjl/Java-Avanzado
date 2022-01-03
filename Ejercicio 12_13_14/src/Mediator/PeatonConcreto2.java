package Mediator;

/**
 * Al igual que en PeatonConcreto1
 * En el constructor se llama a la clase padre Peaton para establecer el objeto de la clase Semaforo que regulará sus
 * comunicaciones.
 *
 * move() indica que el PeatonConcreto1 se mueve.
 *
 * A diferencia de PeatonConcreto1, stop() no solo indicará que PeatonConcreto se para sino que, también, indicará al
 * Semaforo con el método setRed() que los peatones están parados esperando a que el semáforo se ponga en rojo
 * (rojo para los coches es verde para los peatones)
 */
public class PeatonConcreto2 extends Peaton{

    public PeatonConcreto2(Mediator semaforo){
        super(semaforo);
    }
    @Override
    void move(){
        System.out.println("Soy PeatonConcreto2, estoy cruzando el paso de cebras");

    }

    @Override
    void stop() throws InterruptedException {
        System.out.println("Soy PeatonConcreto1, estoy esperando a que el semáforo se ponga en rojo");
        semaforo.setRed();
    }
}
