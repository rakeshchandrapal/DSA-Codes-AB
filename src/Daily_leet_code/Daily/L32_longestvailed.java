package Daily_leet_code.Daily;

public class L32_longestvailed {


    public static void main(String[] args) {
        String s = ")()())";
        System.out.println(longestValidParentheses(s));

    }
    public static int longestValidParentheses(String s) {
        int count = 0;
        int prev = 0;
        if(s.length() == 0) return 0;
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(s.charAt(i) == '(' && s.charAt(i+1) == ')')
            {
                prev++;
                count = Math.max(prev , count);
            }

        }
        return count;

    }

}