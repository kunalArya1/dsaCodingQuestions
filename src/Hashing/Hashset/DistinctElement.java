package Hashing.Hashset;

import java.util.Arrays;
import java.util.HashSet;

public class DistinctElement {
    public static void main(String[] args) {
        int [] arr = {2,3,4,1,2,4,5,3,10,6,5,7,8};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set.size());


        // improved version
//        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(arr // arr should ba a rraylist));
    }
}
