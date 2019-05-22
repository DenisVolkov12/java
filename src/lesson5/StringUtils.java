package lesson5;

public class StringUtils {
    public static String stringReverse(String text){
        return new StringBuilder(text).reverse().toString();

    }
    public static void printGlassFromText (String gl){
        char[] simbols = gl.toCharArray();
        for(char ch :simbols){
            if (ch == 'a' || ch == 'o' || ch == 'i' || ch == 'e'){
                System.out.println(ch);
            }
        }
    }
}
