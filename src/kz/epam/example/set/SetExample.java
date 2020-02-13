package kz.epam.example.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set <String> set = new HashSet<String>();
        set.add("Australia");
        set.add("Bali");
        set.add("USA");
        set.add("UAE");
        set.add("Kazakhstan");
        set.add("Japan");
        System.out.println(set);
        for (Object o : set) {
            System.out.println(o.toString());
        }
    }
}
