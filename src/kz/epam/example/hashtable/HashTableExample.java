package kz.epam.example.hashtable;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable <String , String> hashtable = new Hashtable<String, String>();
        hashtable.put("1" , "One");
        hashtable.put("2" , "Two");
        hashtable.put("3" , "Three");
        hashtable.put("4" , "Four");
        Collection collection = hashtable.values();
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        collection.remove("One");
        Enumeration enumeration = hashtable.elements();
        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
