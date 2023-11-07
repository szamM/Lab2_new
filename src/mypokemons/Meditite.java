package mypokemons;

import mymoves.Meditite.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Meditite extends Pokemon {
    public Meditite(String name, int level){
        super(name, level);
        setType(Type.FIGHTING,  Type.PSYCHIC);
        setStats(30, 40, 55, 40, 55, 60);

        Confusion confusion = new Confusion(50, 100);
        WorkUp workUp = new WorkUp(0, 0);
        BulkUp bulkUp = new BulkUp(0, 0);
        super.setMove(confusion, workUp, bulkUp);

    }
}
