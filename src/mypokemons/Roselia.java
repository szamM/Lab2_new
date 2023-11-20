package mypokemons;

import mymoves.Budew.*;

public class Roselia extends Budew {
    public Roselia(String name, int level){
        super(name, level);
        setStats(50, 60, 45, 100, 80, 65);
        SleepPowder sleepPowder = new SleepPowder(0, 75);
        super.addMove(sleepPowder);

    }
}
