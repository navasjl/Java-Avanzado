package D;

import java.util.ArrayList;

public interface CochesDB{
    void conectar();
    ArrayList<Coche> obtener();
    Coche buscar(Coche coche);
    void insertar(Coche coche);
    void borrar(Coche coche);
}
