package HashSetInJava.Part_00;
import java.util.*;
import java.util.HashSet;

public class CountDistinctElement {

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,3,4,5,4,4,4,4,4,4,5,6,7};
//        System.out.println("In This Array We Have "+Count_Distinct_Element(arr) +" Distinct Element");
        countFrequqncy(arr);
    }

    public static void countFrequqncy(int[]arr )
    {
        Map<Integer,Integer> map  = new HashMap<>();
        for(int em : arr)
        {
            if(map.containsKey(em))
            {
                int temp = map.get(em);
                map.put(em,temp + 1);
            }
            else {
                map.put(em,1);
            }
        }
        System.out.println(map);

    }



    public static int Count_Distinct_Element(int[] arr)
    {
        HashSet<Integer> count = new HashSet<>();
        for(int em : arr)
        {
            count.add(em);
        }
        return count.size();
    }

}