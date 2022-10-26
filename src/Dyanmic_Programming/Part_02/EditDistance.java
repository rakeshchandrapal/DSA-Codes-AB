package Dyanmic_Programming.Part_02;

import java.util.Arrays;

public class EditDistance {

    public static void main(String[] args) {
        String s1 = "HORSE";
        String s2 = "ROSE";
        System.out.println( minimumOperation(s1,s2));

    }

    public static int minimumOperation(String s1,String s2){
        int m = s1.length(),n = s2.length();
        int[][] dp = new int[m + 1][n + 1];
        for(int i = 0; i<=m; i++){
            Arrays.fill(dp[i],-1);
        }
        return  minimumOperationDP(s1,s2,m,n,dp);
    }

    public static int  minimumOperationDP(String s1,String s2,int m, int n, int[][]dp){

        if(m == 0) return  dp[m][n] = n;
        if(n == 0) return  dp[m][n] = m;
        if(dp[m][n] != -1) return dp[m][n];

        if(s1.charAt(m - 1) == s2.charAt(n - 1))
        {
             return dp[m][n] =  minimumOperationDP(s1,s2,m -1,n - 1,dp);
        }
        else{
           return  dp[m][n] = Math.min(Math.min(  minimumOperationDP(s1,s2,m -1,n ,dp),
                   minimumOperationDP(s1,s2,m ,n - 1,dp)),  minimumOperationDP(s1,s2,m -1,n - 1,dp)) + 1;
        }

    }

}