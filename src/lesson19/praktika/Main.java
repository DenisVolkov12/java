package lesson19.praktika;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CopyFileTaskImpl task1 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\Game_Of_Thrones_S08_720p_Гризли",
                "C:\\Users\\User\\Downloads\\Документация Кодабра\\GOT.S08E05.Novamedia.MegaPeer.(qqss44).avi");
        CopyFileTaskImpl task2 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\Game_Of_Thrones_S08_720p_Гризли\\Game_Of_Thrones_S08E01_720p_Гризли.mkv",
                "C:\\Users\\User\\Downloads\\Документация Кодабра\\Game_Of_Thrones_S08E01_720p_Гризли.mkv");
        CopyFileTaskImpl task3 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\Game_Of_Thrones_S08_720p_Гризли\\Game_Of_Thrones_S08E02_720p_Гризли.mkv",
                "C:\\Users\\User\\Downloads\\Документация Кодабра\\Game_Of_Thrones_S08E02_720p_Гризли.mkv");
        CopyFileTaskImpl task4 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\Карта преподавателей Кодабра\\Шумская Рита.pptx",
                "C:\\Users\\User\\Downloads\\Документация Кодабра\\Шумская Рита.pptx");
        CopyFileTaskImpl task5 = new CopyFileTaskImpl("C:\\Users\\User\\Downloads\\Курсы Кодабра\\Интенсивы Ю1.pdf",
                "C:\\Users\\User\\Downloads\\Документация Кодабра\\Интенсивы Ю1.pdf");

        FindFilesTaskImpl task6 = new FindFilesTaskImpl();
        task6.setDirectory("C:\\Users\\User");
        task6.setFileNameSearchString("720");
        task6.setPrintStream(System.out);

    }
}
