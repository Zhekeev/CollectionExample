package kz.epam.example.queue;

import java.util.PriorityQueue;

public class PriorityQueueWithComparable {
    public static void main(String[] args) {
        PriorityQueue<String> secondQueue = new PriorityQueue<String>();
        secondQueue.offer("elderly Woman");
        secondQueue.offer("teenager");
        secondQueue.offer("a man");
        secondQueue.offer("a woman");
        System.out.println("\nPriority queue using Comparable:");
        while (secondQueue.size() > 0) {
            System.out.print(secondQueue.remove() + " ");
        }
    }
}
