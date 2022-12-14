package Array145.Array_Basic_01.aAssignment_Pr;

import java.util.Arrays;

public class laargest {

    static  void  larg (int[] arr)
    {
        int n = arr.length - 1;
       int big = arr[n];

       for(int i = n - 1; i >=0; i--) {
           if (arr[i] > big) {
               int temp = arr[i];
               arr[i] = big;
               big = temp;
           } else {
               arr[i] = big;
           }
       }
       arr[n] = 0;
    }
    public static void main(String[] args) {

        int[] arr = {7,5,8,9,6,8,5,7,4,6};
        larg(arr);
        System.out.println(Arrays.toString(arr));
    }
}