package GFG.Arrays.Daily;

import java.text.CollationElementIterator;
import java.util.*;

public class ReplaceEveryElement {
    public static void main(String[] args) {
        int[] arr = {8, 58, 71, 18, 31, 32, 63, 92, 43, 3, 91, 93, 25, 80, 28};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
//        {18, 63, 80, 25, 32, 43, 80, 93, 80, 25, 93, -1, 28, -1, -1}

       
    }
}