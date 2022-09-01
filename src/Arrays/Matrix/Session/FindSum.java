package Arrays.Matrix.Session;

public class FindSum {


    public static void main(String[] args)
        {
             int arr[] = {1,4,5,7,8,10,12};
             int sum = 10;
             boolean check = FindSum(arr,sum);
            System.out.println( check);
         }

         static Boolean FindSum(int[] arr , int sum)
         {
                    int left = 0;
                    int right = arr.length - 1;
                    while(left < right)
                    {
                        int curSum = arr[left] + arr[right];
                        if( curSum > sum)
                        {
                            right--;
                        }
                        else if(curSum < sum )
                        {
                            left++;
                        }
                        else
                        {
                            return  true;
                        }
                    }
                    return  false;
         }

}