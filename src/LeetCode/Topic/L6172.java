package LeetCode.Topic;

public class L6172 {
    public boolean isStrictlyPalindromic(int n) {
    String num = String.valueOf(n);
    for(int i = 2; i <= n - 2; i++) {
        String no = convert(num, i);
        if(!check(no))
        {
          return false;
        }
    }
    return true;
    }
public static void main(String[] args) {
//    System.out.println(convert("9",2));
}

    public static String convert( String number, int DBase)
    {
        int Sbase = 10;

        return Integer.toString(
                Integer.parseInt(number, Sbase), DBase);

    }
    boolean check(String n)
    {
        int left = 0;
        int r = n.length() - 1;
        while(left < r)
        {
            if(n.charAt(left) != n.charAt(r))
            {
                return  false;
            }
            else
            {
                left++;
                r--;
            }


        }
        return true;
    }

}