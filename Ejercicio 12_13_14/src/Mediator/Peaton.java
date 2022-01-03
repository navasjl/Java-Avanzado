package Mediator;

/**
 * Esta clase abstracta contiene los métodos move() y stop() que las instancias de las clases que heredan de la clase Peaton
 * implementarán.
 *
 * Contiene un atributo que es un objeto de tipo Semaforo y que hereda de la clase abstracta Mediator. Este semaforo es el
 * que media con los objetos de las clases que heredan de la clase Peaton
 */
abstract public class Peaton {
    Mediator semaforo;

    public Peaton(Mediator semaforo) {
        this.semaforo = semaforo;
    }

    abstract void move();
    abstract void stop() throws InterruptedException;
}
