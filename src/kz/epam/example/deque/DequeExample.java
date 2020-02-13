package kz.epam.example.deque;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        System.out.println("Deque:");
        System.out.println();
        Deque <String> deque = new LinkedList<String>();
        deque.offer("elderly Woman");
        deque.offer("teenager");
        deque.addFirst("a man");
        deque.offer("a woman");
        while (deque.size()>0){
            System.out.println(deque.remove() + " ");
        }
    }
}
