import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class task33 {
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

            List<List<Integer>> collection = generateRandomCollection(rows, columns);

            System.out.println("Сгенерированная коллекция:");
            printCollection(collection);

            int max = collection.get(0).get(0);
            int min = collection.get(0).get(0);
            int maxRow = 0;
            int maxColumn = 0;
            int minRow = 0;
            int minColumn = 0;

            for (int i = 0; i < rows; i++) {
                List<Integer> row = collection.get(i);
                for (int j = 0; j < columns; j++) {
                    int value = row.get(j);
                    if (value > max) {
                        max = value;
                        maxRow = i;
                        maxColumn = j;
                    }
                    if (value < min) {
                        min = value;
                        minRow = i;
                        minColumn = j;
                    }
                }
            }

            System.out.println("Максимальное значение: " + max + " (Индекс: [" + maxRow + "][" + maxColumn + "])");
            System.out.println("Минимальное значение: " + min + " (Индекс: [" + minRow + "][" + minColumn + "])");
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static List<List<Integer>> generateRandomCollection(int rows, int columns) {
        List<List<Integer>> collection = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(random.nextInt(100));
            }
            collection.add(row);
        }

        return collection;
    }

    public static void printCollection(List<List<Integer>> collection) {
        for (List<Integer> row : collection) {
            for (Integer element : row) {
                System.out.print(element + "\t");
            }
            System.out.println();
        }
    }

}
