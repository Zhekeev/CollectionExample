package kz.epam.example.queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueWithComparator {
    public static void main(String[] args) {
        PriorityQueue<String> thirdQueue = new PriorityQueue<String>(4, Collections.reverseOrder());
        thirdQueue.offer("elderly Woman");
        thirdQueue.offer("teenager");
        thirdQueue.offer("a man");
        thirdQueue.offer("a woman");
        System.out.println("Priority queue using Comparator:");
        while (thirdQueue.size() > 0) {
            System.out.print(thirdQueue.remove() + " ");
        }
    }
}
