package Hashing.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIterator {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();

        map.put("india",150);
        map.put("china",100);
        map.put("USA" , 50);
        map.put("isreal",10);
        map.put("Nepal",1);

        //Using EntrySet()
        for (Map.Entry<String,Integer> e: map.entrySet()) {
            System.out.println(e.getKey() + "  " + e.getValue());
        }

        // Using KeySet();

        for (String  key: map.keySet()) {
            System.out.println(key);
        }

        for (Integer value : map.values()){
            System.out.println(value);
        }
        // Using ForEach Loop
        map.forEach((k,v) -> {
            System.out.println("Key=" +k+ " ,Value=" +v);
        });
    }
}
