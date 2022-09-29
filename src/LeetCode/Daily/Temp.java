package LeetCode.Daily;

import java.util.*;

public class Temp {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<>();
        int l = findElements(arr, x), r = l+1;
//        System.out.println(l);
        if (l ==0){
            while( list.size() < k){
                list.add(arr[l]);
                l++;
            }
        }
        if (l == arr.length-1){
            while( list.size() < k){
                list.add(arr[l]);
                l--;
            }
        }

        while(list.size() < k){
            int a = Math.abs(arr[l]-x);
            int b = Math.abs(arr[r]-x);
            if(a <= b){
                list.add(arr[l]);
                if(l != 0) l--;
            }else{
                list.add(arr[r]);
                if (r != arr.length-1)r++;
            }
        }
        Collections.sort(list);
        return list;
    }
    public static int findElements(int[] arr, int x){
        int i = 0, j = arr.length-1;
        int temp = 0;
        while (i<=j){
            int mid = (i+j)/2;
            if (mid == x) return mid;
            if (x < arr[mid]){
                j = mid -1;
            }else {
                if(arr[temp] < arr[mid]){
                    temp = mid;
                }
                i = mid +1;
            }
        }
        System.out.println(temp);
        return temp;
    }

    public static void main(String[] args) {
        int[] arr= {1, 2, 3, 4, 5};
        int k = 4;
        int x = -1;
        System.out.println(findClosestElements(arr, k, x));
    }
}