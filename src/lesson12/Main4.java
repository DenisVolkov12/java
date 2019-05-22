package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main4 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("swaswa");
        list.add("swasasa");
        list.add("dsfdsff");
        list.add("gfgtttt");
        list.add("dsafghhh");
        list.add("hknhknhkhnkhnkh");

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o1);
            }
        });

        for(String s:list){
            System.out.println(s);
        }
    }
}
