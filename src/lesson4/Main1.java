package lesson4;

public class Main1 {
    public static void main(String[] args) {
        String text1 = "text to print";

        String text2 = "new day";

        String text3 = text2.replace('w', 'W');
        System.out.println(text3);

        String text1Upper = text1.toUpperCase();
        System.out.println(text1Upper);


        char ch = text2.charAt(0);
        System.out.println(ch);


        String text4 = text1 + " " + text2;
        System.out.println(text4);

        String emailInput = "natalia.shulga@gmail.com ";
        String emailInDataBase = "natalia.shulga@gmail.com";
        String result = emailInput.trim();
        if(result.equals(emailInDataBase)){
            System.out.println("Вход в систему выполнен");
        }else{
            System.out.println("Введен неверный email");
        }

    }
}
