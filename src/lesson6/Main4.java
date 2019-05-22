package lesson6;

public class Main4 {
    public static void main(String[] args) {
        int [][] piramida = new int [5][9];
        int count = 1;
        int indexCol = 4;
        for(int i = 0; i < piramida.length; i++){
            for(int j = 0; j < count; j++){
                System.out.print(piramida[i][j]);

            }
            count = count + 2;

        }

    }
}
