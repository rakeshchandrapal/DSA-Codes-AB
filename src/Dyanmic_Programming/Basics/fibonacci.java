package Dyanmic_Programming.Basics;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {



    static int fib(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;
        dp[1] = 1;
        fibDP(n,dp);
        return dp[n];
    }

    static int fibDP(int n, int[] dp){
        if(dp[n] != -1) return dp[n];

        return dp[n] = fibDP(n-1,dp) + fibDP(n-2,dp);
    }

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number : ");
        n = sc.nextInt();
        System.out.println("The n'th Number is =  "+ fib(n));

    }

}