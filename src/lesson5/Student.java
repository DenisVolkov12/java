package lesson5;

public class Student {


    // модификатор доступа
    // статичность (частная или государственная собственность)
    // возвращаемый тип
    // название метода
    // входящие параметры
    public static void printHello(){
        System.out.println("Hello!");
    }

    public static int squareArea(int storona) {
        return storona * storona;
    }
     public static void perimetrTreugolnika(int a, int b, int c ){
         System.out.println("Периметр треугольника = "  + a + b + c);

        }

}
