package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class Main5 {
    public static void main(String[] args) {
        LinkedList<Integer> a = new LinkedList<>();
        a.add(9);
        a.add(9);
        a.add(2);
        a.add(3);
        a.add(5);


        HashSet<Integer> b = new HashSet<>();
        b.add(19);
        b.add(9);
        b.add(1);
        b.add(8);
        b.add(5);

        CollectionUtilImpl utils = new CollectionUtilImpl();
        Collection<Integer> difference = utils.difference(a,b);
        System.out.println(difference);

    }
}
