package glab_303_2_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static glab_303_2_1.TernaryOperatorDemo.checkIfGreaterIntegerWithTernary;
import static org.junit.jupiter.api.Assertions.*;

class TernaryOperatorDemoTest {

    @DisplayName("Should return 100 is greater than -100")
    @Test
    void shouldReturnGreater() {
        assertEquals("100 is greater than -100",
                checkIfGreaterIntegerWithTernary(100, -100),
                "checkIfGreaterIntegerWithTernary method should return greater than");
    }

    @DisplayName("Should return -100 is less than -99")
    @Test
    void shouldReturnLesser() {
        assertEquals("-100 is less than -99",
                checkIfGreaterIntegerWithTernary(-100, -99),
                "checkIfGreaterIntegerWithTernary method should return lesser than");
    }

    @DisplayName("Should return 0 equals 0")
    @Test
    void shouldReturnEquals() {
        assertEquals("0 equals 0",
                checkIfGreaterIntegerWithTernary(0, 0),
                "checkIfGreaterIntegerWithTernary method should return equals");
    }

    @DisplayName("Should return Max Integer Value + 1 equals Min Integer Value")
    @Test
    void shouldReturnEqualsWhenMaxOverflowByOneAndMinimum() {
        assertEquals("-2147483648 equals -2147483648",
                checkIfGreaterIntegerWithTernary(Integer.MAX_VALUE + 1, Integer.MIN_VALUE),
                "checkIfGreaterIntegerWithTernary method should return equals");
    }

}