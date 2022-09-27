package Array145.Array_Basic_02.Session;

public class waterTrappingProblem {
    static  int waterTrappingArea(int [] arr)
    {
        int areaSum = 0;
        int len = arr.length;
        int[] l = new int [len]; int max = Integer.MIN_VALUE;
        int[] r = new int [len]; int max2 = Integer.MIN_VALUE;
        for(int i = 0; i < len; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
                l[i] = arr[i];
            }
            else
            {
                l[i] = max;
            }

        }
        for(int i = len -1; i >= 0; i--)
        {
            if(arr[i] > max2)
            {
                max2 = arr[i];
                r[i] = arr[i];
            }
            else
            {
                r[i] = max2;
            }

        }
        for(int i = 0; i < len; i++)
        {
            areaSum += Math.min(l[i] , r[i]) - arr[i];
        }
        return  areaSum;
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,1,0,1,3,2,1,2,1};
         int ans = waterTrappingArea(arr);
        System.out.println("We Can Trap the  water = "+ans);



        int largest  = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < largest) {
                arr[i] = largest;
            }
        }
    }
}