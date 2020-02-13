package kz.epam.example.queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExapmle {
    public static void main(String[] args) {
        Queue<String> firstQueue = new LinkedList<String>();
        firstQueue.offer("elderly Woman");
        firstQueue.offer("teenager");
        firstQueue.offer("a man");
        firstQueue.offer("a woman");
        while (firstQueue.size() > 0) {
            System.out.print(firstQueue.remove() + " ");
        }
    }
}
