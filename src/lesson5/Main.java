package lesson5;

public class Main {
    public static void main(String[] args) {

        String text = "qwerty";
        Student.printHello();
        int result = Student.squareArea(12);
        System.out.println(result);

        int result2 = Student.squareArea(16);
        System.out.println(result2);
        String perevorot = StringUtils.stringReverse("London is a capital of Great Britain");
        System.out.println(perevorot);
        StringUtils.printGlassFromText("swaswadaswd");
    }
}
