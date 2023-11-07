package mypokemons;

import mymoves.Meditite.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Medicham extends Volcanion {
    public Medicham(String name, int level){
        super(name, level);
        setType(Type.FIGHTING,  Type.PSYCHIC);
        setStats(60, 60, 75, 60, 75, 80);

        Confusion confusion = new Confusion(50, 100);
        WorkUp workUp = new WorkUp(0, 0);
        BulkUp bulkUp = new BulkUp(0, 0);
        EnergyBall energyBall = new EnergyBall(90, 100);
        super.setMove(confusion, workUp, bulkUp, energyBall);

    }
}
