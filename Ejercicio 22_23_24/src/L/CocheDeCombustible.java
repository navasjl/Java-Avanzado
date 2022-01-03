package L;

public class CocheDeCombustible extends Coche{

    public CocheDeCombustible(String marca, String modelo, String color, int puertas){
        super(marca, modelo, color, puertas);
    }

    @Override
    public String getTipoMotor() {
        return "de combustión";
    }
}
