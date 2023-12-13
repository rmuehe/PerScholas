package pa_303_2_1;

public class IntegerDivision {
    public static void main(String[] args) {
        IntegerAddition integerAddition = new IntegerAddition();

        // Get two integers from the command line.
        int num1 = integerAddition.getNumber(integerAddition.inputStr);
        int num2 = integerAddition.getNumber(integerAddition.inputStr);

        // Divide the larger number by the smaller number.
        int lg = num1 > num2? num1 : num2;
        int sm = num1 == lg? num2 : num1;
        int dividend = lg / sm;
        System.out.println("The larger divided by the smaller integer is: \n" + dividend);
        // If the larger integer is not evenly divisible by the smaller integer then
        // there will be no fractional part left over (stored as int or not).


        // Change the larger number to a decimal.
        double lgDouble = lg;
        // Need to store the result in a double in order to show the fractional part.
        double dividendDouble = lgDouble/sm;
        System.out.println("Changing the larger number to a double then dividing is: \n" + dividendDouble);
    }
}
