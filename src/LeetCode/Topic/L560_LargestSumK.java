package LeetCode.Topic;

import java.util.*;
import java.util.HashSet;
import java.util.Set;

public class L560_LargestSumK {

    public static void main(String[] args) {

//        int[] a = {1,1,1};
        int[] a = {1,2,1,2,1};
//        int[] a = {1,2,3};
//        int[]a = {1};
        int k = 3;
        System.out.println(subarraySum(a,k));


    }

    public static int subarraySum(int[] nums, int k) {
    Map<Integer , Integer> map = new HashMap<>();

    int count = 0;
    int currentSum = 0;
    int i = 0;
    int n = nums.length;

    if(n == 0)
    {
        return 0;
    }

    while(i < n)
        {
            currentSum += nums[i];

            if(currentSum == k)
            {
                count++;
            }

            if(map.containsKey(currentSum - k) )
            {
                count += map.get(currentSum - k) ;
                int temp = map.get(currentSum - k);
                map.put(currentSum - k,temp + 1);
            }
            else {
                map.put(currentSum, 1);
            }
            i++;

        }

        return count;
    }
}