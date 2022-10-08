package GFG.Arrays.SDE;

import java.util.*;

public class Ocuuerance {
    public static void main(String[] args) {
        int []a = {1, 7, 4, 3, 4, 8, 7};
        int n = a.length;
        int k = 2;

    }
    public int firstElementKTime(int[] arr, int n, int k) {
        Map <Integer ,Integer> map = new HashMap<>();
        for(int i = 0; i < n; i++)
        {
            if(map.containsKey(arr[i]))
            {
                int temp = map.get(arr[i]);
                map.put(arr[i],temp + 1);
            }
            else {
                map.put(arr[i], 1);
            }
        }
        for(int em : arr)
        {
            if(map.containsKey(em) && map.get(em) == k)
            {

            }
        }
        return 0;
    }
}