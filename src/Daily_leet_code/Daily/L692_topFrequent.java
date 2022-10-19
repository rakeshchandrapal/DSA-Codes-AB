package Daily_leet_code.Daily;
import MyImplementation.MyComparator;
import com.sun.source.tree.Tree;

import java.util.*;

public class L692_topFrequent {




    public List<String> topKFrequent(String[] words, int k) {

        Map<String, Integer> map = new TreeMap<>();
        for(String s : words){
            if(map.containsKey(s)){
                int n = map.get(s);
                map.put(s,n+1);
            }else map.put(s,1);
        }
        List<Map.Entry<String, Integer>> list = new LinkedList<>(map.entrySet());
        Collections.sort(list, new MyComparator());
        List<String> ans = new LinkedList<>();
        for(int i = 0; i < k - 1; i++)
        {
            ans.add(list.get(i).getKey());
        }
        return ans;
    }
}