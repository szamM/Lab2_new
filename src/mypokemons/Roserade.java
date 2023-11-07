package mypokemons;

import mymoves.Budew.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roserade extends Pokemon {
    public Roserade(String name, int level){
        super(name, level);
        setType(Type.GRASS,  Type.POISON);
        setStats(60, 70, 65, 125, 105, 90);

        ShadowBall shadowBall = new ShadowBall(80, 100);
        MegaDrain megaDrain = new MegaDrain(40, 100);
        SleepPowder sleepPowder = new SleepPowder(0, 75);
        super.setMove(shadowBall, megaDrain, sleepPowder);

    }
}
