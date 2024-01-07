package pa_303_10_1;

public class StoneMonster extends Monster{
    StoneMonster(String name) {
        super(name);
    }

    String attack() {
        return atk + "stones!";
    }
}