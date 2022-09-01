package Arrays.Array_Basic_02.Assignments;

public class A04_trappingWaterINOof1space {
    public static void main(String[] args) {
//        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int [] arr = {3,4,5,1,7,2,6,5,4,1};
//        int [] arr = {4,1,3,2,1,5,2,1};
//        int [] arr = {3,5,1,4,2,6};
        System.out.println(FindWaterr(arr));

    }
    static int FindWaterr(int []arr )
    {
        int ans = 0;
        int left = 0;
        int right =  arr.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while(left <= right)
        {
            if(arr[left] <= arr[right])
            {
                if( arr[left] > leftMax)      leftMax = arr[left];
                else ans += leftMax - arr[left];
                left++;
            }
            else
            {
                if(arr[right] > rightMax)  rightMax = arr[right];
                else ans += rightMax - arr[right];
                right--;

            }
        }

            return ans;

    }
    static int findWaterTrapped(int[] arr) {
        int n = arr.length;
        // that can be stored
        int res = 0;

        // For every element of the array
        // except first and last element
        for (int i = 1; i < n - 1; i++) {

            // Find maximum element on its left
            int left = arr[i];
            for (int j = 0; j < i; j++) {
                left = Math.max(left, arr[j]);
            }

            // Find maximum element on its right
            int right = arr[i];
            for (int j = i + 1; j < n; j++) {
                right = Math.max(right, arr[j]);
            }

            // Update maximum water value
            res += Math.min(left, right) - arr[i];
        }
        return res;

    }



}