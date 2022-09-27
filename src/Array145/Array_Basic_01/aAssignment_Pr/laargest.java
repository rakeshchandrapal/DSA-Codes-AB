package Array145.Array_Basic_01.aAssignment_Pr;

public class laargest {

    static  void  larg (int[] arr)
    {
        int len = arr.length;
        int larg = Integer.MIN_VALUE;
        int j = len - 1;
        int[] arr1 = new int[len ];
        for (int i = len; i > arr.length - 1; i--)
        {
            if(arr[i] > larg)
            {
                arr1[j--] = larg;

            }
            else
            {
                arr1 [ j--] = larg;
            }
        }
        for (int em : arr1)
        {
            System.out.println(em+" ");
        }

    }
    public static void main(String[] args) {

        int[] arr = {7,5,8,9,6,8,5,7,4,6};

    }
}