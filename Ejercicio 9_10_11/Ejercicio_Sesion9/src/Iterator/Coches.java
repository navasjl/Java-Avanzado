package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Coches implements CocheIterator, CocheCRUD{

    List<Coche> coches=new ArrayList<>();
    int posCoche=0;

    public Coches(){}

    public Coches(List<Coche> coches) {
        this.coches = coches;
    }

    @Override
    public void save(Coche coche) {
        System.out.println("save");
        coches.add(coche);
    }

    @Override
    public List<Coche> findAll() {
        System.out.println("findAll");
        return coches;
    }

    @Override
    public void delete(Coche coche) {
        System.out.println("delete");
        coches.remove(coche);
    }

    @Override
    public Coche siguiente() {
        Coche coche=coches.get(posCoche);
        posCoche++;
        return coche;
    }

    @Override
    public boolean hayMas() {
        if(posCoche==coches.size())
            return false;
        return true;
    }

    @Override
    public void reinicia() {
        posCoche=0;
    }

    @Override
    public String toString() {
        return "Coches{" +
                "coches=" + coches +
                '}';
    }
}
