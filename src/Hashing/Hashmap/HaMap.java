
package Hashing.Hashmap;

import java.util.HashMap;
import java.util.Map;

public class HaMap {
    public static void main(String[] args) {
        HashMap<String ,String> m = new HashMap<>();

        // add data
        m.put("Name" ,"Kunal Arya");
        m.put("Nickname" ,"RajKumar");
        m.put("father's name " ,"Pannalal Prasad");


        // traversing the map
//        for( Map.Entry<String,String> e : m.entrySet()){
//            System.out.println(e.getKey() + " - " + e.getValue());
//        }

        // traversing through forEach
//        m.forEach((key,value) -> System.out.println(key + " - " + value));


        // all methods
        System.out.println(m.containsKey("Name"));
        System.out.println(m.containsValue("Kunal Arya"));
        System.out.println(m.get("Name"));
        System.out.println(m.size());
        System.out.println(m.remove("Name"));
        System.out.println(m.size());
        System.out.println(m.isEmpty());


    }
}
