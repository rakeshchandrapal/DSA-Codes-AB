package GFG.Arrays.Daily;

import java.util.Locale;

public class LicenceKeyReformat {
    public static void main(String[] args) {
        String a = "-yD-tuI-wm-9sCUp5";
        int l = 13;
        System.out.println(ReFormatString(a,l));
    }
    static String ReFormatString(String S, int K){
        // code here
        int n = S.length() - 1;
        int count = 0;
        StringBuilder ans = new StringBuilder("");
        while(n >= 0)
        {
            if(S.charAt(n) == '-')
            {
                n--;
                continue;
            }
            else {
                ans.append(S.charAt(n));
                count++;
            }
            if(count == K )
            {
                if( n != 0)
                {
                ans.append('-');
                count = 0;
            }
            }

            n--;
        }
        ans.reverse();
        if(ans.length() == 0 ) return "";
        if(ans.charAt(0) == '-') ans.deleteCharAt(0);
        return ans.toString().toUpperCase(Locale.ROOT);
    }
}