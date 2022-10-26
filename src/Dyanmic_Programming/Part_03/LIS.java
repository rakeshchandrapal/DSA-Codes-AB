package Dyanmic_Programming.Part_03;

import java.util.Arrays;

public class LIS {

    static int lis(int a[]){
        int [] dp = new int[a.length];
        dp[0] = 0;

        for(int i = 1; i < a.length; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
               if(a[i] > a[j]) dp[i ] = Math.max(dp[i], dp[j] + 1);
            }
        }
        System.out.println(Arrays.toString(dp));
        int max = -1;
        for(int e : dp) if(e > max) max = e;
        return max;
    }

    public static void main(String[] args) {
        int[] a= {11,9,8,7};
        System.out.println(lis(a));
    }
}