package pa_303_2_1;

public class DoubleAddition extends NumberAddition<Double> {
    @Override
    protected boolean isValidInput() {
        return sc.hasNextDouble();
    }

    @Override
    protected Double inputNumber() {
        return sc.nextDouble();
    }

    @Override
    protected Double add(Double num1, Double num2) {
        return num1 + num2;
    }

    @Override
    protected String pushType() {
        return "a double";
    }

    @Override
    protected void printSum(Double sum) {
        System.out.println(sum);
    }
    public static void main(String[] args) {
        DoubleAddition doubleAddition = new DoubleAddition();
        doubleAddition.addNumbers();
        doubleAddition.closeScanner();
    }
}

//import java.util.Scanner;
//public class DoubleAddition {
//   public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // Declare and assign two integers.
//        // Get integers from the user on the command line.
//        // Make sure inputs are integers.
//        System.out.println("Enter two doubles to add together: ");
//        while (!sc.hasNextDouble()) {
//            System.out.println("Enter a double: ");
//            sc.next();
//        }
//        double num1 = sc.nextDouble();
//        while (!sc.hasNextDouble()) {
//            System.out.println("Enter a double: ");
//            sc.next();
//        }
//        double num2 = sc.nextDouble();
//        // Assign the sum to a variable.
//        double sum = num1 + num2;
//        // Print out the result.
//        System.out.println(sum);
//    }
//}
