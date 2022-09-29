package GFG.Arrays.Daily;

import java.util.Arrays;

public class SortThreeNumber {
    public static void main(String[] args) {
        int []a = { 2,2,2,0,1,1,1,0,0,0,1,1,1};
        sort012(a,a.length);
        System.out.println(Arrays.toString(a));
    }

    public static void sort012(int a[], int n)
    {
        int mid = 0;
        int high = n - 1;
        int low = 0;

        while(mid <= high)
        {
            if(a[mid] == 0)
            {
                swap(a,mid,low);
                low++;
                mid++;
            }
            else if(a[mid] == 1)
            {

                mid++;
            }
            else if(a[mid] == 2)
            {
                swap(a,mid,high);
                high--;
            }
        }

        // code here
    }

     static void swap(int[] arr ,int i,int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}