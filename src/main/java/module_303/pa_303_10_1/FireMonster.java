package pa_303_10_1;

public class FireMonster extends Monster{
    FireMonster(String name) {
        super(name);
    }

    String attack() {
        return atk + "fire!";
    }
}


