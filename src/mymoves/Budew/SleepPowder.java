package mymoves.Budew;

import ru.ifmo.se.pokemon.*;

public class SleepPowder extends SpecialMove {
    public SleepPowder(double pow, double acc){

        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect.sleep(p);

    }
    @Override
    protected String describe(){
        return "использует Sleep Powder" ;
    }
}
