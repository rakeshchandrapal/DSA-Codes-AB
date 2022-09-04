package LeetCode.Topic;
import  java.util.*;
public class L6171_lee {

    public boolean findSubarrays(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < nums.length - 1 ; i++)
        {
            int j = i + 1;

                int sum = nums[i] + nums[j] ;
                if(set.contains(sum))
                {
                    return true;
                }
                else {
                    set.add(sum);
                }


        }
        return false;



    }


}