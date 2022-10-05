package GFG.Arrays.Daily;

import java.util.Arrays;

public class GFG_PossibleWays {


    public static void main(String[] args) {
        int []arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minJumps(arr));
    }


    static long numberOfPaths(int m, int n) {
        long[][] dp = new long[m+1][n+1];
        numberOfPaths5(m, n, dp);

//        for (int i = 0; i<m+1; i++){
//            System.out.println(Arrays.toString(dp[i]));
//        }
        return dp[m][n];
    }


    static int minJumps(int[] arr){
        // your code here
       int i = 0;
       int count = 0;
       while(i != arr.length)
       {
           if(i > arr.length ) return count ;
           int el = arr[i];
           count++;
           i += el;
       }
       return -1;
    }

    // Function to find equilibrium point in the array.
    public static int equilibriumPoint(long arr[], int n) {

        long totalSum = 0;
        long tempSum = 0;



        for(Long l:arr) {

            totalSum = l + totalSum;

        }



        for(int i=0;i<arr.length;i++) {

            if((totalSum - tempSum - arr[i]) == tempSum) {

                return i+1;

            }



            tempSum = tempSum + arr[i];

        }



        return -1;
    }
    static void numberOfPaths5(int m, int n, long[][] dp){
        if (dp[m][n] != 0){
            return;
        }
        if (m == 1 && n == 1) {
            dp[m][n] = 1;
            return;
        }
        if (m < 1) return ;
        if (n < 1) return ;
        numberOfPaths5(m-1, n, dp);
        numberOfPaths5(m, n-1, dp );
        dp[m][n] = (dp[m-1][n]%1000000007 + dp[m][n-1]%1000000007)%1000000007;
    }

}