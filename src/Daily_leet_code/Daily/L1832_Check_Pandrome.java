package Daily_leet_code.Daily;

import java.util.*;

public class L1832_Check_Pandrome {

    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }
    public  static boolean checkIfPangram(String sentence) {
        if(sentence.length() < 26) return false;
        Set <Character> set = new HashSet<>();
        for(int i = 97; i <= 122; i++) set.add((char)i);


        for(int i = 0; i < sentence.length(); i++)
        {
            char cur = sentence.charAt(i);
            set.remove(cur);
            if(set.isEmpty()) return true;
        }
    return false;
    }

}