package lesson5;

public class JavaMetods {
    public static void PrintLittle (int a, int b, int c){
        if (a < b || a <c){
            System.out.println(a);
        }else if (b < a || b < c){
            System.out.println(b);
        }else if (c < a || c < b){
            System.out.println(c);
        }else;
    }
    public static void PrintLenghFromText (String Length){
            System.out.println(Length.length());
    }

    public static void PrintBig (int a, int b, int c) {
        if (a > b || a > c) {
            System.out.println(a);
        } else if (b > a || b > c) {
            System.out.println(b);
        } else if (c > a || c > b) {
            System.out.println(c);
        } else ;

    }
    public static void withNewLine(String text) {
        String[] word = text.split(" ");
        for (String subString : word) {
            System.out.println(subString);
        }
    }

}
