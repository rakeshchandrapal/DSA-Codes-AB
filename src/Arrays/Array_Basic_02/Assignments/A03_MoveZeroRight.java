package Arrays.Array_Basic_02.Assignments;

public class A03_MoveZeroRight {

    public static void main(String[] args) {
//        int[] arr = {8,0,1,3,0,0,5};
        int [] arr = {7,0,2,0,0,0,4,3,5};
        // ans == 8,1,3,5,0,0,0
        int [] ans  = new int [arr.length];
        int index = 0;
        for(int i = 0; i < arr.length ; i++)
        {
            if(arr[i] != 0)
            {
                ans[index] = arr[i];
                index++;
            }
        }
        for(int em : ans)
        {
            System.out.print(" "+em);
        }

    }
}