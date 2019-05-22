package lesson6;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Start");
        for(int dni = 0; dni < 366; dni++){
            for(int hour = 0; hour < 25; hour++){
                for(int minutes = 0; minutes < 61; minutes++){
                    for (int seconds = 0; seconds < 61; seconds++){
                        System.out.printf("От старта прошло: %d дня %d часаб %d минутб %d секунд", dni, hour, minutes, seconds);
                        System.out.println();
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }

                }
            }
        }
        System.out.println("End");
    }
}
