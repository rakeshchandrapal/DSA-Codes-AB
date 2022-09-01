package HashSetInJava.Part_01;
import java.util.Map;

import java.util.HashMap;

public class LargestSum_WithZero {

    public static int largestSubArrayZeroSum(int[] arr)
    {
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,-1);
        int ans = 0;
        int cs = 0;



        for (int i = 0 ; i < arr.length;i++)
        {
            cs += arr[i];
            if(map.containsKey(cs))
            {
                int prev = map.get(cs);
                ans = Math.max(ans,i - prev);

            }
            else {
                map.put(cs,i);
            }
        }
        return ans;


    }
    public static void main(String[] args) {
//        int[] arr = {1,1,5,-3,-4,3,4,1};
        int[] arr = {1,2,3,-3,4};
        System.out.println("SO The Largest Distance With Sum Zero is = "+largestSubArrayZeroSum(arr));
    }
}