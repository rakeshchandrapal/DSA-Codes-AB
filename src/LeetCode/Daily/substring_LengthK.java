package LeetCode.Daily;

import java.util.*;

public class substring_LengthK {

    public static void main(String[] args) {
        String s = "aabab";
        int k = 3;
        System.out.println(countOfSubstrings(s,k));
    }
    static int countOfSubstrings(String S, int K) {
        int ans = 0;
        int i = 0;
        int j = 0;
        char [] s = S.toCharArray();

        while(i < s.length && j < s.length)
        {
              j =  K + i ;
             int countdis =  countDIS(s,i,j);
              if(countdis == K - 1) ans++;
              i = i + 1;
        }
        return ans;
    }

    public static int countDIS(char[] s,int i, int e )
    {
        int count = 0;
            Set<Character> set = new HashSet<>();
            for(int k  = i; k <= e; k++)
            {
              if(!set.contains(s[k]))
              {
                  set.add(s[k]);
                  count++;
              }
            }
            return count;
    }

}