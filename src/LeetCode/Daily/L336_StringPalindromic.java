package LeetCode.Daily;
import java.util.*;

public class L336_StringPalindromic {


    public static void main(String[] args) {
        String a [] = {"abcd","dcba","lls","s","sssll"};
        System.out.println(palindromePairs(a));
    }
    public static List<List<Integer>> palindromePairs(String[] words) {
    List<List<Integer>> ans = new ArrayList<>();

    for(int i =0; i < words.length; i++)
    {
        for(int j = 0; j < words.length; j++)
        {
            if(!(i == j))
            {
                 String t = words[i] + words[j];
                 if(isPalindromic(t))
                 {
                     List<Integer> temp = new ArrayList<>();
                     temp.add(i);
                     temp.add(j);
                     ans.add(temp);
                 }

            }
        }

    }
            return ans;
    }

    static boolean isPalindromic(String s)
    {
        int i = 0, j = s.length() - 1;
        while(i < j)
        {
            if(s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            }
            else return false;

        }
        return true;
    }
}