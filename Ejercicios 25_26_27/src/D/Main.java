package D;

public class Main {
    public static void main(String[] args) {
        Coche coche1=new Coche();
        coche1.setMarca("Audi");
        coche1.setModelo("A3");
        coche1.setColor("Gris");
        coche1.setPuertas(5);

        Coche coche2=new Coche();
        coche2.setMarca("Audi");
        coche2.setModelo("A4");
        coche2.setColor("Negro");
        coche2.setPuertas(5);

        Coche coche3=new Coche();
        coche3.setMarca("BMW");
        coche3.setModelo("M3");
        coche3.setColor("Blanco");
        coche3.setPuertas(3);

        Coches coches=new Coches("memoria");

        coches.crearCoche(coche1);
        coches.crearCoche(coche2);
        coches.crearCoche(coche3);

        for(Coche coche:coches.listarCoches())
            System.out.println(coche.toString());


        System.out.println("Después de borrar el "+coche2.getMarca()+" "+coche2.getModelo()+", estos son los coches que quedan " +
                "en nuestra base de datos");
        coches.cochesDB.borrar(coche2);

        for(Coche coche: coches.listarCoches())
            System.out.println(coche.toString());
    }
}
