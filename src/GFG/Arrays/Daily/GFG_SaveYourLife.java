package GFG.Arrays.Daily;

import java.util.*;

public class GFG_SaveYourLife {
    static String maxSum(String w, char[] x, int[] b, int n){
        if(w.length() == 1) return w;
        int sum = 0;
        String ans = ""; int max = 0;
        char [] s = w.toCharArray();
        Map<Character,Integer> map = new HashMap<>();
        for(char cur : s ) map.put(cur,(int) cur);

        for(int i = 0; i < n ; i++)
        {
            map.put(x[i],b[i]);
        }


        int i = 0, j = 0;
        while(j < s.length)
        {
            sum += map.get(s[i]);
            if(sum < 0)
            {
                sum = 0;
                i = j ;
            }
            else {
                max = sum;
                ans = ((w.substring(i, j)));
            }
            j++;
        }
       return ans;

    }
}