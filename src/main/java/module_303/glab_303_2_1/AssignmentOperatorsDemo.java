package glab_303_2_1;

public class AssignmentOperatorsDemo {

    public static void main(String[] args) {
        int test1 = assignValues();
        int test2 = multipleAssignments();
    }

    public static int assignValues() {
        int j, k;
        j = 10;
        j = 5;
        k = j;
        System.out.printf("j is %d\n", j); // j is 5
        System.out.printf("k is %d\n", k); // k is 5
        return k;
    }

    public static int multipleAssignments() {
        int j, k;
        k = j = 10;
        System.out.printf("j is %d\n", j); // j is 10
        System.out.printf("k is %d\n", k); // k is 10
        return k;
    }
}




//    public static void main(String args[]) {
//        //   Assigning Primitive Values
//        int j, k;
//        j = 10; // j gets the value 10.
//        j = 5; // j gets the value 5. The previous value is overwritten.
//        k = j; // k gets the value 5.
//        System.out.println("j is : " + j); // j is : 5
//        System.out.println("k is : " + k); // k is : 5
//
//        //              Multiple Assignments
//        k = j = 10; // (k = (j = 10))
//        System.out.println("j is : " + j); // j is : 10
//        System.out.println("k is : " + k); // k is : 10
//    }



