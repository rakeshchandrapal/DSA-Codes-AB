package Array145.Array_Basic_02.Assignments;

public class A01_Frequency {
    static void findFrequency(int[] arr)
    {
        int len = arr.length;
        int current = arr[0];
        int count = 0;
//        int[] ans = new int [len];
        for(int i = 0; i < len; i++)
        {
            if(current == arr[i])
            {
                count++;
            }
            else {
                System.out.println("The element "+arr[i-1]+" is "+count+" times");
                current = arr[i];
                count = 1;
            }
            if(i==len-1)
            {
                System.out.println("The element "+arr[i]+" is "+count+" times");
            }

        }
    }
    public static void main(String[] args) {
//        int[] arr = {1,1,2,3,3,3,6,6};
        int[] arr = {4,4,2,1,3,3,3,3,3,3,5,5,5,5,9,7};
        findFrequency(arr);
    }
}