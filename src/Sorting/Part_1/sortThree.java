package Sorting.Part_1;

import static Sorting.Part_1.BubbleSort.swap;
import static Sorting.Part_1.insertionSort.printArray;

public class sortThree {
    public static void main(String[] args) {
        int[] arr = {2,2,1,0,0,1,2,0,1};
        sorted(arr);
        printArray(arr);

    }
    static void sorted(int[] arr)
    {
        int mid = 0;
        int low = 0;
        int high = arr.length - 1;
        while (mid < high)
        {
            if(arr[mid] == 0)
            {
                swap(arr,mid,low);
                low++;
                mid++;
            }
            else if(arr[mid] == 1)
            {
                mid++;
            } else if (arr[mid] == 2) {
                swap(arr,mid,high);
//                mid++;
                high--;


            }
        }
    }

}