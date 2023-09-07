package Hashing.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class hashset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        // size of hashset
        System.out.println(set.size());

        // Check whether the given value is there or not
        System.out.println(set.contains(20));


        // Removing the value
        System.out.println(set.remove(30));

        // Check whether the hashset is empty or not
        System.out.println(set.isEmpty());
        // traversing through using forEach loop
        for (Integer i : set){
            System.out.println(i + " ");
        }

        // traversing through iterator
        Iterator<Integer> i = set.iterator();;

        while (i.hasNext()){
            System.out.println(i.next() + " ");
        }
    }
}
