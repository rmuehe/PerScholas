package glab_303_2_1;

import glab_303_2_1.RelationalOperatorsDemo;
import org.junit.jupiter.api.Test;
import static glab_303_2_1.RelationalOperatorsDemo.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import java.math.BigDecimal;

public class RelationalOperatorsDemoTest {
    glab_303_2_1.RelationalOperatorsDemo demo = new RelationalOperatorsDemo(
            10,5,
            "variable1", "variable2", "variable3",
            50, 100, 50);

    RelationalOperatorsDemo d = demo;

    @ParameterizedTest
    @ValueSource(doubles = {0, -1, 5000000000000000000.0000})
    public void testIsLong(double input) {
        assertTrue(isLong(input), "isLong method should return true when input is 0, -1, 5000000000000000000.0000");
        // assertFalse(isLong(0.5), "isLong method should return false when input is 0.5");
    }

    @ParameterizedTest
    @ValueSource(doubles = {0.5, -1.2134, 5000000000000000000000.00000000123})
    public void testIsLong2(double input) {
        assertFalse(isLong(input), "isLong method should return false when input is 0.5, -1.2134, 5000000000000000000000.00000000123");
    }

    @ParameterizedTest
    @ValueSource(longs = {0, -1, 150_500_000_000_000L})
    public void testFormatLong(long input) {
        assertEquals(Long.toString(input), formatLong(input), "formatLong method returns a long converted to a string");
    }

    @ParameterizedTest
    @ValueSource(doubles = {1.555505555000, Double.POSITIVE_INFINITY, Double.NaN })
    public void testFormatDouble(double input) {
        assertEquals(String.valueOf(input), formatDouble(input), "formatDouble method returns a double converted to a string");
    }

    @ParameterizedTest
    @ValueSource(doubles = {-1.0, 50000.000000})
    public void testFormatDouble2(double input) {
        String s = Double.toString(input);
        s = s.contains(".") ? s.replaceAll("0*$","").replaceAll("\\.$","") : s;
        assertEquals(s, formatDouble(input), "formatDouble method returns a formatted string with no trailing zeros");
    }

    @ParameterizedTest
    @ValueSource(doubles = {50000000001230000.0000012300000, 0.000000000001230000100002, Double.MAX_VALUE, Double.MIN_VALUE})
    public void testFormatDouble3(double input) {
        Double num = input;
        String s = new BigDecimal(num.toString()).toPlainString();
        s = s.contains(".") ? s.replaceAll("0*$","").replaceAll("\\.$","") : s;
        assertFalse(s.contains("E"), "formatDouble method does not return a string containing \"E\"");
    }

    @Test
    public void testStrArray() {
        assertArrayEquals(new String[] {String.valueOf(demo.x), String.valueOf(demo.y)},
                strArray(demo.x, demo.y),
                "strArray method returns two strings in an array");
    }

    @Test
    public void testFormattedPrint() {
        assertEquals("10 != 5 : true", formattedPrint(d.x, d.y,"!=", true), "formattedPrint method returns a string");
    }

    @Test
    void greaterThan() {
    }

    @Test
    void lessThan() {
    }

    @Test
    void greaterThanOrEqual() {
    }

    @Test
    void lesserThanOrEqual() {
    }

    @Test
    void testEquals() {
    }

    @Test
    void notEquals() {
    }

    @Test
    void variableNameIsNumber() {
    }

    @Test
    void namedVariablesAreEqual() {
    }

}
