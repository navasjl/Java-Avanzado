package O;

public class Main {
    public static void main(String[] args) {

        Coche coche=new Coche("Audi","S4","Gris", 5);

        System.out.println("Terrible!!! Después de ir al concesionario y haber comprado un "+coche.getMarca() +" "
                +coche.getModelo()+" de color "+coche.getColor()+" y con "+coche.getPuertas()+" puertas, me han dicho que" +
                " no quedan");

        coche.setPuertas(3);
        System.out.println("Y encima mi primo va y se compra el mismo coche, hasta el color es el mismo solo que con "
                +coche.getPuertas()+ " puertas");
    }
}
