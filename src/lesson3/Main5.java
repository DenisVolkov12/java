package lesson3;

public class Main5 {
    public static void main(String[] args) {
        for (int i = 10; i <= 15; i++){
            System.out.println(i);
        }
        int i = 10;
        while(i <= 15){
            System.out.println(i);
            i++;
        }
        int j = 10;
        do{
            System.out.println(j);
            j++;
        }while (j < 5);
    }
}
// у "do while" сначала срабатывает тело, потом цикл, поэтому, в любом случаи сначала программа делает действие,
// потом проверяет.
