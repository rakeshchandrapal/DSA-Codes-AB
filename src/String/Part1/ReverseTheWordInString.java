package String.Part1;

public class ReverseTheWordInString {

    static void reverseTheChar(char [] c,int i ,int j)
    {
        while(i < j)
        {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
            i++;
            j--;
        }
    }

    static String ReversTheWord(String s)
    {
        char [] c = s.toCharArray();
        int start = 0;
        int end = 0;
        for(  ;end < s.length() ; end++ )
        {
            if(c[end] == ' ')
            {
                reverseTheChar(c,start,end-1);
                start = end + 1;
            }

        }

        reverseTheChar(c,start,end-1);
        // whole string
        reverseTheChar(c,0,s.length() - 1);
        return new String(c);
    }

    public static void main(String[] args) {
//            String s = "I am The Boss";
            String s = "Never Give UP";
            String ans = ReversTheWord(s);
        System.out.println(ans);

    }

}