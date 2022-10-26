package Dyanmic_Programming.Basics;

import java.util.Arrays;

public class rodCutting {

    public static void main(String[] args) {
        int n = 8;
        int[] price = {1, 5, 8, 9, 10, 17, 17, 20};
        System.out.println(cutRod(price ,n));
    }
    public static  int cutRod(int price[], int n) {
        int[] dp = new int[n + 1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        cutRodDP(price,n,dp);
        System.out.println(Arrays.toString(dp));
        return dp[n];

    }
    public static  int cutRodDP(int[] price , int n,int[] dp){
        if(n < 0 ) return Integer.MIN_VALUE;
       if(dp[n] != -1) return dp[n];
       int max = Integer.MIN_VALUE;
       for(int i = 0; i < price.length; i++){
           max = Math.max(max,price[i]+cutRodDP(price,n - i - 1,dp));
       }

       return dp[n] = max;
    }
}