package Daily_leet_code.Daily;

import java.util.*;

public class L188_Stock {

    public static void main(String[] args) {
//        int a[] = {7,1,5,3,6,4};
//        /System.out.println(maxProfit(a));
        int []a = {1,2,3,5};
        System.out.println(MissingNumber(a,a.length));
    }

   static  int MissingNumber(int arr[], int n) {
        // Your Code Here
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i<= n + 1; i++) set.add(i);

        for(int i = 0; i < n; i++) if(set.contains(arr[i])) set.remove(arr[i]);
        int ans = 0;
        for(Integer e : set ) ans = e;
        return ans;
    }
    public int maxProfit(int k, int[] prices) {
        return 0;
    }

    public static int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minSoFar = prices[0];

        for(int i = 0; i < prices.length; i++)
        {
            minSoFar = Math.min(minSoFar,prices[i]);
            int profit = prices[i] - minSoFar;
            maxProfit = Math.max(profit , maxProfit);
        }
        return maxProfit;
    }
}