package Heaps.Part01;

import java.util.*;

public class mainpq {
    public static void main(String[] args) {
//        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        pq.offer(5);
        pq.offer(45);
        pq.offer(12);
        pq.offer(2);
        pq.offer(3);
        pq.add(412);
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}