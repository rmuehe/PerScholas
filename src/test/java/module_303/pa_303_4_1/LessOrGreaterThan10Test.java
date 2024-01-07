package module_303.pa_303_4_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static module_303.pa_303_4_1.LessOrGreaterThan10.greaterThan10;
import static module_303.pa_303_4_1.LessOrGreaterThan10.lessOrGreaterThan10;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LessOrGreaterThan10Test {

    @DisplayName("Should return empty string")
    @Test
    void shouldReturnEmptyString() {
        assertEquals("", greaterThan10(7), "greaterThan10 method should return empty string");
    }

    @DisplayName("Should return Greater than 10")
    @Test
    void shouldReturnGreaterThan10() {
        assertEquals("Greater than 10", greaterThan10(15), "greaterThan10 method should return Greater Than 10");
    }

    @DisplayName("Should return Less than 10")
    @Test
    void shouldReturnLessThan10() {
        assertEquals("Less than 10", lessOrGreaterThan10(7), "greaterThan10 method should return Less Than 10");
    }

}