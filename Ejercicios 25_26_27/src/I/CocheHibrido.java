package I;

public class CocheHibrido extends Coche implements CaracteristicasMotor, CaracteristicasAparcamiento {

    public CocheHibrido(String marca, String modelo, String color, int puertas){
        super(marca, modelo, color, puertas);
    }
    @Override
    public String getTipoMotor() {
        return "híbrido";
    }

    @Override
    public int getPotenciaMotor() {
        return 130;
    }

    @Override
    public boolean necesitarEnchufe() {
        return false;
    }

}
