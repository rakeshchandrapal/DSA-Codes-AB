package Daily_leet_code.Daily;
/* Example 1:

Input: nums = [4,2,3]
Output: true
Explanation: You could modify the first 4 to 1 to get a non-decreasing array.
Example 2:

Input: nums = [4,2,1]
Output: false
Explanation: You can't get a non-decreasing array by modify at most one element.

 */

public class Non_decrising_array {
    public static boolean checkPossibility(int[] nums) {
        int k = 0 ;
         for (int i = 1; i <nums.length - 1; i++ )
         {
             if(nums[i] <= nums[i+1] )
             {
                 k = 2;
             }
             else
             {
                 k = 3;
             }

         }
        return ( k == 2);
    }
    public static void main(String[] args)
    {
        int arr[] = {5,2,3,4,5,4};
        System.out.println(checkPossibility(arr));
    }
}