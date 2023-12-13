package pa_303_2_1;

public class CommandLineDivision {
    private static final String INT_REGEX = "-?\\d+"; // Regular Expression for integers.

    // Divide by integers than by an integer cast as double.
    private static void divideAndPrint(int x, int y) {
        double q = y / x;
        System.out.printf("Integer division: %d / %d = %f\n", y, x, q);
        q = (double)y / x;
        System.out.printf("Double division: %d / %d = %f", y, x, q);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 6;

        // Use command line arguments, if available
        if (args.length >= 2 && args[0].matches(INT_REGEX) && args[1].matches(INT_REGEX)) {
            y = Integer.parseInt(args[0]);
            x = Integer.parseInt(args[1]);
        }

        divideAndPrint(x, y);
    }
}
