import java.util.Scanner;

public class AC_003 {


    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            long sum = 0;
            int oddCount = 0;
            long minOdd = Long.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                sum += a[i];
                if (a[i] % 2 == 1) {
                    oddCount++;
                    minOdd = Math.min(minOdd, a[i]);
                }
            }

            if (oddCount == 0) {
                System.out.println(0);
            } else if (oddCount % 2 == 1) {
                System.out.println(sum);
            } else {
                System.out.println(sum - minOdd);
            }
        }
    }
}
