
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class task32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = 0;
        int columns = 0;

        try {
            System.out.print("Введите количество строк: ");
            rows = scanner.nextInt();

            System.out.print("Введите количество столбцов: ");
            columns = scanner.nextInt();

            if (rows <= 0 || columns <= 0) {
                throw new IllegalArgumentException("Количество строк и столбцов должно быть положительным числом.");
            }

            List<List<Integer>> matrix = generateRandomMatrix(rows, columns);

            System.out.println("Сгенерированная матрица:");
            printMatrix(matrix);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static List<List<Integer>> generateRandomMatrix(int rows, int columns) {
        List<List<Integer>> matrix = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(random.nextInt(100));
            }
            matrix.add(row);
        }

        return matrix;
    }

    public static void printMatrix(List<List<Integer>> matrix) {
        for (List<Integer> row : matrix) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }
}
