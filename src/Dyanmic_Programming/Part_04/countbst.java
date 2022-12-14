package Dyanmic_Programming.Part_04;

import java.util.Arrays;

public class countbst {
    public static int countBST(int n){
        int[] dp = new int[n + 1];
        dp[0] = 1;

        for(int i = 1; i <= n; i++){
        int ans = 0;
            for(int j = 0; j< i ; j++){
                ans += dp[j] * dp[i - j -1];
            }
            dp[i] = ans;
        }
        System.out.println(Arrays.toString(dp));
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(countBST(n));
    }
}