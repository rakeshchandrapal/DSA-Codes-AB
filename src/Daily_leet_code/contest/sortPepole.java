package Daily_leet_code.contest;


import java.util.*;

public class sortPepole {

    public static void main(String[] args) {
        String[] a = {"Mary", "John", "Emma"};

        int[] b = {180, 165, 170};
        System.out.println(Arrays.toString(sortPeople(a, b)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {

        HashMap<Integer, String> map = new HashMap<>();

        for(int i = 0; i < heights.length; i++)
        {
            if(!map.containsKey(heights[i]))
            {
                map.put(heights[i],names[i] );
            }
        }
        Arrays.sort(heights);
        reverse(heights);

        String[] ans = new String[heights.length];

        for(int k = 0; k < heights.length; k++)
        {
            if(map.containsKey(heights[k]))
            {
                ans[k] = map.get(heights[k]);
            }
        }
        return ans;
    }

    public static void reverse(int[] array) {
        if (array == null) {
            return;
        }
        int i = 0;
        int j = array.length - 1;
        int tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
    }
}