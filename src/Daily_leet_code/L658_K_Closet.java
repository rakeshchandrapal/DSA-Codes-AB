package Daily_leet_code;
import javax.swing.*;
import java.util.*;

public class L658_K_Closet {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5};
        int x = 5;
        int k = 4;
        System.out.println(findClosestElements(arr,k,x));
    }

    static  List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ans = new ArrayList<>();
        int low = 0;
        int high = arr.length - 1;

        while(high - low >= k)
        {
          if(Math.abs(arr[low] - x) > Math.abs(arr[high] - x))
          {
              low++;
          }
          else {
              high--;
          }
        }

        for(int index = low; index <= high;index++)
        {
            ans.add(arr[index]);
        }

        return ans;
    }
}