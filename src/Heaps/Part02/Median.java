package Heaps.Part02;

import java.util.*;

public class Median {

    class MedianFinder {

        PriorityQueue<Integer> minheap,maxheap;
        boolean even = true;
        public MedianFinder() {
            minheap = new PriorityQueue<>();
            maxheap = new PriorityQueue<>(Collections.reverseOrder());
        }

        public void addNum(int num) {
            if(even)
            {
                minheap.offer(num);
                maxheap.offer(minheap.poll());
            }
            else {
                maxheap.offer(num);
                minheap.offer(maxheap.poll());
            }
            even = !even;
        }

        public double findMedian() {

            if(even) {
                return (double)(minheap.peek() + maxheap.peek() )/ 2.0;
            }
            else {
                return (double)maxheap.peek();
            }

        }
    }

}