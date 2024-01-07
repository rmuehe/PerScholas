package pa_303_2_4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LeastAbsValue {

    // #13 Minimum Difference Sum
    private static Comparator<? super Integer> c;
    /*
     * Complete the 'minDiff' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int minDiff(List<Integer> arr) {
        arr.sort(c);
        int length = arr.size();
        int math = 0;
        for (int i = 0; i < length - 1; i++) {
            System.out.println(arr.get(i));
            System.out.println(arr.get(i+1));
            System.out.println("");
            math += Math.abs(arr.get(i) - arr.get(i+1)) ;
        }

        return math;
    }

    public static void main(String[] args) {
        System.out.println(minDiff(Arrays.asList(5, 5, 1, 3, 7, 3)));
    }
}
