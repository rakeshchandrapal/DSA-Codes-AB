package Arrays.Array_Basic_02.Session;

public class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {2,7,6,4,1,3};
        findLeaders(arr);
    }
    public static void findLeaders(int[] arr)

    {
        int leaders = Integer.MIN_VALUE;
        int[] ans = new int[arr.length];
        int j = 0;
        System.out.println("The Leaders are : ");
        for(int i = arr.length -1 ; i >= 0; i--)
        {
            if( arr[i] > leaders)
            {
                leaders = arr[i];
                ans[j] = leaders;
                j++;
            }
        }
        for( j = j-1; j >= 0; j--)
        {
            System.out.print(" "+ans[j]);
        }
    }
}