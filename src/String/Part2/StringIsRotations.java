package String.Part2;

public class StringIsRotations {

    static boolean checkStringIsRotations(String s1 , String s2)
    {
        if(s1.length() != s2.length()) return false;

        String doubleString = s1 + s1;
        return doubleString.contains(s2);
    }


    public static void main(String[] args) {


        String s1 = "abcd";
        String s2 = "cdab";
        System.out.println(checkStringIsRotations(s1,s2));

    }
}