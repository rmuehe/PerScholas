package glab_303_2_1;
import glab_303_2_1.AssignmentOperatorsDemo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssignmentOperatorsDemoTest {

    @Test
    public void testAssignValues() {
        AssignmentOperatorsDemo demo = new AssignmentOperatorsDemo();
        assertEquals(5, demo.assignValues(), "assignValues method should return 5");
    }

    @Test
    public void testMultipleAssignments() {
        AssignmentOperatorsDemo demo = new AssignmentOperatorsDemo();
        assertEquals(10, demo.multipleAssignments(), "multipleAssignments method should return 10");
    }
}