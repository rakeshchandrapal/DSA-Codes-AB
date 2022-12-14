package Array145.Matrix.Session;

import java.util.Arrays;

public class MaximumJI {

    public static void main (String[] args)
    {
        int [] arr = {5,4,5,1,7,2,6,5,4,1};
//        System.out.println(findIandJ(arr));  // o(n^2)

        System.out.println(MaxOfIandJ(arr));  //o(n)
    }

    public static int MaxOfIandJ(int []arr)
    {
        int n = arr.length;
        int [] rightMax = new int [n];
        int [] leftMin = new int[n];
        rightMax[n-1] = arr[n-1];
        for(int i = n-2 ; i >=0 ; i-- )
        {
            rightMax[i] = Math.max(rightMax[i+1] , arr[i] );
        }
        leftMin[0] = arr[0];
        for(int i = 1; i < n; i++)
        {
            leftMin[i] = Math.min(leftMin[i-1], arr[i] );
        }
        int i = 0;
        int j = 0;
        int ans = 0;

        while(i < n && j < n)
        {
            if(leftMin[i] < rightMax[j])
            {
                ans = Math.max(ans,j-i);
                j++;
            }else {
                i++;
            }
        }
        System.out.println(Arrays.toString(leftMin));
        System.out.println(Arrays.toString(rightMax));
        return ans;
    }
    static int  findIandJ(int []arr)
    {
        int ans = 0;
        int n = arr.length;
        for(int i = 0 ; i < n; i++)
        {
            for(int j = i+1 ; j < n ; j++)
            {
                if(arr[j] > arr[i])
                {
                    ans = Math.max(ans,j-i);
                }
            }
        }
        return ans;
    }


}