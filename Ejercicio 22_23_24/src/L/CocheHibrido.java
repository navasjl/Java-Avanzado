package L;

public class CocheHibrido extends Coche{

    public CocheHibrido(String marca, String modelo, String color, int puertas){
        super(marca, modelo, color, puertas);
    }

    @Override
    String getTipoMotor() {
        return "híbrido";
    }
}
