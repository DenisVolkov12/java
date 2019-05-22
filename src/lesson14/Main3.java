package lesson14;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число:");
        String inputNum = scanner.nextLine();
        int num = 0;
        try {
            num = Integer.parseInt(inputNum);
        } catch (NumberFormatException e) {
            System.out.println("Неверный ввод!");
        } catch (Exception e) {
            System.out.println("!!!!!!!!!");
            System.out.println(num);
        }finally {
            System.out.println("DCT!!!!!!");
        }
    }
}
