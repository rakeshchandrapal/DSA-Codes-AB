package Dyanmic_Programming.Basics;

import java.util.Arrays;

public class coinChange {
        static int minCoins(int n, int[] a){
            int[] dp = new int[n + 1];
            Arrays.fill(dp,-1);
            dp[0] = 0;
            minCoins(n,a,dp);
            System.out.println(Arrays.toString(dp));
            return dp[n];
        }

        static int minCoins(int n, int[] a, int[] dp){
            if(n < 0) return Integer.MAX_VALUE;
            if(dp[n] != -1) return dp[n];
            int min = Integer.MAX_VALUE;

            for(int i = 0; i < a.length; i++){
                min = Math.min(min,minCoins(n - a[i],a,dp));
            }
            return dp[n] = min + 1;
        }

    public static void main(String[] args) {
        int a[] = { 8,6,1};
        int n = 16;
        System.out.println(minCoins(n,a));
    }

}