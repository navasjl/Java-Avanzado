package Iterator;

import java.util.ArrayList;
import java.util.List;

public class CocheCRUDImpl implements CocheCRUD{

    private List<Coche> coches= new ArrayList<>();

    public CocheCRUDImpl() {

    }

    public CocheCRUDImpl(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public String toString() {
        return "CocheCRUDImpl{" +
                "coches=" + coches +
                '}';
    }

    @Override
    public void save(Coche coche) {
        System.out.println("save");
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {// anadido al ejercicio de la sesion 5 para practicar
        System.out.println("findAll");
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete");
        coches.remove(coche);
    }
}

