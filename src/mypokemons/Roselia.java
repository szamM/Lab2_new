package mypokemons;

import mymoves.Budew.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Roselia extends Pokemon {
    public Roselia(String name, int level){
        super(name, level);
        setType(Type.GRASS,  Type.POISON);
        setStats(50, 60, 45, 100, 80, 65);

        ShadowBall shadowBall = new ShadowBall(80, 100);
        MegaDrain megaDrain = new MegaDrain(40, 100);
        SleepPowder sleepPowder = new SleepPowder(0, 75);
        super.setMove(shadowBall, megaDrain, sleepPowder);

    }
}
