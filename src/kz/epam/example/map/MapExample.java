package kz.epam.example.map;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("Johnny Depp", 55);
        hashMap.put("John Wick", 53);
        hashMap.put("Brad Pitt", 56);
        hashMap.put("Leonadro DiCaprio", 45);
        System.out.println("Display entries in HashMap");
        System.out.println(hashMap);

        Map<String, Integer> treeMap = new TreeMap<String, Integer>(hashMap);
        System.out.println("Display entries in ascending order of key");
        System.out.println(treeMap);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>(16, 0.75f, true);
        linkedHashMap.put("Johnny Depp", 55);
        linkedHashMap.put("John Wick", 53);
        linkedHashMap.put("Brad Pitt", 56);
        linkedHashMap.put("Leonadro DiCaprio", 45);
        System.out.println("The age for " + "Brad Pitt is " + linkedHashMap.get("Brad Pitt").intValue());
        System.out.println(linkedHashMap);
    }
}
