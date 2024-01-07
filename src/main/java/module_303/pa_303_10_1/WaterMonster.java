package pa_303_10_1;

public class WaterMonster extends Monster{
    WaterMonster(String name) {
        super(name);
    }

    String attack() {
        return atk + "water!";
    }
}