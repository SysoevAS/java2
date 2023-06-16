import java.lang.Math;

// Класс, описывающий треугольник
class Triangle {
    protected double side1;
    protected double side2;
    protected double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public double getArea() {
        // Используем формулу Герона для вычисления площади треугольника
        double p = getPerimeter() / 2; // Полупериметр
        return Math.sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}

// Класс-наследник, определяющий прямоугольный треугольник
class RightTriangle extends Triangle {
    public RightTriangle(double side1, double side2) {
        // В конструкторе прямоугольного треугольника задаем длины двух катетов
        super(side1, side2, Math.sqrt(side1 * side1 + side2 * side2));
    }
}

// Пример использования классов
public class task14 {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Периметр треугольника: " + triangle.getPerimeter());
        System.out.println("Площадь треугольника: " + triangle.getArea());

        RightTriangle rightTriangle = new RightTriangle(3, 4);
        System.out.println("Периметр прямоугольного треугольника: " + rightTriangle.getPerimeter());
        System.out.println("Площадь прямоугольного треугольника: " + rightTriangle.getArea());
    }
}
