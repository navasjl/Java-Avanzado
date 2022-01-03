package Refactor.JBSession4;

public class SmartDevice {
    String tipoDispositivo;
    String modelo;
    String marca;
    double precio;

    public SmartDevice() {
    }

    public SmartDevice(String tipoDispositivo, String modelo, String marca, double precio){
        this.tipoDispositivo=tipoDispositivo;
        this.modelo=modelo;
        this.marca=marca;
        this.precio=precio;
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "tipoDispositivo='" + tipoDispositivo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                '}';
    }
}
