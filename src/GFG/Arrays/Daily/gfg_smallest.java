package GFG.Arrays.Daily;

import java.util.*;

public class gfg_smallest {

    public static void main(String[] args) {
        int a[] = {1, 5, 0, 3, 4, 5};
        System.out.println(leftSmaller(a.length,a));
    }
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for(int em : a)
        {
            while(!stack.isEmpty() && stack.peek() >= em)
            {
                stack.pop();
            }
            if(stack.isEmpty() )
            {
                ans.add(-1);
            }
            else{
                ans.add(stack.peek());
            }
            stack.push(em);

        }
        return ans;
    }
}