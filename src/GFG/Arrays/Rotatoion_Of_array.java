package GFG.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Rotatoion_Of_array {


    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int d = 2;
        int n  = 5;
        rotateArr(arr,d,n);
        System.out.println(Arrays.toString(arr));

    }

static void  rotateArr(int arr[], int d, int n){
        // code here
        int i;
        int tempIndex = 0;
        int[] temp = new int[n];
        for(i = d; i < n ; i++)
        {
            temp[tempIndex] = arr[i];
            tempIndex++;
        }

        for(i = 0; i < d; i++)
        {
            temp[tempIndex] =  arr[i];
            tempIndex++;
        }

        for(int j = 0; j < n ; j++)
        {
            arr[j] = temp[j];
        }

    }


}