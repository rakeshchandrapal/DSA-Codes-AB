package Daily_leet_code.Daily;
import java.util.*;
public class L1662 {
    public static void main(String[] args) {
        String [] s = {"A","BC"};
        String [] e = {"AB","C"};
//        System.out.println(arrayStringsAreEqual(s,e));
        int[]a = {1 ,2 ,3 ,1 ,4, 5 ,2 ,3 ,6};
        int k = 3;
        System.out.println(max_of_subarrays(a,a.length,k));

    }
    public static boolean  arrayStringsAreEqual(String[] word1, String[] word2) {

      String s1 = " ";
      String s2 = " ";
        for(String e : word1) s1 += e;
        for(String e : word2) s2 += e;
        return s1.equals(s2);
    }

    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        if(n < k) return new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());



        for(int i = 0; i < n ; i++){
            pq.add(arr[i]);
            if(i + 1 >= k) {
                ans.add(pq.peek());
                pq.remove(arr[i - k + 1]);
            }
        }
        return ans;

    }
}