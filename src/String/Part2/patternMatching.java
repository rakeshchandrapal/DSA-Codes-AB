package String.Part2;

public class patternMatching {

    static void FindPatternIndex(String s1,String s2)
    {
        int n  = s1.length();
        int m = s2.length();
        for(int i = 0; i <= n -m ; i++)
        {
            int j = 0;
            for(j = 0 ; j < m; j++ )
            {
                if(s1.charAt(i+j) != s2.charAt(j))
                {
                    break;
                }
            }
            if(j == m)
            {
                System.out.println("The Pattern is at Index "+i);
            }
        }
    }

    public static void main(String[] args) {
            String s = "absdgsghdbayuop";
            String p = "hdb";
            FindPatternIndex(s,p);

    }

}