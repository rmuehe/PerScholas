package glab_303_2_1;


public class TernaryOperatorDemo {

    public static String checkIfGreaterIntegerWithTernary(int checkInt1, int checkInt2) {
        String greater = checkInt1 + " is greater than " + checkInt2;
        String lesser = checkInt1 + " is less than " + checkInt2;
        String equals = checkInt1 + " equals " + checkInt2;
        return checkInt1 > checkInt2
                ? greater
                : checkInt1 < checkInt2
                ? lesser
                : equals;
    }

    public static void main(String[] args) {
//        int age = 18;
//        String result = age < 100 ?
//                "Less than 100" : "Greater than 100";
//        System.out.println(result); //Less than 100
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(checkIfGreaterIntegerWithTernary(18,100));
    }
}


