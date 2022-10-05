package Daily_leet_code.Daily;

import java.util.Arrays;

public class L985_sumOfEven {
    public static void main(String[] args) {

    int [] a = {1,2,3,4};
    int [][] q = {{1,0},{-3,1},{-4,0},{2,3}};
        System.out.println(Arrays.toString(sumEvenAfterQueries(a,q)));

    }
    public static int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int sum = 0;
        for(int em : nums)
        {
            if(em % 2 == 0)sum += em;
        }
        int []ans = new int[nums.length];
        for(int i = 0; i < queries.length; i++)
        {
            int index = queries[i][1];
            int val = queries[i][0];

            if(nums[index] % 2 == 0) sum -= nums[index];
            nums[index] += val;
            if(nums[index] % 2 == 0) sum += nums[index];
            ans[i] = sum;
        }
        return ans;
    }
}