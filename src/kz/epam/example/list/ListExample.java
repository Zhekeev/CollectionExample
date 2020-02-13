package kz.epam.example.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListExample {
    public static void main(String[] args) {
        List <Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(0,10);
        list.add(4,25);
        System.out.println("A list of integers in the array list:");
        System.out.println(list);

        LinkedList  linkedList = new LinkedList(list);
        linkedList.add(1,"red");
        linkedList.removeLast();
        linkedList.addFirst("green");
        System.out.println("Display the linked list forward:");
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next() + " ");
        }
        System.out.println();
        System.out.println("Display the linked list backward:");
        listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous()+" ");
        }
    }
}
