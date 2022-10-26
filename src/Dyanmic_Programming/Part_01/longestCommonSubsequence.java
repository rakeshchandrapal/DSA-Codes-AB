package Dyanmic_Programming.Part_01;

import java.util.*;

public class longestCommonSubsequence {

    public static int lcs(String a , String b){
        int m = a.length();
        int n = b.length();
        int[][] dp = new int[m+1][n+1];
        for(int i = 0; i <= m; i++) Arrays.fill(dp[i],-1);

        int ans = lcs(a,b,m,n,dp);
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
        return ans;
    }

    public static int lcs(String a , String b,int m,int n,int[][] dp){
        if(m == 0 || n == 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];

        if(a.charAt(m-1) == b.charAt(n - 1)) return dp[m ][n]=lcs(a,b,m-1,n-1,dp) + 1;
        else return dp[m][n] = Math.max(lcs(a,b,m-1,n,dp),lcs(a,b,m,n-1,dp));
    }

    public static void main(String[] args) {
        String a = "ABCDTDGDGRVHYTHBRTBTRY";
        String b = "CDGHILKMNJHDNBJDGNREJ";
        System.out.println(lcs(a,b));
    }

}