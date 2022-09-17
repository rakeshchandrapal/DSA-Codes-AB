package LeetCode.Daily;

public class L393_UTF8 {


    public static void main(String[] args) {
        int a[] = {197,130,1};
        System.out.println(validUtf8(a));
    }
    public static boolean validUtf8(int[] data) {
        int  n = data.length;
        String [] ans = new String[n];

        for(int i = 0; i < n ; i++)
        {
            ans[i] = Integer.toBinaryString(data[i]);
        }
        int k = 0;
        while(k < n)
        {
           int b =  bytes(ans[k]);
           if(b == -1) return false;
           int index = helper(ans,k,b);
           if(index == -1 ) return false;
           k = index;
        }
        return true;

    }

    static int helper(String [] a,int s,int bite)
    {
        if(bite == 1) return s+1;
        else if (bite == 2) {
           if(a[s+1].charAt(0) == '1' && a[s+1].charAt(1) == '0')
               return s+2;
           else return -1;
        }
        else if(bite == 3)
        {

            if(a[s+1].charAt(0) == '1' && a[s+1].charAt(1) == '0')
            {
                if(a[s+2].charAt(0) == '1' && a[s+2].charAt(1) == '0')
                {
                    return s+3;
                } else return -1;
            } else return -1;
        }
        else if(bite == 4)
        {
            if(a[s+1].charAt(0) == '1' && a[s+1].charAt(1) == '0')
            {
                if(a[s+2].charAt(0) == '1' && a[s+2].charAt(1) == '0')
                {
                    if(a[s+3].charAt(0) == '1' && a[s+3].charAt(1) == '0')
                    {
                                return s +4;
                    } else return -1;
                } else return -1;
            } else return -1;
        }
        else
        {
            return -1;
        }
    }



    static int bytes(String a)
    {
        if(a.charAt(0) == '0' )
        {
            return 1;
        } else if (a.charAt(1) == '1' && a.charAt(2) == '1' && a.charAt(3) == '1' && a.charAt(4) == '0') {
            return 4;
        }
        else if(a.charAt(1) == '1'&& a.charAt(2) == '1'&& a.charAt(3) == '0')
        {
            return 3;
        }
        else if(a.charAt(1) == '1' && a.charAt(2) == '0')
        {
            return 2;
        }
        return -1;

    }


}