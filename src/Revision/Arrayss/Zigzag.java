package Revision.Arrayss;

import java.util.Arrays;

public class Zigzag {
    public static  void  ZigZag(int[] arr,int n){
        boolean relation = true;
//        relation is to see the relation between two elements
//        if it is true then it must be arr[i] < arr[i+1] if not then swap
//        if it is false then it must be arr[i] > arr[i+1] if not then swap

        for(int i = 0; i< n - 1; i++){
            if(relation){
                if(arr[i] > arr[i+1]) swap(i,i+1,arr);
            }
            else{
                if(arr[i] < arr[i+1]) swap(i,i+1,arr);
            }
            relation = !relation;
        }

    }

    public static void swap(int i, int j,  int[]arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] a = {4,3,7,8,6,2,1};
        ZigZag(a,a.length);
        System.out.println(Arrays.toString(a));
    }
}