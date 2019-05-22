package lesson17;

public class PrintNumber2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Третий поток начал работу!");

        for (int i = -10000; i > -10050; i--){
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Третий поток закончил работу!");
    }
}
