package lesson19;

public class Main {
    public static void main(String[] args) {
        FilecopyWithChannel copyUtils1 = new FilecopyWithChannel();
        FileCopyWithJava7 copyUtils2 = new FileCopyWithJava7();

        try {
            copyUtils1.copyFile("C:\\Users\\User\\Documents\\15 ПРОСТЫХ МЕТОДИК СКОРОЧТЕНИЯ.docx","C:\\Users\\User\\Documents\\androidDRaa.log");
        } catch (FileCopyFailedException e) {
            e.printStackTrace();
        }
    }
}
