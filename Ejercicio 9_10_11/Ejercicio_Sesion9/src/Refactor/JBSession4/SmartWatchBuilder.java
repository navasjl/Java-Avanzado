package Refactor.JBSession4;

public class SmartWatchBuilder {
    String tipoDispositivo;
    String modelo;
    String marca;
    double precio;
    String[] propiedades=new String[3];

    public SmartWatch smartWatch;


    private SmartWatchBuilder(){}

    public SmartWatchBuilder(String tipoDispositivo){
        smartWatch=new SmartWatch();
        smartWatch.tipoDispositivo=tipoDispositivo;
    }

    public SmartWatchBuilder setModelo(String modelo){
        smartWatch.modelo=modelo;
        return this;
    }
    public SmartWatchBuilder setMarca(String marca){
        smartWatch.marca=marca;
        return this;
    }
    public SmartWatchBuilder setPrecio(Double precio){
        smartWatch.precio=precio;
        return this;
    }
    public SmartWatchBuilder setPropiedades(String[] propiedades){
        smartWatch.propiedades=propiedades;
        return this;
    }
    public SmartWatch build(){
        return this.smartWatch;
    }

}
