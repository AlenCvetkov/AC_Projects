import java.util.Scanner;

public class AC_005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int players=3;
        int [][] tournament = new int[n][players];
        int count=0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < players; j++) {
                tournament[i][j]=sc.nextInt();

            }
        }
        for (int i = 0; i < n; i++) {
            int sum =0;
            for (int j = 0; j < players; j++) {

                sum+=tournament[i][j];
            }
            if(sum >=2){
                count++;
            }

        }
        System.out.println(count);
    }
}
