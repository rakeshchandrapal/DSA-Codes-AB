package GFG.Arrays.Daily;

import java.util.ArrayList;

public class IPL2021 {

    public static void main(String[] args) {
        int [] a= {1 ,2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;
        System.out.println(max_of_subarrays(a,a.length,k));
    }

    static ArrayList<Integer> max_of_subarrays(int[] arr, int n, int k) {
        // Your code here
        int i = 0,j = k - 1;
        int max = -1;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int r = 0; r <= j;r++)
        {
            max = Math.max(max, arr[r]);
        }
        ans.add(max);
        for(int r = j; r <  arr.length; r++)
        {
            max = Math.max(max,arr[r]);
            if(r - k - 1 >= 0 && max == arr[r - k - 1])
            {
                for(int in = r - k; in < i; in++)
                {
                    max = Math.max(max, arr[r]);
                }
            }
            ans.add(max);

        }
        return ans;
    }
    static ArrayList<Integer> max_of_subarrays1(int[] arr, int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();

        int i = 0, j = k - 1;


        while (i < arr.length && j < arr.length)
        {
          int result = max(arr,i,j);
          ans.add(result);
          i++;
          j++;
        }
        return ans;
    }

    public static int max(int []a, int s,int e)
    {
        int max = -1;
        for(int i = s; i <= e;i++)
        {
            max = Math.max(max, a[i]);
        }
        return max;
    }
}