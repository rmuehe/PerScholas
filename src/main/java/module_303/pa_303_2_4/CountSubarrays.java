package pa_303_2_4;
import java.util.Arrays;
import java.util.List;

public class CountSubarrays {

    // #14 Subarray with Given Sum;
    public static long countNumberOfSubarrays(List<Integer> arr, int k) {
        int length = arr.size();
        long count = 0L;
        for(int i = 0; i < length; i++) {
//          if (arr.get(i) == k) count++;
            int tempSum = 0;
            for( int j = i; j < length; j++) {
                tempSum += arr.get(j);
                if(tempSum == k){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumberOfSubarrays(Arrays.asList(1,2,3,0), 3));
    }
}
