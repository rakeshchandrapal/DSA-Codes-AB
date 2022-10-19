package GFG.Arrays.Arrays;


import java.util.*;

public class reverseArrayGropup {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here

        if(n == 1) return 1;
        long sum = 0;
        for(long i : arr) sum += i;

        for(int i = n - 1; i >= 0; i--)
        {
            sum -= arr[i];
            if(sum == 0) return i;


        }
        return -1;
    }

    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        a.add(3);
//        a.add(4);
//        a.add(5);
//        a.add(6);
//        a.add(7);
//        a.add(8);


//        System.out.println(a);
//        reverseInGroups(a,a.size(),3);
//        System.out.println(a);

        long[]a = {1L, 3L,5L, 2L,2L};
        System.out.println(equilibriumPoint(a,a.length));
    }

        static  void reverseInGroups(ArrayList<Integer> arr, int n, int k)
        {
            for(int i=0;i<n;i+=k)
            {
                int s = i;
                int e = Math.min(i+k-1,n-1);
                while(s<e)
                {
                    Collections.swap(arr,e,s);
                    e--;
                    s++;
                }
            }
        }



}