package mymoves.Meditite;

import ru.ifmo.se.pokemon.*;

public class WorkUp extends StatusMove {
    public WorkUp(double pow, double acc){

        super(Type.NORMAL, pow, acc);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        super.applySelfEffects(p);

        Effect a = new Effect().stat(Stat.ATTACK, 1);
        Effect b = new Effect().stat(Stat.SPECIAL_ATTACK, 1);
        p.addEffect(a);
        p.addEffect(b);
    }
    @Override
    protected String describe(){
        return "использует WorkUp" ;
    }
}
