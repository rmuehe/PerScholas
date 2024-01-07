package pa_303_2_4;

import java.util.Comparator;
import java.util.List;

public class MaxDouble {
    // Double on Match #10

    private static Comparator<? super Long> c;

    public static long doubleSize(List<Long> arr, long b) {
        arr.sort(c);
        for(long number : arr) {
            if (number == b) {
                b *= 2;
            }
        }
    return b;
    }
}
