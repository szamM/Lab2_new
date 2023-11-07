package mymoves.Budew;

import ru.ifmo.se.pokemon.*;

public class MegaDrain extends SpecialMove {
    public MegaDrain(double pow, double acc){

        super(Type.GRASS, pow, acc);
    }

    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) v);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.HP, -20);
    }

    @Override
    protected String describe(){
        return "использует Mega Drain" ;
    }
}
