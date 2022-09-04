package LeetCode.Topic;
import java.util.*;
import java.util.HashMap;

public class L6167_Contest {

    public static void main(String[] args) {

        int a[] = {0,0,0,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1};
        String s ="zz";
        System.out.println(checkDistances(s,a));
    }

    public static  boolean checkDistances(String s, int[] distance) {


        HashMap<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length() ; i++)
        {
            if(map.containsKey(s.charAt(i)))
            {
                int index = i - map.get(s.charAt(i)) - 1  ;
                map.put(s.charAt(i),index);
            }
            else
            {
                map.put(s.charAt(i),i);
            }
        }

        for(int k = 0; k < distance.length; k++)
        {
            char t = (char) (97 +k);
            System.out.println(t);
            if(map.containsKey(t))
            {
                if(distance[k] == map.get(t))
                {

                }
                else {
                    return  false;
                }
            }


        }
        return true;


    }

}