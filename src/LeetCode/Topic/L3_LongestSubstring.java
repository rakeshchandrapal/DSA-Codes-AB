package LeetCode.Topic;

import java.util.HashSet;
import java.util.Set;

public class L3_LongestSubstring {

    public static void main(String[] args) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static  int lengthOfLongestSubstring(String s) {
        int max = -1;
       for(int i = 0; i < s.length(); )
       {
            Set<Character> set = new HashSet<>();
              for(;i < s.length();i++)
              {
                  if(set.contains(s.charAt(i)))break;
                    else set.add(s.charAt(i));

              }
            int size2 = set.size();
            max = Math.max(max,size2);
            set.clear();
        }
        return max;
    }
}