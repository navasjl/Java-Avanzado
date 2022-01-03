package Refactor.JBSession4;

public class SmartDeviceBuilder {
    String tipoDispositivo;
    String modelo;
    String marca;
    double precio;

    public SmartDevice smartDevice;


    private SmartDeviceBuilder(){}

    public SmartDeviceBuilder(String tipoDispositivo){
        smartDevice=new SmartDevice();
        smartDevice.tipoDispositivo=tipoDispositivo;
    }
    public SmartDeviceBuilder setModelo(String modelo){
        smartDevice.modelo=modelo;
        return this;
    }
    public SmartDeviceBuilder setMarca(String marca){
        smartDevice.marca=marca;
        return this;
    }
    public SmartDeviceBuilder setPrecio(Double precio){
        smartDevice.precio=precio;
        return this;
    }

    public SmartDevice build(){
        return this.smartDevice;
    }

}
