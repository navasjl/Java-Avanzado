package Refactor.JBSession4;

public class SmartPhoneBuilder {
    String tipoDispositivo;
    String modelo;
    String marca;
    double precio;
    boolean tiene5g;
    String sistemaOperativo;

    public SmartPhone smartPhone;


    private SmartPhoneBuilder(){}

    public SmartPhoneBuilder(String tipoDispositivo){
        smartPhone=new SmartPhone();
        smartPhone.tipoDispositivo=tipoDispositivo;
    }

    public SmartPhoneBuilder setModelo(String modelo){
        smartPhone.modelo=modelo;
        return this;
    }
    public SmartPhoneBuilder setMarca(String marca){
        smartPhone.marca=marca;
        return this;
    }
    public SmartPhoneBuilder setPrecio(Double precio){
        smartPhone.precio=precio;
        return this;
    }
    public SmartPhoneBuilder setTiene5G(boolean tiene5g){
        smartPhone.tiene5g=tiene5g;
        return this;
    }
    public SmartPhoneBuilder setSistemaOperativo(String sistemaOperativo){
        smartPhone.sistemaOperativo=sistemaOperativo;
        return this;
    }
    public SmartPhone build(){
        return this.smartPhone;
    }

}

