package pa_303_2_4;


public class Prime {
         //   #12 Prime or Not?


        public static int isPrime(long n) {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) return i;
            }
            return 1;
        }
}

