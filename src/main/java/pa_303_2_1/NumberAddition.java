package pa_303_2_1;

import java.util.Scanner;
public abstract class NumberAddition<Type extends Number> {
    String inputStr = "Enter " + pushType() + ": ";
    protected Scanner sc = new Scanner(System.in);

    public void addNumbers() {
        Type number1 = getNumber(inputStr);
        Type number2 = getNumber(inputStr);

        Type sum = add(number1, number2);
        System.out.println(sum);
    }

    protected Type getNumber(String str) {
        System.out.println(str);
        while (!isValidInput()) {
            System.out.println(inputStr);
            sc.next();
        }
        return inputNumber();
    }

    protected abstract boolean isValidInput();

    protected abstract Type inputNumber();

    protected abstract Type add(Type num1, Type num2);

    protected abstract String pushType();

    protected abstract void printSum(Type sum);

    public void closeScanner() {
        sc.close();
    }
}
