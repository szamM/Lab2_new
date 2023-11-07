package mymoves.Volcanion;


import ru.ifmo.se.pokemon.*;

public class Flamethrower extends SpecialMove {
    public Flamethrower(double pow, double acc){

        super(Type.FIRE, pow, acc);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        super.applyOppEffects(p);
        if (Math.random() < 0.1) {
            Effect.burn(p);
        }
    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) v);
    }

    @Override
    protected String describe(){
        return "использует Flamethrower" ;
    }
}
