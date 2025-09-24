import java.util.Scanner;

public class AC_003 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int watermelon = scanner.nextInt();

       if(watermelon % 2 == 0){
           System.out.println("YES!");
       }else{
           System.out.println("NO!");
       }
    }
}
