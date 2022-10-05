package Daily_leet_code.Daily;

public class L557_reverse_String {
    public static void main(String[] args) {
        String s =  "Let's take LeetCode contest";
        String ans = reverseWords(s);
        System.out.println(ans);
    }
    public  static String reverseWords(String s) {

        StringBuilder result = new StringBuilder();
        String []ans = s.split(" ");
        for(int i = 0; i < ans.length;i++)
        {
            StringBuilder newString = new StringBuilder(ans[i]);
            newString.reverse();
            result.append(newString);
            if(i != ans.length - 1)result.append(" ");
        }
        return result.toString();
    }

}