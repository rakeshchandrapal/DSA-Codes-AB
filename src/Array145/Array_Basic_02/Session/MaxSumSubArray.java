package Array145.Array_Basic_02.Session;

public class MaxSumSubArray {
    static int findMaxSumSubArray(int[] arr)
    {
        int current = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            current += arr[i];
            if(current > maxSum) maxSum = current;
            if(current < 0) current = 0;
        }
        return  maxSum;
    }
    public static void main(String[] args)
    {
//        int [] arr = {-1,2,3,-4,5};
//        int [] arr = {-2,-7,-6,-4,-1,-3,-8};
        int [] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The Maximum sub Array's Sum = "+findMaxSumSubArray(arr));
    }

}