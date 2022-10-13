package Heaps.Part02;

import java.util.*;

public class spiltArrayLargestSum {

    public static void main(String[] args) {
        int[] a = {1,4,2,3,7,2,4,5,6,3};
        int k = 3;
        System.out.println(spiltSubset(a,3));
    }
    public static int spiltSubset(int[]arr, int k)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i < k ; i++) pq.offer(0);

        Arrays.sort(arr);

        for(int i = arr.length - 1; i >= 0; i-- )
        {
            int cur = arr[i];
            int top = pq.poll();
            int toAdd = top + cur ;
            pq.offer(toAdd);
        }
        int max = -1;

        for(int em : pq) max = Math.max(em , max);
        return max;
    }
}