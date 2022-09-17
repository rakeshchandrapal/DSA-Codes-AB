package GFG.Arrays.Daily;
import java.util.*;

public class SmallestSubsetWithGraterSum {


    public static void main(String[] args) {
        int a[] = {20, 12, 18, 4};
        System.out.println(minSubset(a,a.length));
    }
    static int minSubset(int[] Arr,int N) {

       Arrays.sort(Arr);
        int j = N - 1,k;
        int sum = 0,sum2 = 0;
        int i = 0;
        for(i = 0; i < N ; i++)
        {
            for (k = 0; k < j; k++)
            {
                sum2 += Arr[k];
            }
            sum += Arr[j];
            if(sum2 < sum) return (N-j);
            else j--;
        }
        return 0;



    }


}