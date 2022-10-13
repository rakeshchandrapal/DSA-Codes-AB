package Heaps.Part01;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLArgestElement {
    public static void main(String[] args) {
        int[]a = {1,4,9,2,5,6,7};
        int k = 3;
        System.out.println(findKthLargest(a,k));
    }

    static int findKthLargest(int[] a, int k)
    {
        Queue<Integer> pq = new PriorityQueue<>();

        for(int i = 0; i < k; i++)
        {
            pq.offer(a[i]);
        }

        for(int i = k; i < a.length; i++)
        {
            if(pq.peek() < a[i])
            {
                pq.poll();
                pq.offer(a[i]);
            }
        }
        return pq.peek();
    }


}