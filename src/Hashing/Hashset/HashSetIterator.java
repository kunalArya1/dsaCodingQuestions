package Hashing.Hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetIterator {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        for (Integer ir: set) {
            System.out.println(ir);
        }


        //Another Way of Iteration on HashSet
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}
