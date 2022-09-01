package Arrays.Array_Basic_03.Session;

import java.util.HashSet;
import java.util.Set;

public class PrefixSum {
    static boolean FindSumOfSubArrayWithZero(int [] arr)
    {
        int len = arr.length;
        int sum = 0;

        Set <Integer> set = new HashSet<>();
        for(int i = 0; i < len ; i++)
        {
            sum += arr[i];
            if(set.contains(sum)){
                return  true;
            }
            set.add(arr[i]);
        }
        return  false;
    }
    public static void main(String[] args) {
//        int [] arr = {1,4,2,-3,-5,2,3};
//        int [] arr = {1,2,3,4,5,6,-4,1};
        int [] arr = {2,3,1,-4,3,-2};
        System.out.println(FindSumOfSubArrayWithZero( arr));
    }
}