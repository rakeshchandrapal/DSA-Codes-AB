package LeetCode.Contest;

import CollectionFrameWork.MAP;



public class L6181longest {
    public static void main(String[] args) {
        String s = "abcde";
        System.out.println(longestContinuousSubstring(s));
    }
    static int longestContinuousSubstring(String s) {

        int i = 0;
        int max  = -1;
        int count = 1;
        while(i < s.length() - 1)
        {
            if(s.charAt(i) + 1 == s.charAt(i+1) )
            {
                count++;
            }
            else {
                max = Math.max(count , max);
                count = 1;
            }
            i++;
        }
//        if()
        max = Math.max(max,count);
        return max;
    }
}