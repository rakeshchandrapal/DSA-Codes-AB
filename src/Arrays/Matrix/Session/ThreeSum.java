package Arrays.Matrix.Session;

public class ThreeSum {
    public static void main(String[] args)
    {
        int arr[] = {1,4,5,7,8,10,12};
        int sum = 10;
//        System.out.println( check);
    }

    static Boolean FindSum(int[] arr , int sum,int i )
    {
        int left = i;
        int right = arr.length - 1;
        while(left < right)
        {
            int curSum = arr[left] + arr[right];
            if( curSum > sum)
            {
                right--;
            }
            else if(curSum < sum )
            {
                left++;
            }
            else
            {
                return  true;
            }
        }
        return  false;
    }
}