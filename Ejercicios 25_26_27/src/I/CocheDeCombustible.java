package I;


public class CocheDeCombustible extends Coche implements CaracteristicasMotor, CaracteristicasAparcamiento{

    public CocheDeCombustible(String marca, String modelo, String color, int puertas){
        super(marca, modelo, color, puertas);
    }

    @Override
    public String getTipoMotor() {
        return "de combustión";
    }

    @Override
    public int getPotenciaMotor() {
        return 150;
    }

    @Override
    public boolean necesitarEnchufe() {
        return false;
    }
}
