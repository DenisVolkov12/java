package lesson12;

import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {

        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(12);
        numbers.add(1277);
        numbers.add(-12);
        numbers.add(122);
        numbers.add(1222);

        for(int n: numbers){
            System.out.println(n);
        }
    }
}
