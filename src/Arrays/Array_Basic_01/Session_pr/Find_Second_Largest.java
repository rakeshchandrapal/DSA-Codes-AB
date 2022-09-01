package Arrays.Array_Basic_01.Session_pr;

public class Find_Second_Largest {
    public static int secondLargest(int [] nums)
    {
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > large)
            {
                secondLarge = large;
                large = nums[i];
            }
        }
        return  secondLarge;

    }
    public static void main (String[] args)
    {
        int[] arr = {1,2,3};
        System.out.println(secondLargest(arr));

    }
}
//            if (nums[i] > large) {
//                secondLarge = large;
//                large = nums[i];
//            }
//            else if (nums[i] < large) {
//                if(nums[i] > secondLarge) {
//                    secondLarge = nums[i];
//                }
//            }