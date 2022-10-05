package GFG.Arrays.Arrays;

import java.util.*;

public class subaArray {

    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4,5,6,7,8,9,10};
        int n = arr.length;
        int s = 15;
        System.out.println(subarraySum(arr,n,s));
    }




    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
            int start = 0,cursum = arr[0],i;
            ArrayList<Integer> ans = new ArrayList<>();
            for(i = 1; i <= n ;i++)
            {
                while(cursum > s && start < i - 1)
                {
                    cursum -= arr[start];
                    start++;
                }
                if(cursum == s)
                {
                    ans.add(start);
                    ans.add(i - 1);
                    return ans;
                }
                if(i < n) cursum += arr[i];
            }
            ans.add(-1);
            return ans;
    }

    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s)
    {
        // Your code here
        int start = 0;
        int end = 1;
        ArrayList<Integer> ans = new ArrayList<>();

        int cursum = arr[0];

        while(start < end)
        {
            if(cursum < s && end < n)
            {
                cursum += arr[end];
                end++;
            }
            if(cursum > s && start < n-1)
            {
                cursum -= arr[start];
                start++;
            }
            if(cursum == s)
            {
                start = start + 1;
                ans.add(start);
                ans.add(end );
                return ans;
            }
        }
        ans.add(-1);
        return ans;
    }
}