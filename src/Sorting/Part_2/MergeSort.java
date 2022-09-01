package Sorting.Part_2;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {9,6,3,5,4,1,2};
//        int[] arr = {7,8,9,4,5,1};
        mergeSort(arr,0, arr.length -1);
        System.out.println(Arrays.toString(arr));

    }

    public static void mergeSort(int[] arr , int low,int high)
    {
        if(low < high)
        {
            int mid = (low + high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }
    }

     static void merge(int[] arr, int low, int mid, int high) {
            int[] b = new int[arr.length];
            int i = low;
            int j = mid+1;
            int k = low;

            while (i <= mid && j <= high)
            {
                if(arr[i] <= arr[j])
                {
                    b[k] = arr[i];
                    i++;
                }
                else {
                    b[k] = arr[j];
                    j++;
                }
                k++;
            }
            if(i > mid)
            {
                while(j <= high)
                {
                    b[k] = arr[j];
                    k++; j++;
                }
            }
            else {
                while(i <= mid)
                {
                    b[k] = arr[i];
                    k++; i++;
                }
            }
         for(i = low; i <= high;i++)
         {
             arr[i] = b[i];
         }


    }
}