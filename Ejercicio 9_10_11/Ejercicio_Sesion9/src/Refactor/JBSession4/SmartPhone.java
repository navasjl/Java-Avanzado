package Refactor.JBSession4;

public class SmartPhone extends SmartDevice{

    boolean tiene5g;
    String sistemaOperativo;

    public SmartPhone(){

    }
    public SmartPhone(String tipoDispositivo, String modelo, String marca, double precio,
                                 boolean tiene5g, String sistemaOperativo){

        super(tipoDispositivo,modelo,marca,precio);
        this.tiene5g=tiene5g;
        this.sistemaOperativo=sistemaOperativo;

    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "tipoDispositivo='" + tipoDispositivo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tiene_5g=" + tiene5g +
                ", sistema_operativo='" + sistemaOperativo + '\'' +
                '}';
    }
}

