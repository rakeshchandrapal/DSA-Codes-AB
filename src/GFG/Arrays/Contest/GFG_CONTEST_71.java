package GFG.Arrays.Contest;

import java.util.*;
import java.util.HashMap;

public class GFG_CONTEST_71 {

    public static boolean makePalindrome(int n, String[] arr) {
        // code here
        StringBuilder ans= new StringBuilder("");
        for(int i = 0; i < n; i++)
        {
            ans.append(arr[i]);
        }

        int[] count = new int[256];
        Arrays.fill(count,0);
        for (int i = 0; i < ans.length(); i++)
            count[(int)(ans.charAt(i))]++;

        int odd = 0;
        for (int i = 0; i < 256; i++) {
            if ((count[i] & 1) == 1)
                odd++;


            if (odd > 1)
                return false;
        }

        // Return true if odd count is 0 or 1,
        return true;

    }
    public long[] smallerSum(int n,int arr[])
    {
        long[] ans = new long[n];
        int []temp = new int[n];

        System.arraycopy(arr, 0, temp, 0, n);
        Arrays.sort(temp);

        for(int i = 0; i < n; i++) {
            int key = arr[i];
            int index = findIndex(temp,key);
            long sum = findSum(temp,0,index);
            ans[i] = sum;
        }
       return ans;
    }

    public long findSum(int [] arr, int s, int e)
    {
        long sum = 0;
        for(int  i = s; i <= e; i++ )
        {
            sum += arr[i];
        }
        return sum;
    }
    public int findIndex(int []arr,int key)
    {
        int l = 0,r = arr.length - 1;
        int mid ;
        while(l < r) {
            mid = (l + r)/2;
            if(arr[mid] == key) return key;
            else if (key < arr[mid] ) l = mid+1;
            else r = mid - 1;
        }
        return -1;
    }

}