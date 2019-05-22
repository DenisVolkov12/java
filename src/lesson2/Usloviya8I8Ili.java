package lesson2;

public class Usloviya8I8Ili {
    public static void main(String[] args) {
        int a = 4;
        int b = 4;
        int c = 4;
        if (a == b && b == c) {
            System.out.println("Это равносторонний треугольник");
        } else if (a == b || b == c || c == a) {
            System.out.println("Это равнобедренный треугольник");
        } else if (a != b && b != c && c != a) {
            System.out.println("Это разносторонний треугольник");
        }
    }
}
