package lesson2;

public class HomeWork {
    public static void main(String[] args) {
        for (int i = 500; i <= 1000; i++)
            if (i % 7 == 0 && i % 19 == 0) {
                System.out.println(i);
            }



        for (int i = 1; i <= 20; i++ ) {
            System.out.println(i);
        }
        for (int i =1; i <= 30; i++)
            if (i != 21 &&i != 22 && i != 23 && i != 24) {
                System.out.println(i);
            }
        for (int i = 100; i>=90; i--) {
            System.out.println(i);
        }
        double a = 10000;
        double b = 0.07;
        int year = 20;
        for (double i = 0; i < 20; i++) {
            a = a += (a * b);
            System.out.println(a);

        }

    }
}