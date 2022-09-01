package Sorting.Part_1;

import static Sorting.Part_1.insertionSort.printArray;
import static Sorting.Part_1.BubbleSort.swap;

public class selectionSort {

    public static void SelectionSorted(int[] arr)

    {
        for(int i = 0; i < arr.length - 1; i++)
        {
            int min = i;
            int j;
            for( j = i+1; j < arr.length ; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            swap(arr,min,i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 5, 6, 3, 1, 3};
        SelectionSorted(arr);
        printArray(arr);
    }
    }