package Binary_Search.Part_2;

public class treeCutter {
    public static void main(String[] args) {
        int [] arr = {6,5,10,9,2,4,9,5};
        int k = 13;
        System.out.println(woodCutter(arr,k));
    }

    static  int woodCutter(int[] arr,int k)
    {
        int l = 0;
        int r = -1;
        int ans = -1;
        for(int em : arr)
        {
            r = Math.max(r,em);
        }
        while(l <= r)
        {
            int mid = (l+r)/2;
            if(IsEnough(arr,k,mid))
            {
                ans = mid;
                l = mid + 1;
            }
            else
            {
                r = mid -  1;
            }
        }

        return ans;
    }

    static boolean IsEnough(int[] arr , int k, int cut)
    {
        int total = 0;
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > cut)
            {
                total += arr[i] - cut;
            }
        }
            return total >= k;
    }




}