package lesson13;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> fridge = new HashMap<>();
        fridge.put("Яблоко", 3);
        fridge.put("Груша", 4);
        fridge.put("Апельсин", 6);

        for(String key:fridge.keySet()){
            System.out.println(key + " " +fridge.get(key));
        }

    }

}
