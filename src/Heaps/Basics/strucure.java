package Heaps.Basics;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.PriorityQueue;

public class strucure {
    public static void main(String[] args) throws Exception {

//        MinHeap h = new MinHeap(5);
//        h.insert(5);
//        h.insert(4);
//        h.insert(3);
//        h.insert(2);
//        h.insert(1);
//        h.print();

        int [] a = {0,2,9,4,7,1,6,8};
        MinHeap minheap = new MinHeap(a);
        minheap.print();
        minheap.heapSort();
        System.out.println(Arrays.toString(a));
        PriorityQueue <Integer> ans = new PriorityQueue<>();
    }


}