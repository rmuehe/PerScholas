package pa_303_2_4;

// #11 Closed Paths
public class ClosedPath {
    // 0,4,6,9 have closed paths of 1
    // 8 has a closed path of 2
    // for any int, break it down into digits
    // and add together each closed path
    public static int closedPaths(int number) {

        String numStr = String.valueOf(number);
        char[] charArr = numStr.toCharArray();
        int math = 0;
        int length = charArr.length;
        for (int i = 0; i < length; i++) {
            switch(charArr[i]) {
                case '0', '4', '6', '9':
                    math++;
                    continue;
                case '8':
                    math += 2;
            }
        }
        return math;
    }

    public static void main(String[] args) {
        System.out.println(closedPaths(649578));
        System.out.println(closedPaths(630));
        System.out.println(closedPaths(1288));


    }
}
