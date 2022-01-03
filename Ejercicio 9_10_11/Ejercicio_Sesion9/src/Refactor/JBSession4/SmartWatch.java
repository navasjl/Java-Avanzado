package Refactor.JBSession4;

import java.util.Arrays;

public class SmartWatch extends SmartDevice{
    String[] propiedades=new String[3];

    public SmartWatch(){

    }

    public SmartWatch(String t, String mo, String ma, double precio, String[] propiedades) {
        super(t, mo, ma, precio);
        this.propiedades = propiedades;
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "tipoDispositivo='" + tipoDispositivo + '\'' +
                ", modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", propiedades=" + Arrays.toString(propiedades) +//ese array propiedades se imprime de la forma
                '}';                                          // que diga ToString en clase ARRAYS
    }
}
