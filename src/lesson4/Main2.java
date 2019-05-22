package lesson4;

public class Main2 {
    public static void main(String[] args) {
        char[] abcd = {'a','b','c','d'};
        char[] qwer = {'q','w','e','r'};
        String text = "Are you ready to start studying of programming";

        String result = text.toLowerCase();

        for (int i = 0; i < abcd.length; i++){
            result = result.replace(abcd[i],qwer[i]);
        }
        System.out.println(result);

    }
}
