package String.Part1;

public class anagram {

    public static boolean Anagram(String s1,String s2)
    {
        // This is Wrong Method because 96 + 96 --> 97 + 98

        char [] c1 = s1.toCharArray();
        char [] c2 = s2.toCharArray();
        int sum1 = 0;
        int sum2 = 0;
        for(int em : c1)
        {
            sum1 += em;
        }
        for(int em : c2)
        {
            sum2+= em;
        }
        return (sum1 == sum2);

    }

    static boolean checkAnagram(String s1,String s2)
    {
        int a[] = new int [256];
        for(int i = 0; i < s1.length();i++)
        {
            a[s1.charAt(i)]++;
        }
        for(int i = 0; i < s2.length();i++)
        {
            a[s2.charAt(i)]--;
        }
        for(int em : a)
        {
            if(em != 0)
            {
                return false;

            }
        }
        return true;
    }


    public static void main(String[] args)
    {
        String s1 = "Rakesh";
        String s2 = "hsRkea";
//        System.out.println(Anagram(s1,s2));
        System.out.println(checkAnagram(s1,s2));

    }
}