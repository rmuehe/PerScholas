package pa_303_2_1;

public class IntegerAddition extends NumberAddition<Integer> {
    @Override
    protected boolean isValidInput() {
        return sc.hasNextInt();
    }

    @Override
    protected Integer inputNumber() {
        return sc.nextInt();
    }
    @Override
    protected Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    protected String pushType() {
        return "an integer";
    }

    @Override
    protected void printSum(Integer sum) {
        System.out.println(sum);
    }

    public static void main(String[] args) {
        IntegerAddition integerAddition = new IntegerAddition();
        integerAddition.addNumbers();
        integerAddition.closeScanner();
    }
}

//import java.util.Scanner;
//public class IntegerAddition {
//   public static void main(String[] args) {
//       Scanner sc = new Scanner(System.in);
//       // Declare and assign two integers.
//       // Get integers from the user on the command line.
//       // Make sure inputs are integers.
//       System.out.println("Enter two integers to add together: ");
//       while (!sc.hasNextInt()) {
//           System.out.println("Enter an integer: ");
//           sc.next();
//       }
//       int num1 = sc.nextInt();
//       while (!sc.hasNextInt()) {
//           System.out.println("Enter an integer: ");
//           sc.next();
//       }
//       int num2 = sc.nextInt();
//        // Assign the sum to a variable.
//       int sum = num1 + num2;
//        // Print out the result.
//       System.out.println(sum);
//    }
//}
