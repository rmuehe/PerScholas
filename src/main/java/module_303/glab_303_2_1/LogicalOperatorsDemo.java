package glab_303_2_1;


public class LogicalOperatorsDemo {

    public static boolean x = true;
    public static boolean y = false;

    public static boolean and(boolean x, boolean y) {
        return x & y;
    }

    public static boolean doubleAnd(boolean x, boolean y) {
        return x && y;
    }

    public static boolean or(boolean x, boolean y) {
        return x | y;
    }

    public static boolean doubleOr(boolean x, boolean y) {
        return x || y;
    }

    public static boolean carrot(boolean x, boolean y) {
        return x ^ y;
    }

    public static boolean not(boolean x) {
        return !x;
    }

    public static String p(boolean exp, String operator) {
        String s = "x " + operator + " y : " + exp;
        System.out.println(s);
        return s;
    }

    public static void main(String[] args) {

        p(and(x,y), "&"); // x & y : false
        p(doubleAnd(x,y), "&&"); // x && y : false
        p(or(x,y), "|"); // x | y : true
        p(doubleOr(x,y), "||"); // x || y : true
        p(carrot(x,y), "^"); // x ^ y : true
        System.out.println("!x : " + (!x)); // !x : false
    }
}


