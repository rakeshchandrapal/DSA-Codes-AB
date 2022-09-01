package Binary_Search.Part_1;

public class squareRoot {

    public static void main(String[] args) {
        int n = 64;
        System.out.println(sqrt(n));
    }
    static int sqrt(int num)
    {
        int ans = 1;
        int l = 1,r = num;
        while(l <= r)
        {
            int mid = (l + r)/2;
            int midsq = mid * mid;
            if(midsq == num ) return mid;
            if(midsq > num)
            {
                r  = mid - 1;

            }
            else {
                ans = mid;
                l = mid + 1;
            }
        }
        return ans;
    }
}