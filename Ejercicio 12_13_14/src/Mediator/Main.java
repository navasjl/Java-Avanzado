package Mediator;

/**
 * Se crea un objeto de tipo Semaforo, uno de CocheConcreto1, uno deCocheConcreto2, uno de PeatonConcreto1 y uno de
 * PeatonConcreto2.
 *
 * Se registran todos los objetos anteriores con el objeto de tipo Semaforo pues será éste quien regule sus comunicaciones
 *
 * Capturamos la excepción que podría darse en los métodos setGreen() y setRed() en la clase Semaforo.
 * Si no da error,cuando SetGreen() ponga el semáforo en verde, los coches indicarán que están circulando mientras que
 * los peatones indicarán que están esperando. Del mismo modo, cuando setRed() ponga el semáforo en rojo, los peatones
 * indicarán que están cruzando la calle minetras que los coches indicarán que están esperando
 */
public class Main {

    public static void main(String[] args){

        Mediator semaforo = new Semaforo();
        Coche coche1 = new CocheConcreto1(semaforo);
        Coche coche2 = new CocheConcreto2(semaforo);
        Peaton peaton1 = new PeatonConcreto1(semaforo);
        Peaton peaton2 = new PeatonConcreto2(semaforo);

        semaforo.registraCoche(coche1);
        semaforo.registraCoche(coche2);
        semaforo.registraPeaton(peaton1);
        semaforo.registraPeaton(peaton2);
        try{
            semaforo.setGreen();
            semaforo.setRed();
        }catch (InterruptedException e){
            System.out.println("Error"+e.getMessage());
        }


    }

}
