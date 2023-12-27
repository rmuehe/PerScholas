package glab_303_2_1;

import org.junit.jupiter.api.Test;


import static glab_303_2_1.LogicalOperatorsDemo.*;
import static org.junit.jupiter.api.Assertions.*;

class LogicalOperatorsDemoTest {

    @Test
    void andBothFalse() {
        assertFalse(and(false, false));
    }

    @Test
    void andOneFalse() {
        assertFalse(and(false, true));
    }

    @Test
    void andBothTrue() {
        assertTrue(and(true, true));
    }

    @Test
    void doubleAndBothFalse() {
        assertFalse(doubleAnd(false, false));
    }

    @Test
    void doubleAndOneFalse() {
        assertFalse(doubleAnd(false, true));
    }

    @Test
    void doubleAndBothTrue() {
        assertTrue(doubleAnd(true, true));
    }

    @Test
    void orBothFalse() {
        assertFalse(or(false, false));
    }

    @Test
    void orOneFalse() {
        assertTrue(or(false, true));
    }

    @Test
    void orBothTrue() {
        assertTrue(or(true, true));
    }

    @Test
    void doubleOrBothFalse() {
        assertFalse(doubleOr(false, false));
    }

    @Test
    void doubleOrOneFalse() {
        assertTrue(doubleOr(false, true));
    }

    @Test
    void doubleOrBothTrue() {
        assertTrue(doubleOr(true, true));
    }

    @Test
    void XORTrueFalse() {
        assertTrue(carrot(true, false), "carrot method returns true when true and false");
    }

    @Test
    void XORFalseTrue() {
        assertTrue(carrot(false, true), "carrot method returns true when true and false");
    }

    @Test
    void XORTrueTrue() {
        assertFalse(carrot(true, true), "carrot method returns false when both true");
    }

    @Test
    void XORFalseFalse() {
        assertFalse(carrot(false, false), "carrot method returns false when both false");
    }

    @Test
    void notFalse() {
        assertTrue(not(false));
    }

    @Test
    void notTrue() {
        assertFalse(not(true));
    }

    @Test
    void pAnd() {
        assertEquals("x & y = false", p(and(true, false), "&"));
    }

    @Test
    void mainMethod() {
        LogicalOperatorsDemo demo = new LogicalOperatorsDemo();
        assertTrue(demo.x);
    }

}