package Binary_Search.Part_2;

public class BookAllocation {

    public static void main(String[] args) {
//        int[] book = {3,1,4,7,2,5,2,9};
//        int[] book = {12, 34, 67, 90};
        int[] book = {31,14,19,75};
        int k = 12;
        System.out.println(bookAllocation(book,k));
    }

    static boolean isVailed(int[] a , int k,int pages)
    {

        int cur = 0;
        int student = 1;
        for(int i = 0; i < a.length; i++)
        {
            if(a[i] > pages) return false;
            cur += a[i];
            if(cur > pages)
            {
                student++;
                cur = a[i];
            }
        }
            return student == k;
    }


    static  int bookAllocation(int[] a,int k ) {
        if(a.length < k ) return -1;
        int l = 0;
        int r = 0;
        int ans = -1;
        for (int j : a) {
            r += j;
        }

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (isVailed(a, k, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

}