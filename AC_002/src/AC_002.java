import java.util.Scanner;

public class AC_002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.nextLine();
        }

        String longestPalindromeWithSpecial = "";
        for (String s : strings) {

            boolean isPalindrome = true;
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) {
                    isPalindrome = false;
                    break;
                }
                left++;
                right--;
            }


            boolean hasSpecial = false;
            for (char c : s.toCharArray()) {
                if (!Character.isLetterOrDigit(c)) {
                    hasSpecial = true;
                    break;
                }
            }


            if (isPalindrome && hasSpecial) {
                if (s.length() > longestPalindromeWithSpecial.length()) {
                    longestPalindromeWithSpecial = s;
                }
            }
        }

        if (longestPalindromeWithSpecial.isEmpty()) {
            System.out.println("Nema!");
        } else {
            System.out.println(longestPalindromeWithSpecial);
        }
    }
}