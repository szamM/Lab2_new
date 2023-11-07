package mymoves.Meditite;

import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(double pow, double acc){
        super(Type.GRASS, pow, acc);
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) v);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() < 0.1) {
            Effect e = new Effect().stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);

        }

    }
    @Override
    protected String describe(){
        return "использует Energy Ball" ;
    }
}
