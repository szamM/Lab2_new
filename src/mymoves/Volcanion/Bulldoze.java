package mymoves.Volcanion;


import ru.ifmo.se.pokemon.*;

public class Bulldoze extends PhysicalMove {
    public Bulldoze(double pow, double acc){
        super(Type.GROUND, pow, acc);
    }
    @Override
    public void applyOppEffects(Pokemon p){
        super.applyOppEffects(p);
        Effect e = new Effect().stat(Stat.SPEED, -1);
        p.addEffect(e);

    }
    @Override
    protected void applyOppDamage(Pokemon p, double v) {
        p.setMod(Stat.HP, (int) v);
    }

    @Override
    protected String describe(){
        return "использует Bulldoze" ;
    }
}
