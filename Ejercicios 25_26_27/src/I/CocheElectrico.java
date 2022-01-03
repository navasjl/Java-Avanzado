package I;


public class CocheElectrico extends Coche implements CaracteristicasMotor, CaracteristicasAparcamiento{

    public CocheElectrico(String marca, String modelo, String color, int puertas){
        super(marca, modelo, color, puertas);
    }

    @Override
    public String getTipoMotor() {
        return "eléctrico";
    }

    @Override
    public int getPotenciaMotor() {
        return 110;
    }

    @Override
    public boolean necesitarEnchufe() {
        return true;
    }
}
