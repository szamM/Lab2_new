import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;


public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Budew budew = new Budew("Арман", 1);
        Medicham medicham = new Medicham("Арсений", 1);
        Meditite meditite = new Meditite("Антон", 1);
        Roselia roselia = new Roselia("Агафий", 1);
        Roserade roserade = new Roserade("Авдотий", 1);
        Volcanion volcanion = new Volcanion("Арнольлд", 1);

        b.addAlly(budew);
        b.addAlly(roserade);
        b.addAlly(meditite);
        b.addFoe(roselia);
        b.addFoe(medicham);
        b.addFoe(volcanion);
        b.go();
    }
}

