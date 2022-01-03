package Iterator;

public class Main {
    public static void main(String[] args) {

        Coches coches= new Coches();

        Coche coche1 =new Coche("Audi","A4","gris",1200d,3.6);
        Coche coche2 =new Coche("BMW","6","negro",1250d,3.7);
        Coche coche3 =new Coche("Peugeot","406","blanco",1300d,4.2);
        Coche coche4 =new Coche("Renault","Clio","azul",1100.0,3.4);

        coches.save(coche1);
        coches.save(coche2);
        coches.save(coche3);
        coches.save(coche4);

        //System.out.println(coches);Imprime CocheCRUDImpl que a su vez imprime todos los coches otra vez(como findAll
        //cuando hace return coches, List de Coche que llama al ToString() de la clase Coche

        System.out.println(coches.findAll());//imprime findall y tambien imprime todos los coches de la lista

        coches.delete(coche4);
        System.out.println(coches);

        //Ya sabemos que hay coches porque los he imprimido todos pero haré uso del patrón Iterator
        while(coches.hayMas()){
            Coche siguiente=coches.siguiente();
            System.out.println(siguiente);
        }
        coches.reinicia();
        System.out.println(coches);//los imprime todos, otra vez desde el principio
    }
}
