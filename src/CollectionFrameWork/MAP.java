package CollectionFrameWork;

import java.util.HashMap;
import java.util.*;

public class MAP {

    public static void main(String[] args) {
        Map <String,Integer> map = new HashMap<>();
        map.put("Ball ",4);
        map.put("Wicket",6);
        map.put("Bat",2);
        map.put("Wicket",9);
        map.putIfAbsent("Bat",4);

        System.out.println(map);

        Set<Map.Entry<String,Integer>> entries = map.entrySet();

        for(Map.Entry<String,Integer> ele : entries)
        {
            System.out.println(ele.getKey());
            System.out.println(ele.getValue());

        }



    }
}