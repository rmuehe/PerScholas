package pa_303_10_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestMonsterTest {
    Monster m1 = new FireMonster("r2u2");
    Monster m2 = new WaterMonster("u2r2");
    Monster m3 = new StoneMonster("r2r2");

    @Test
    void shouldReturnFire() {
        assertEquals("Attack with fire!", m1.attack());
    }

    @Test
    void shouldReturnWater() {
        assertEquals("Attack with water!", m2.attack());
    }

    @Test
    void shouldReturnStones() {
        assertEquals("Attack with stones!", m3.attack());
    }

    @Test
    void shouldReturnStonesNew() {
        // m1 dies, generates a new instance and re-assign to m1.
        m1 = new StoneMonster("a2b2");  // upcast
        assertEquals("Attack with stones!", m1.attack());
    }

    @Test
    void shouldReturnGarbage() {
        Monster m4 = new Monster("u2u2");
        assertEquals("!^_&^$@+%$* I don't know how to attack!", m4.attack());
    }

}