package mypokemons;

import mymoves.Meditite.*;
import ru.ifmo.se.pokemon.Type;

public class Medicham extends Meditite {
    public Medicham(String name, int level){
        super(name, level);
        setType(Type.FIGHTING,  Type.PSYCHIC);
        setStats(60, 60, 75, 60, 75, 80);
        EnergyBall energyBall = new EnergyBall(90, 100);
        super.addMove(energyBall);
    }
}
