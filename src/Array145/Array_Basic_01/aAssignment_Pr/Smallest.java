package Array145.Array_Basic_01.aAssignment_Pr;

public class Smallest {

    public  static int smallestNum(int[] arr)
    {
        int small = Integer.MAX_VALUE;
        for (int i = 0 ; i< arr.length ; i++)
        {
            if(arr[i] < small )
            {
                small = arr[i];

            }

        }
        return  small;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,45,78,-1,4,5};
        System.out.println("The Smallest Number IN array is = "+smallestNum(arr));
    }
}