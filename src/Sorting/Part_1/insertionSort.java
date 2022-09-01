package Sorting.Part_1;

public class insertionSort {
    static void InsertionSort(int arr [])
    {
        for(int i = 1; i < arr.length;i++)
        {
            int j ;
//            printArray(arr);
//            System.out.println();
            int temp = arr[i];
            for(j = i - 1 ; j >= 0; j--)
            {
                if(temp < arr[j])
                {
                    arr[j+1] = arr[j];

                }
                else {
                    break;
                }
            }
            arr[j+1] = temp;
        }
    }


    public static void printArray(int [] arr)
    {
        for(int em : arr)
        {
            System.out.print(em+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {9,5,6,3,1,3};
        InsertionSort(arr);
        printArray(arr);


    }
}