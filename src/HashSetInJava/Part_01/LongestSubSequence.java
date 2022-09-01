package HashSetInJava.Part_01;
import java.util.*;

import java.util.HashSet;

public class LongestSubSequence {
    public static void main(String[] args) {

        int[] a = {2,1,9,3,4,5,8,7};
        System.out.println("The Longest Consecutive Subsequence = "+longestConsecutiveSubSequence(a));
    }

    public static int longestConsecutiveSubSequence(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        int ans = 1;

        for(int el : arr)
        {
            set.add(el);

        }
        for(int e : arr)
        {
            if(!(set.contains(e - 1)))
            {
                int len = 0;
                while(set.contains(++e))
                {
                    len++;
                }
                ans = Math.max(ans , len);
            }
        }
        return  ans;
    }


}