package PriorityQueues;

import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(7);
        pq.add(10);
        pq.add(4);
        pq.add(3);
        pq.add(20);
        pq.add(15);
        System.out.println(pq);
    }
}
