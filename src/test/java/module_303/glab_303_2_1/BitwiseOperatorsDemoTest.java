package glab_303_2_1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static glab_303_2_1.BitwiseOperatorsDemo.*;
import static org.junit.jupiter.api.Assertions.*;

class BitwiseOperatorsDemoTest {

    static class bitsLengthTests {
        @Nested
        @DisplayName("When provided a valid integer")
        class happyBitsLengthTests {
            @Test
            @DisplayName("bitsLength method should return 6 given 63")
            void shouldProvideBitsOfInteger() {
                assertEquals(6, bitsLength(63), "bitsLength method should return 6");
            }

            @Test
            @DisplayName("bitsLength method should return -6 given -63")
            void shouldProvideBitsOfIntegerForNegatives() {
                assertEquals(-6, bitsLength(-63), "bitsLength method should return -6");
            }

            @Test
            @DisplayName("bitsLength method should return 1 given 0")
            void shouldProvideBitsOfIntegerForZero() {
                assertEquals(1, bitsLength(0), "bitsLength method should return 1");
            }

            @Test
            @DisplayName("bitsLength method should return 1 given -1")
            void shouldProvideBitsOfIntegerForOne() {
                assertEquals(-1, bitsLength(-1), "bitsLength method should return 1");
            }
        }
    }
    @Test
    @DisplayName("replaceCharAt method should return a string with a char at the given location")
    void shouldReplaceCharInString() {
        assertEquals("Nice", replaceCharAt("Noce",1,'i'), "replaceCharAt method should return Nice");
    }

    @Test
    @DisplayName("intToBinary should return a binary representation of an int stored as an int")
    void shouldConvertIntegerToBinaryInteger() {
        assertEquals(1010, intToBinary(10), "intToBinary method should return 1010");
    }

//    @ParameterizedTest
//    @ValueSource
//    void should

}