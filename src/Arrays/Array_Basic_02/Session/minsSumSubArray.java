package Arrays.Array_Basic_02.Session;

public class minsSumSubArray {
    public static void main(String[] args)
    {
        int [] arr = {6,7,-4,-2,1,5,4};
//        int [] arr = {-2,-7,-6,-4,-1,-3,-8};
        System.out.println("The Minimum sub Array's Sum = "+findMinSumSubArray(arr));
    }
    static int findMinSumSubArray(int[] arr)
    {
        int current = 0;
        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < arr.length; i++)
        {
            current += arr[i];
            if(current < minSum) minSum = current;
            if(current > 0) current = 0;
        }
        return  minSum;
    }
}