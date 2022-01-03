package Singlenton;

public class Sol {

    private boolean estaBrillando=false;
    private static Sol sol;//tiene que ser static para poder acceder a Sol en main sin crear un objeto de la clase

    private Sol(){//privado luego solo se puede llamar desde esta clase,luego solo se puede crear objetos con getInstance()

    }

    public static Sol getInstance(){
        if(sol==null)
            sol=new Sol();
        return sol;
    }

    public void brilla(){
        if(!estaBrillando) {
            System.out.println("Ahora empieza el sol a brillar.");
            estaBrillando=true;
        }
        else
            System.out.println("Sigue brillando");
    }
}
