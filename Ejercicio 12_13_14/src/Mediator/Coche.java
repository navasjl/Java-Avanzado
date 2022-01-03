package Mediator;

/**
 * Esta clase abstracta contiene los métodos move() y stop() que las instancias de las clases que heredan de la clase Coche
 * implementarán.
 *
 * Contiene un atributo que es un objeto de tipo Semaforo y que hereda de la clase abstracta Mediator. Este semaforo es el
 * que media con los objetos de las clases que heredan de la clase Coche
 */
abstract public class Coche {

    Mediator semaforo=new Semaforo();

    public Coche(Mediator semaforo) {
        this.semaforo = semaforo;
    }

    abstract void move() throws InterruptedException;
    abstract void stop() throws InterruptedException;
}