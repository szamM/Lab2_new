package mymoves.Meditite;

import ru.ifmo.se.pokemon.*;

public class BulkUp extends StatusMove {
    public BulkUp(double pow, double acc){

        super(Type.FIGHTING, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect a = new Effect().stat(Stat.ATTACK, 1);
        Effect b = new Effect().stat(Stat.DEFENSE, 1);
        p.addEffect(a);
        p.addEffect(b);
    }
    @Override
    protected String describe(){
        return "использует BulkUp" ;
    }
}
