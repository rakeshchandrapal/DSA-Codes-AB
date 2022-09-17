package LeetCode.Daily;

import java.util.*;

public class L2007_ChangedArray {


    public static void main(String[] args) {
//        int [] a = {1,2,4,2,3,6,2,4};
        int [] a = {0,0,0,0};
        int [] ans = findOriginalArray(a);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findOriginalArray(int[] changed) {

        int n = changed.length;
        int [] ans = new int[n/2];
        if(!(n % 2 == 0)) return new int[] {};

        Map<Integer,Integer> map = new HashMap<>();
        int k = 0;
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(changed[i]))
            {
                int temp = map.get(changed[i]);
                map.put(changed[i],temp + 1 );
            }
            else {
                map.put(changed[i],1 );
            }
        }
        Arrays.sort(changed);

        for(int em : changed)
        {
            if(map.containsKey(em))
            {
                if(map.containsKey(em * 2))
                {
                    ans[k] = em;
                    k++;

                    int temp1= map.get(em);

                    if(em == em*2)
                    {
                        if(temp1 - 2 ==0)
                        {
                            map.remove(em);
                        }
                        else map.put(em,temp1 - 2);
                        continue;
                    }
                    int temp2 = map.get(em * 2);
                    if(temp1 - 1 == 0)
                    {
                        map.remove(em);
                    }else map.put(em, temp1 - 1);
                    if(temp2 - 1 == 0)
                    {
                        map.remove(em * 2);
                    }else map.put(em * 2, temp2 - 1);
                }
            }
            if(k == ans.length) break;
        }


           if(!map.isEmpty())  return new int[]{};

        return ans;

    }

}