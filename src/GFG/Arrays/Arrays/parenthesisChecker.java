package GFG.Arrays.Arrays;

import java.util.ArrayDeque;

public class parenthesisChecker {

    public static void main(String[] args) {
        System.out.println(ispar("]]]]]"));


    }
    static boolean ispar(String x) {

        // add your code here
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < x.length(); i++ )
        {
            char cur = x.charAt(i);
            if(cur == '(' || cur == '{' || cur == '[')
            {
                stack.push(cur);
                continue;
            }

            if(stack.isEmpty()) return false;

            char check ;
            switch (cur)
            {
                case ')' :
                    check = stack.pop();
                    if(check == '{' || check == '[') return false;
                    break;

                case '}' :
                    check = stack.pop();
                    if(check == '(' || check == '[') return false;
                    break;

                case ']' :
                    check = stack.pop();
                    if(check == '{' || check == '(') return false;
                    break;
            }

        }
        return stack.isEmpty();
    }

}