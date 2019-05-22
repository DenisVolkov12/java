package lesson7;

public class ChernovikMain {
    public static void main(String[] args) {
        Chernovik riuzaki = new Chernovik();
        Chernovik light = new Chernovik();
        riuzaki.setStrange("Сидит на кортах");
        light.setStrange("Мания величия");
        riuzaki.setIntellience(100);
        light.setIntellience(100);
        riuzaki.setFizicheskayaForma(50);
        light.setFizicheskayaForma(80);
        light.setName("Лайт");
        riuzaki.setName("Риузаки");
        light.printInfo();
        riuzaki.printInfo();
    }
}
