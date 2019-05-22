package lesson7;

public class Main {
    public static void main(String[] args) {
        int a = 9;
        Phone meizu = new Phone();
        Phone nokia = new Phone();
        Phone xiaomi = new Phone();


        nokia.setBattary(1500);
        nokia.setName("Nokia");
        nokia.setColour("Голубой");

        xiaomi.setColour("Красный");
        xiaomi.setDiagonal(19);
        xiaomi.setName("Note10");
        xiaomi.setName("Xiaomi");

        meizu.setBattary(1500);
        meizu.setDiagonal(20);
        meizu.setColour("Черный");
        meizu.setBattary(2500);
        meizu.setName("Meizu");
        meizu.printInfo();
        nokia.printInfo();
        xiaomi.printInfo();
    }
}
