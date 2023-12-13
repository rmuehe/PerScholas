package glab_303_3_2;
import java.util.Scanner;
// Reading a String from the Console
public class CompoundInterestCalc {

    public static void print(String str) {
        System.out.println(str);
    }

    public static double getDouble(Scanner sc, String msg) {
        System.out.print(msg);
        while (!sc.hasNextDouble()) {
            print("Enter a number");
            sc.next();
            print(msg);
        }
        return sc.nextDouble();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        print("Compound Interest Calculator");
        double principal = getDouble(sc, "Enter the Principal: ");
        double interest = getDouble(sc, "Enter the Interest Rate: ");
        double years = getDouble(sc, "Enter the Years: ");
        double timesPerYear = getDouble(sc, "How many times per year? ");

        int yearsInt = (int)years;
        int timesPerYearInt = (int)timesPerYear;

        double compoundInterest = principal *
                Math.pow((1 + (interest / 100) / timesPerYearInt), timesPerYearInt * yearsInt);
        System.out.printf("Compound Interest after " + yearsInt + " years: %.2f\n", compoundInterest);
        sc.close();
    }
}
