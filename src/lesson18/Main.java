package lesson18;

import java.io.File;
import java.io.FileFilter;

public class Main {
    public static void main(String[] args) {
        File dirFrom = new File("C:\\Users\\User\\Downloads\\Курсы Java");
        File[] filesFromDir = dirFrom.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }

                if (pathname.getAbsolutePath().endsWith("java") || pathname.getAbsolutePath().endsWith("jpg") || pathname.getAbsolutePath().endsWith("txt")) {
                    return true;
                }
                return false;
            }
        });

        for (File file : filesFromDir) {
            System.out.println(file.getAbsolutePath());

        }
    }
}

