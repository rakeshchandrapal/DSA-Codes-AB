package Sorting.Part_1;

public class BubbleSort {

    static void BubbleSort(int [] arr)
    {
        for(int i = 0; i < arr.length -1;i++)
        {
            for(int j = 0; j < arr.length - i - 1 ; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    swap(arr,j,j+1);
                }
            }
        }
    }

    public static void swap(int [] arr ,int index1,int index2)
    {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    public static void main(String[] args) {
        int []arr = {9,3,1,4,5,6,3};
        BubbleSort(arr);
        for(int rm  : arr)
        {
            System.out.print( rm +" ");
        }
    }

    static void OptimizedBubbleSort(int [] arr)
    {
        int j = 0;
            for(int i = 0; i < arr.length -1; i++)
            {
                boolean chek = true;
                for(j = 0; j < arr.length -i - 1; j++)
                {
                    if(arr[j] > arr[j+1])
                    {

                        swap(arr, j , j+1);
                        chek = false;
                    }
                if(chek != true)
                {
                    break;
                }

                }
            }
    }
}