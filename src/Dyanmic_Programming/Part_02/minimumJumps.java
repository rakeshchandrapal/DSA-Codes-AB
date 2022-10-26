package Dyanmic_Programming.Part_02;

import java.util.Arrays;

public class minimumJumps {

    public static void main(String[] args) {
        int[]a = {1,1,1,1,7,1,11,1};
        System.out.println(minimumJump(a));
    }
    public static int  minimumJumpsDP(int a[], int i, int[] dp){
        if(i >= a.length) return 0;
        if(dp[i] != -1) return dp[i];

        if(a[i] == 0) return Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for(int j = 1; j <= a[i];j++){
            min = Math.min(minimumJumpsDP(a,i+j,dp) ,min) + 1;
        }
        return dp[i] =  min;
    }

    public static int  minimumJump(int a[]){
        int[] dp = new int[a.length + 1];
        Arrays.fill(dp,-1);
       return minimumJumpsDP(a,0,dp);

    }

}