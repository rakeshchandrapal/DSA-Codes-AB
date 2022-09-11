package Stacks.Part_02;

import java.util.ArrayDeque;
import java.util.Arrays;

public class maxAreaOfHistrogram {


    public static void main(String[] args) {
        int []a = {4,3,9,2,5,1,8,3};
        int [] ps = previousSmall(a);
        System.out.println(Arrays.toString(ps));
    }
    public static int[] previousSmall(int[] a)
    {
        int []ans = new int[a.length];

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < a.length; i++)
        {
            int e = a[i];
            while ((!stack.isEmpty()) && a[stack.peek()] >= e)
            {
                stack.pop();
            }
            if(stack.isEmpty()) {
                ans[i] = -1;
            }
            else {
                ans[i] = stack.peek();
            }

            stack.push(i);

        }
        return ans;
    }
}