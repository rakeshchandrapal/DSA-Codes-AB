package Array145.Array_Basic_02.Assignments;

public class A06_Print_MAx_subArray {
    public static void main(String[] args) {
//        int[] a = {-1, 2, 3, -4, 5};
        int[] a = {-2,-7,6, -1,4};
        int sum = 0;
        int start = 0;
        int end = 0;

        int Max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if(sum > Max)
            {
                Max = sum;
                end = i;
            }
            else if(sum < 0)
            {
              sum = 0;
              start = i;
            }
        }
        int []arr2 = new int [end - start + 1];
        int index = 0;
        for (int i = start; i <= end ; i++) {
            arr2[index] = a[i];
            index++;

        }
        System.out.println(Max);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}