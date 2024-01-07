package glab_303_2_1;
import glab_303_2_1.ArithmeticOperatorsDemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class ArithmeticOperatorsDemoTest {
    @Test
    public void testAddItems() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(15, demo.addItems(), "addItem method should return 15");
    }

    @Test
    public void testSubtractItems() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(5, demo.subtractItems(), "subtractItem method should return 5");
    }

    @Test
    public void testMultiplyItems() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(50, demo.multiplyItems(), "multiplyItem method should result in 50");
    }

    @Test
    public void testDivideItems() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(2, demo.divideItems(), "divideItem method should return 2");
    }

    @Test
    public void testModuloItems() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(0, demo.moduloItems(), "moduloItems method should return 0");
    }

    @Test
    public void testPostfixIncrement() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(10, demo.postfixIncrement(), "postfixIncrement method should return 11");
    }

    @Test
    public void testPrefixIncrement() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(6, demo.prefixIncrement(), "prefixIncrement should return 6");
    }

    @Test
    public void testNegateItem() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(-10, demo.negateItem(), "negateItem method should result in -10");
    }

    @Test
    public void testTooBigInt() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(Integer.MIN_VALUE & -2147483648, demo.tooBigInt(), "tooBigInt method should return -2147483648");

    }

    @Test
    public void testTooSmallInt() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals( Integer.MAX_VALUE & 2147483647, demo.tooSmallInt(), "tooSmallInt method should return 2147483647");
        assertTrue(demo.tooSmallInt() > 0, "tooSmallInt method should be greater than 0");
    }

    @Test
    public void testUndefinedDouble() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        double infinite = demo.undefinedDouble();
        Double infinity = new Double(infinite);
        assertEquals(Double.POSITIVE_INFINITY, infinite, "undefinedDouble method returns a double that is equal to Double.POSITIVE_INFINITY");
        assertTrue(infinity.isInfinite(), "undefinedDouble method returns a double that is infinite when cast as a Double");
        assertNotEquals(infinity, Double.NEGATIVE_INFINITY, "undefinedDouble method returns a double that is not negative infinity when cast as a Double");
    }

    @Test
    public void testUndefinedNegativeDouble() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        Float negInfinity = new Float(demo.undefinedNegativeFloat());
        assertTrue(negInfinity == Double.NEGATIVE_INFINITY, "undefinedNegativeFloat method returns a float that equals Double.NEGATIVE_INFINITY when cast as a Float");
        assertEquals("-Infinity", negInfinity.toString(), "undefinedNegativeFloat method returns a float that is \"-Infinity\" when represented as a String after cast as a Double ");
    }

    @Test
    public void testZeroDividedByZero() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        double nan = demo.zeroDividedByZero();
        boolean isNan = Double.isNaN(nan);
        assertEquals(Double.NaN, nan, "zeroDividedByZero method returns a double that is equal to Double.NaN");
        assertEquals(Float.NaN, nan, "zeroDividedByZero method returns a double that is equal to Float.NaN");
        assertTrue(isNan, "zeroDividedByZero method returns a double that is NaN when cast as a Double");
    }

    @Test
    public void testTruncatedIntegerDivision() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(1, demo.truncatedIntegerDivision(), "truncatedIntegerDivision method returns 1");
    }

    @Test
    public void testFloatDivide() {
        ArithmeticOperatorsDemo demo = new ArithmeticOperatorsDemo();
        assertEquals(1.5, demo.floatDivide(), "floatDivide method returns a float equal to 1.5");
        assertEquals(1.5f, demo.floatDivide(), "floatDivide method returns 1.5f");
    }

























}
