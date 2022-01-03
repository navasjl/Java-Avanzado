package L;

public class CocheElectrico extends Coche{

    public CocheElectrico(String marca, String modelo, String color, int puertas){
        super(marca, modelo, color, puertas);
    }

    @Override
    public String getTipoMotor() {
        return "eléctrico";
    }
}
