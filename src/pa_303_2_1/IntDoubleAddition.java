package pa_303_2_1;

public class IntDoubleAddition {
    public static void main(String[] args) {
        IntegerAddition integerAddition = new IntegerAddition();
        DoubleAddition doubleAddition = new DoubleAddition();


        int inputInt = integerAddition.getNumber(integerAddition.inputStr);
        double inputDouble = doubleAddition.getNumber(doubleAddition.inputStr);

        double sum = inputInt + inputDouble;
        System.out.println(sum);
    }
}
