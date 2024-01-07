package module_303.pa_303_4_1;

public class OutOfRangeOutside10_20 extends LessThan10 {

    static String outOfRangeOutside10_20(int intToCheck) {
        return lessThan10(intToCheck).equals("Less than 10") || intToCheck > 20
            ? "Out of range"
            : "In range";
    }

    public static void main(String[] args) {
        System.out.println(outOfRangeOutside10_20(15)); // "In range"
        System.out.println(outOfRangeOutside10_20(5)); // "Out of Range"
    }
}
