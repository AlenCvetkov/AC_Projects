import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

public class AC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int m = scanner.nextInt();
        int n = scanner.nextInt();


        int r = scanner.nextInt();
        int k = scanner.nextInt();

        int[][] matrix = new int[m][n];
        int minValue = Integer.MAX_VALUE;


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i < r && j < k) {
                    matrix[i][j] = minValue;
                }
            }
        }


        try (FileWriter writer = new FileWriter("matrica.txt")) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    writer.write(String.valueOf(matrix[i][j]));
                    if (j < n - 1) {
                        writer.write(" ");
                    }
                }
                writer.write(System.lineSeparator());
            }
        } catch (IOException e) {
            System.out.println("Грешка" + e.getMessage());
        }

        scanner.close();
    }
}