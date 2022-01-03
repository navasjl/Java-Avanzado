package I;


public class Main {
    public static void main(String[] args) {

        Coche coche = new CocheDeCombustible("Audi", "A5", "Gris", 5);
        Coche coche2 = new CocheElectrico("Ford", "Mondeo", "Blanco", 5);
        Coche coche3 = new CocheHibrido("Citroen", "C3", "Negro", 3);

        imprimirCaracteristicasMotor(coche);
        imprimirCaracteristicasAparcamiento(coche2);
        imprimirCaracteristicasAparcamiento(coche3);
    }
    public static void imprimirCaracteristicasMotor(Object coche){

        if(coche instanceof CocheDeCombustible){
            System.out.println(((CocheDeCombustible) coche).getMarca()+" "+((CocheDeCombustible) coche).getModelo()
            +" tiene un motor "+((CocheDeCombustible) coche).getTipoMotor()+" y una potencia de "+
                    ((CocheDeCombustible) coche).getPotenciaMotor());
        }
        else if(coche instanceof CocheElectrico){
            System.out.println(((CocheElectrico) coche).getMarca()+" "+((CocheElectrico) coche).getModelo()
            +" tiene un motor "+((CocheElectrico) coche).getTipoMotor()+" y una potencia de "+
                    ((CocheElectrico) coche).getPotenciaMotor());
        }
        else if(coche instanceof CocheHibrido){
            System.out.println(((CocheHibrido) coche).getMarca()+" "+((CocheHibrido) coche).getModelo()
            +" tiene un motor "+((CocheHibrido) coche).getTipoMotor()+" y una potencia de "+
                    ((CocheHibrido) coche).getPotenciaMotor());
        }
    }
    public static void imprimirCaracteristicasAparcamiento(Coche coche){
        if(coche instanceof CocheDeCombustible){
            System.out.println(((CocheDeCombustible) coche).getMarca()+" "+((CocheDeCombustible) coche).getModelo()
                    +". ¿Necesita enchufe en el aparcamiento? " +((CocheDeCombustible) coche).necesitarEnchufe());
        }
        else if(coche instanceof CocheElectrico){
            System.out.println(((CocheElectrico) coche).getMarca()+" "+((CocheElectrico) coche).getModelo()
                    +". ¿Necesita enchufe en el aparcamiento? " +((CocheElectrico) coche).necesitarEnchufe());
        }
        else if(coche instanceof CocheHibrido){
            System.out.println(((CocheHibrido) coche).getMarca()+" "+((CocheHibrido) coche).getModelo()
                    +". ¿Necesita enchufe en el aparcamiento? " +((CocheHibrido) coche).necesitarEnchufe());
        }

    }
}
