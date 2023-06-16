import java.util.Scanner;

public class task23_main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите вещественную часть комплексного числа: ");
        int real = scanner.nextInt();

        System.out.print("Введите мнимую часть комплексного числа: ");
        int imaginary = scanner.nextInt();

        task23 complex1 = new task23(real, imaginary);

        System.out.print("Введите вещественную часть второго комплексного числа: ");
        real = scanner.nextInt();

        System.out.print("Введите мнимую часть второго комплексного числа: ");
        imaginary = scanner.nextInt();

        task23 complex2 = new task23(real, imaginary);

        // Сложение комплексных чисел
        task23 sum = complex1.add(complex2);
        System.out.println("Сумма: " + sum);

        // Вычитание комплексных чисел
        task23 difference = complex1.subtract(complex2);
        System.out.println("Разность: " + difference);

        // Умножение комплексных чисел
        task23 product = complex1.multiply(complex2);
        System.out.println("Произведение: " + product);

        scanner.close();
    }
}
