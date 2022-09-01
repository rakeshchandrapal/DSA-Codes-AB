package HashSetInJava.Part_00;
import java.util.*;

public class pairWithGivenSum {

    public static void main(String[] args) {
        int[] arr = {1,2,-1,3,4,5,6,7};
        int sum = 1;
        pair(arr,sum);
    }

    public static void pair(int[] arr,int sum)
    {
        boolean check = true;
        Set<Integer> set = new HashSet<>();
        for(int i : arr)
        {
            int com = sum - i;
            if(set.contains(com))
            {
                check = false;
                System.out.println("The Two Values is = "+i+" and "+ com);
            }
            set.add(i);
        }
        if(check)
        {
            System.out.println("The Pair Is Not available In This Array ");
        }

    }


}