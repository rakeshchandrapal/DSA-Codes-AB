package Sorting.Part_2;

import java.util.Arrays;
import java.util.Scanner;

import static Sorting.Part_1.BubbleSort.swap;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {9, 5, 6, 2, 1, 3};
        quickSort(arr,0,arr.length -1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] arr ,int low,int high)
    {
        if(low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }

    }

    static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[low];
        int i = low;
        int j = high;
        while (i < j)
        {
            while( i < j && arr[i] <= pivot)i++;
            while(arr[j] >= pivot)j--;
            if(i < j)
            {
                swap(arr ,i,j );
            }

        }

        /// to place pivot to its right position
        swap(arr,low,j);
        return j;
        // real index of pivot

    }

}