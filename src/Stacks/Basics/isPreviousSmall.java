package Stacks.Basics;

import java.util.ArrayDeque;
import java.util.Arrays;

public class isPreviousSmall {

    public static void main(String[] args) {
//            int [] a= {5,1,2,3,9,6,1,4,3};
                int []a = {4,1,3,5,2,1};
        System.out.println(Arrays.toString(previousSmall(a)));
    }

    public static int[] previousSmall(int[] a)
    {
        int []ans = new int[a.length];
        int i = 0;
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int e : a)
        {
            while ((!stack.isEmpty()) && stack.peek() >= e)
            {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = stack.peek();
            }
            i++;
            stack.push(e);

        }
            return ans;
     }
}