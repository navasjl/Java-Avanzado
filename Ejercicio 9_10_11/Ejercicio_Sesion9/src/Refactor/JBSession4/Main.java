package Refactor.JBSession4;

public class Main {
    public static void main(String[] args) {

        //SmartDevice sd= new SmartDevice("Lavadora","Zanussi","Best",500d);
        //SmartPhone  sp= new SmartPhone("Telefono","Huawei", "Y678", 400d,true,"Android");
        //SmartWatch  sw= new SmartWatch("Reloj","Samsung","R849",300.00, new String[]{"Tactil", "WIFI", "LCD"});

        SmartDevice sd=new SmartDeviceBuilder("Lavadora")
                .setModelo("Zanussi").setMarca("Best").setPrecio(500d).build();

        SmartPhone sp=new SmartPhoneBuilder("Telefono")
                .setModelo("Huawei").setMarca("Y678").setPrecio(400.0)
                .setTiene5G(true).setSistemaOperativo("Android").build();

        SmartWatch sw=new SmartWatchBuilder("Reloj")
                .setModelo("Samsung").setMarca("R849").setPrecio(300d)
                        .setPropiedades(new String[]{"Tactil", "WIFI","LCD"}).build();

        System.out.println(sd.toString());
        System.out.println(sp.toString());
        System.out.println(sw.toString());

    }
}
