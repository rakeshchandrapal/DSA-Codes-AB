package LeetCode.Topic;

import java.util.HashSet;
import java.util.Set;

public class L3_LongestSubstring {

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static  int lengthOfLongestSubstring(String s) {
        int max = 0;
        int i = 0,j = 0;
        Set<Character> set = new HashSet<>();
      while(i < s.length() && j <s.length())
       {
            char cur = s.charAt(j);
            if(set.contains(cur))
            {
                max = Math.max(max, set.size());
                set.remove(cur);
                i++;
            }else
            {
                set.add(cur);
                j++;
            }
        }
        return max;
    }
}