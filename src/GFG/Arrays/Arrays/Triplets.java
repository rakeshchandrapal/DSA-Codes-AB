package GFG.Arrays.Arrays;
import java.util.*;
public class Triplets {
    public static void main(String[] args) {
        int[]a = {4 ,-16 ,43 ,4 ,7 ,-36 ,18};
        System.out.println(findTriplets(a,a.length));
    }
    public static  boolean findTriplets(int arr[] , int n)
    {
        //add code here.
        Set<Integer> set = new HashSet<>();
        for(int e : arr)set.add(e);

        for(int  i = 0; i < n - 1; i++){
            for(int j = i + 1 ; j < n; j++){
                int sum = arr[i] + arr[j];
                if(set.contains(sum * -1)) return true;
            }
        }
        return false;
    }
}