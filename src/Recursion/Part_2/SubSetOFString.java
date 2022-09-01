package Recursion.Part_2;

public class SubSetOFString {

    static void printSubSrt(String s)
    {
        utilGenrateSubset(s,0,"");
    }

    private static void utilGenrateSubset(String s, int i, String s1) {
            if(i == s.length()) {
                System.out.println(s1);
                return;
            }
            utilGenrateSubset(s,i+1,s1);
            utilGenrateSubset(s,i+1,s1+s.charAt(i));

    }


    public static void main(String[] args)
    {
        String s = "abc";
        printSubSrt(s);
    }
}