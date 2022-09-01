package Arrays.Array_Basic_02.Assignments;

public class A02_Consecutive_of_one {
    static int FindMaxConsecutive(int[] arr)
    {
       int numsOfZero = 0;
       int len = arr.length;
       int index = 0 ;
        int maxi = Integer.MIN_VALUE;
        for (int k : arr) {
            if (k == 0) {
                numsOfZero++;
            }
        }
        numsOfZero = numsOfZero +1;
        int[] result = new int [numsOfZero];
        for (int i : arr) {
            if (i == 1) {
                result[index]++;
            }
            if (i == 0) {
                index++;
            }
        }
        for(int em : result)
        {
            if(em > maxi)
            {
                maxi = em;
            }
        }

        return  maxi;

    }
    public static void main(String[] args) {
        int[] arr = {1,1,1,0,0,1,0,1,1,1,1,0,1,1,1,1};
        System.out.println(FindMaxConsecutive(arr));
    }
}