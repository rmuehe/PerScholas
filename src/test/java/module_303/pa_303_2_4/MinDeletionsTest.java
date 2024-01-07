package pa_303_2_4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static pa_303_2_4.MinDeletions.*;

class MinDeletionsTest {

    @Test
    void shouldReturnFactorial() {
        assertEquals(5+4+3+2+1, sumUp(5));
    }

    @Test
    void shouldEqualABA_AB_A_BA_A_A() {
        assertArrayEquals(new String[]{"ABA", "AB", "A", "BA", "B", "A"}, getAllSubstrings("ABA"));
    }

    @Test
    void shouldReturn0() {
        assertEquals(0, getMinDeletions("abcde"));
    }
    @Test
    void shouldReturn5() {
        assertEquals(5, getMinDeletions("abcdeabcde"));
    }
}