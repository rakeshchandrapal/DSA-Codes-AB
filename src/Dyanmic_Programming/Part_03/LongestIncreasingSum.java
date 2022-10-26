package Dyanmic_Programming.Part_03;

import java.util.Arrays;

public class LongestIncreasingSum {

    public static int longestIncreasingSum(int a[]){

        int [] dp = new int[a.length];
        dp[0] = a[0];

        for(int i = 1; i < a.length; i++){
            dp[i] = a[i];
            for(int j = 0; j < i; j++){
                if(a[i] > a[j]) dp[i ] = Math.max(dp[i], dp[j] + a[i]);
            }
        }
        System.out.println(Arrays.toString(dp));
        int max = -1;
        for(int e : dp) if(e > max) max = e;
        return max;
    }

    public static void main(String[] args) {
        int [] a = {1,20,4,30,5,6,7};
        System.out.println(longestIncreasingSum(a));
    }
}