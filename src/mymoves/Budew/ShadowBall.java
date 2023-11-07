package mymoves.Budew;

import ru.ifmo.se.pokemon.*;

public class ShadowBall extends SpecialMove {
    public ShadowBall(double pow, double acc){

        super(Type.GHOST, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() < 0.2) {
            Effect e = new Effect().turns(-1).stat(Stat.SPECIAL_DEFENSE, -1);
            p.addEffect(e);
            System.out.println(p.toString() + " looses 1 special defense");
        }

    }
    @Override
    protected String describe(){
        return "использует Shadow Ball" ;
    }
}
