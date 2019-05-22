package lesson6;

public class Main {
    public static void main(String[] args) {
        Main.firstSimbol("First");
    }

    public static void firstSimbol(String text){
        String textToLower = text.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        int[] indexes = new int[textToLower.length()];

        for(int i = 0; i < textToLower.length();i++){
            char current = textToLower.charAt(i);
            int index = alphabet.indexOf(current);
            indexes[i] = index;
        }
        int min = indexes[0];
        for(int i = 0; i < indexes.length; i++){
            if(indexes[i]< min  && indexes[i] != -1){
                min = indexes[i];
            }
        }

        System.out.println(alphabet.charAt(min));
    }
}
