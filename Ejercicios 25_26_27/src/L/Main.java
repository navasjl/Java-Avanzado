package L;

public class Main {
    public static void main(String[] args) {

    Coche coche = new CocheDeCombustible("Seat", "Panda", "Blanco", 3);

    System.out.println("Me he comprado un "+coche.getMarca()+" "+coche.getModelo()+" de color "+coche.getColor()+" con "
    +coche.getPuertas()+" puertas y con motor "+coche.getTipoMotor());

    //Abajo he copiado el mismo código 2 veces. Sin cambiar ni una sola línea de código, solo instanciando el objeto de
    //su respectiva clase, obtendremos el mismo objeto con los mismos métodos, especificando el tipo de motor para cada
    //tipo de instancia


    //Coche coche = new CocheElectrico("Seat", "Panda", "Blanco", 3);
    //System.out.println("Me he comprado un "+coche.getMarca()+" "+coche.getModelo()+" de color "+coche.getColor()+" con "
           // +coche.getPuertas()+" puertas y con motor "+coche.getTipoMotor());

    //Coche coche = new CocheHibrido("Seat", "Panda", "Blanco", 3);
    //System.out.println("Me he comprado un "+coche.getMarca()+" "+coche.getModelo()+" de color "+coche.getColor()+" con "
               // +coche.getPuertas()+" puertas y con motor "+coche.getTipoMotor());


    }
}
