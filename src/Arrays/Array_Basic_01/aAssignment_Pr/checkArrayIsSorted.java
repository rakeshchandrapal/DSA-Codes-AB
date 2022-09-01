package Arrays.Array_Basic_01.aAssignment_Pr;

public class checkArrayIsSorted {
    public static boolean isSorted(int[] arr)
    {
        boolean isSorted = true;
        for(int i = 0; i < arr.length-1 ; i++)
        {
            if(arr[i] > arr[i+1])
            {
                isSorted = false;
                break;

            }
        }
        return  isSorted;
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,9,10};
        boolean ans = isSorted(arr);
        if(ans)
        System.out.println("The Array is Sorted");
        else
            System.out.println("The Array is Not Sorted");

    }
}