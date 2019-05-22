package lesson15;

import lesson14.CustomException;
import lesson14.StringUtilsImpl;
import org.apache.log4j.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Massage");
        StringUtilsImpl utils = new StringUtilsImpl();

        try {
            double[] result = utils.findNumbers("12.3 jkjfl 16.7 skawhsk");
            for (double d : result){
                System.out.println(d);
            }
        }catch (CustomException e){
            e.printStackTrace();
        };
    }
}
