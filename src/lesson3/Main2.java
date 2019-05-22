package lesson3;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = new int[10];

        int chetNum = 2;

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = chetNum;
            chetNum = chetNum + 2;
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        int[] cifry = {8, 4, 12, 45, 23, 12};


        for (int i = cifry.length - 1; i >= 0; i--) {
            System.out.println(cifry[i]);
        }

    }
}
