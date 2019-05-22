package lesson8;

public class Main {
    public static void main(String[] args) {
        Tovar blender = new Tovar();
        blender.setNameTovara("Philips Avent Блендер-пароварка 2 в 1");
        blender.setFixPrice(12200);
        blender.setIdTovara(7324820);
        blender.setDiscount(19);
        blender.setAvailable(true);



        Characteristic obem = new Characteristic();
        obem.setKey("Объем, л.");
        obem.setValue("0.8");

        Characteristic colour = new Characteristic();
        colour.setKey("Цвет");
        colour.setValue("Белый");

        blender.addCharacteristic(obem);;
        blender.addCharacteristic(colour);

        Comments comment1 = new Comments();
        comment1.setComment("эта модель продаётся сейчас за 6499 в других онлайн магазинах. Жаль что поздно увидела.");
        comment1.setDateComment("13 Февраля 2019");
        comment1.setLike(7);
        comment1.setDislike(4);
        comment1.setPlus("Все быстро и просто");
        comment1.setMinus("Громко работает блендер");
        comment1.setByInOzon(true);
        comment1.setAge(35);
        comment1.setNameClient("Ковалевич Гузель Евгеньевна");
        comment1.setRating(4);

        blender.addComments(comment1);
        blender.printInfo();
    }
}
