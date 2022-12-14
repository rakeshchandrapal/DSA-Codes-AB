package Dyanmic_Programming.Part_04;

import java.lang.reflect.Array;
import java.util.Arrays;

public class optimimalStrategyGame {

    public static int optimalStrategyGameDP(int []a){
        int  n = a.length;
        int[][] dp = new int[n][n];
        for(int[] x : dp) Arrays.fill(x,-1);
        int ans = optimalStrategyGameDP(a,0,n - 1,dp) ;
        for(int[] x : dp) System.out.println(Arrays.toString(x));;
        return ans;
    }
    public static int optimalStrategyGameDP(int []a,int i, int j,int[][] dp){
        if(i + 1 == j)return dp[i][j] = Math.max(a[i],a[j]);

        if(dp[i][j] != -1) return dp[i][j];
        int left = a[i]+Math.min(optimalStrategyGameDP(a,i+2,j,dp),optimalStrategyGameDP(a,i+1,j-1,dp));
        int right= a[j]+Math.min(optimalStrategyGameDP(a,i+1,j-1,dp),optimalStrategyGameDP(a,i,j-2,dp));
        return dp[i][j] = Math.max(left,right);
    }

    public static void main(String[] args) {
        int a[] = {1,10};
        System.out.println(optimalStrategyGameDP(a));
    }
}