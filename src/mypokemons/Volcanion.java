package mypokemons;

import mymoves.Volcanion.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Volcanion extends Pokemon {
    public Volcanion(String name, int level){
        super(name, level);
        setType(Type.FIRE,  Type.WATER);
        setStats(80, 110, 120, 130, 90, 70);

        Bulldoze bulldoze = new Bulldoze(60, 100);
        Flamethrower flamethrower = new Flamethrower(90, 100);
        SludgeBomb sludgeBomb = new SludgeBomb(90, 100);
        SludgeWave sludgeWave = new SludgeWave(95, 100);
        super.setMove(bulldoze,flamethrower,sludgeBomb, sludgeWave);
    }
}
