package mypokemons;

import mymoves.Budew.*;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Budew extends Pokemon {
    public Budew(String name, int level){
        super(name, level);
        setType(Type.GRASS,  Type.POISON);
        setStats(40, 30, 35, 50, 70, 55);
        ShadowBall shadowBall = new ShadowBall(80, 100);
        MegaDrain megaDrain = new MegaDrain(40, 100);
        super.setMove(shadowBall, megaDrain);

    }
}
