package Heaps.Part02;

import java.util.*;

public class connectNRopes {

    public static void main(String[] args) {
        long [] a = {4,3,2,6};
        System.out.println(mincost(a,a.length));
    }

   static long mincost(long[] arr,int n)
    {
        PriorityQueue<Long> pq = new PriorityQueue<>();
        for(long em : arr) pq.offer(em);

        long ans = 0;

        while(pq.size() > 1)
        {
//            System.out.println(pq);

            long first = pq.poll();
            long second = pq.poll();

            long cost = first + second;
            ans+= cost;
            pq.offer(cost);
        }

        return ans;
    }

}