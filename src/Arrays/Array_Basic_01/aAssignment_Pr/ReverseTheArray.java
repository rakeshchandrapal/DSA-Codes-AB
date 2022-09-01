package Arrays.Array_Basic_01.aAssignment_Pr;

public class ReverseTheArray {
    public static int[] reverseTheArray(int [] arr)
    {
        int j = 0;
        int[] newArr  = new int [arr.length];
        for(int i = arr.length-1; i >= 0; i--)
        {
           newArr[j] = arr[i];
           j++;

        }
        return newArr;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,45,78,-1,4,5};
        int[] ans = reverseTheArray(arr);
        for(int element : ans)
        {
            System.out.print(" "+ element);
        }
    }
}