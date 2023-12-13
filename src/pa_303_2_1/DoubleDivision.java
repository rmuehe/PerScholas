package pa_303_2_1;

public class DoubleDivision {
    public static void main(String[] args) {
        DoubleAddition doubleAddition = new DoubleAddition();

        // Get two doubles from the command line.
        double num1 = doubleAddition.getNumber(doubleAddition.inputStr);
        double num2 = doubleAddition.getNumber(doubleAddition.inputStr);

        // Divide the larger number by the smaller number.
        double lg = num1 > num2? num1 : num2;
        double sm = num1 == lg? num2 : num1;
        double dividend = lg / sm;
        System.out.println("The larger divided by the smaller double is: \n" + dividend);

        // Cast the dividend to an integer.
        int dividendInt = (int)dividend;
        System.out.println("Casting the dividend as an int is: \n" + dividendInt);
    }
}

