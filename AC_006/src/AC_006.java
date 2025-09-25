import java.util.Arrays;
import java.util.Scanner;

public class AC_006 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] speeds = new int[n];
        for (int i = 0; i < n; i++) {
            speeds[i] = scanner.nextInt();
        }

        // Sort in ascending order
        Arrays.sort(speeds);

        // k-th largest from the end = index n-k
        System.out.println(speeds[n - k]);

        scanner.close();
    }
}
