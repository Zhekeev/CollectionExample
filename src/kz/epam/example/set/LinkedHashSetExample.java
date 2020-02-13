package kz.epam.example.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<String>();
        set.add("Astana");
        set.add("Karaganda");
        set.add("Shymkent");
        set.add("Almaty");
        set.add("Atyrau");
        set.add("Temirtau");
        System.out.println(set);
        for (Object o: set) {
            System.out.println(o.toString()+" ");
        }
    }
}
