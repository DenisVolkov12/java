package lesson13;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int num = getNumber(scanner);
        System.out.println(num);
    }

    private static int getNumber(Scanner scanner){
        int number = 0;
        try{
            number = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.out.println("Введите еще раз!");
            return getNumber(scanner);
        }

        return number;

// Перегрузка метода: на один метод 2 действия(метода) с другими входящими параметрами;
    }
    private static int getNumber(Scanner scanner, int a){
        int number = 0;
        try{
            number = Integer.parseInt(scanner.nextLine());
        }catch (Exception e) {
            System.out.println("Введите еще раз!");
            return getNumber(scanner);
        }

        return number;

    }
}
