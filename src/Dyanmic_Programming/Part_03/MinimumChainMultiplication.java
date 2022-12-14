package Dyanmic_Programming.Part_03;

import java.util.Arrays;

public class MinimumChainMultiplication {

    public static int minOp(int[] a){
        int[][] dp = new int[a.length][a.length];
        for(int i = 0; i < a.length; i++){
            Arrays.fill(dp[i] , -1);
        }
        int ans = minDP(1,a.length - 1,dp,a);
        for(int i = 0; i < a.length; i++){
            System.out.println(Arrays.toString(dp[i]));
        }
        return ans;
    }


    public static int minDP(int i, int j, int[][] dp,int[] a){
        if(i == j) return 0;
        if(dp[i][j] != -1) return dp[i][j];
        dp[i][j] = Integer.MAX_VALUE;
        for(int k = i; k < j; k++){
            dp[i][j] = Math.min(dp[i][j], minDP(i,k,dp,a) + minDP(k+1,j,dp,a) + a[i-1] * a[k] * a[j]);
        }
        return dp[i][j];
    }

    public static int minDPTabular(int arr[]){
        int temp[][] = new int[arr.length][arr.length];
        int q = 0;
        for(int l=2; l < arr.length; l++){
            for(int row=0; row < arr.length - l; row++){
                int col = row + l;
                temp[row][col] = 1000000;
                for(int k=row+1; k < col; k++){
                    q = temp[row][k] + temp[k][col] + arr[row]*arr[k]*arr[col];
                    if(q < temp[row][col]){
                        temp[row][col] = q;
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(temp[i]));
        }
        return temp[0][arr.length - 1];
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 6, 4, 5};
        System.out.println(minOp(a));
        System.out.println("-----------------------------------------------------------");
        System.out.println(minDPTabular(a));
    }


}