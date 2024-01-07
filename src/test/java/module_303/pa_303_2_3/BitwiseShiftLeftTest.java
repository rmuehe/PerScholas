package pa_303_2_3;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;
import static pa_303_2_3.BitwiseShiftLeft.*;

class BitwiseShiftLeftTest {
    @DisplayName("Decimal number should convert to binary number")
    @Test
    void shouldReturn1010() {
        assertEquals("1010", integerToBinaryString(10), "integerToBinaryString method should return 1010");
    }

    @DisplayName("Decimal number should convert to binary number")
    @Test
    void shouldReturnNegative1010() {
        assertEquals("-1010", integerToBinaryString(-10), "integerToBinaryString method should return -1010");
    }

    @DisplayName("Should double positive integers")
    @ParameterizedTest
    @ValueSource(ints = {1, 5, 25, 72, 94, 1000, 100000})
    public void shouldDoubleThePositiveIntegers(int input) {
        assertEquals(input*2, shiftLeftInteger(input), "shiftLeftInteger should double the positive integers");
    }

    @DisplayName("Should double the negative integer")
    @ParameterizedTest
    @ValueSource(ints = {-1, -5, -25, -72, -94, -1000, -100000})
    public void shouldDoubleTheNegativeIntegers(int input) {
        assertEquals(input*2, shiftLeftInteger(input), "shiftLeftInteger should double the negative integers");
    }


    @DisplayName("Should double the integers")
    @ParameterizedTest
    @ValueSource(ints = { 5, 25, -5})
    public void shouldDoubleIntegers(int input) {
        assertEquals(String.valueOf((input * 2)), printShiftLeftPrediction(input).substring(printShiftLeftPrediction(input).indexOf("=")+2),
                "printShiftLeftMethod should double the input integers");
    }

    @DisplayName("Should overflow")
    @ParameterizedTest
    @ValueSource(ints = { Integer.MAX_VALUE, Integer.MIN_VALUE + 1})
    public void shouldOverflow(int input) {
        assertEquals(String.valueOf((input * 2)), printShiftLeftPrediction(input).substring(printShiftLeftPrediction(input).indexOf("=")+2),
                "printShiftLeftMethod should overflow at the limit of 32-bit signed integer");
    }
}