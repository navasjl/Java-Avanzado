package I;
 public class Coche {
    private String marca;
    private String modelo;
    private String color;
    private int puertas;

    public Coche(String marca, String modelo, String color, int puertas){
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.puertas=puertas;
    }

    //abstract String getTipoMotor(); desaparece y es ahora parte  de la interfaz CaracteristicasMotor


    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getPuertas() {
        return puertas;
    }
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

}
