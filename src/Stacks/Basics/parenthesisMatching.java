package Stacks.Basics;

import java.util.ArrayDeque;

public class parenthesisMatching {

    public static void main(String[] args) {

        String s = "Ra<k{esh> {} (fjuhf)";
        System.out.println(IsMatchingParenthesis(s));
    }

    static boolean IsMatchingParenthesis(String s)
    {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for(int i = 0; i < s.length();i++)
        {
            char cur = s.charAt(i);
            if(cur == '{' || cur == '(' || cur == '<'|| cur == '[')
            {
                stack.push(cur);
                continue;
            }
            if(cur == '}' || cur == ')' || cur == '>'|| cur == ']')
            {
                if(stack.isEmpty()) return false;
            }

            char top ;
            switch (cur) {
                case '}' -> {
                    top = stack.pop();
                    if (top != '{') return false;
                }
                case ')' -> {
                    top = stack.pop();
                    if (top != '(') return false;
                }
                case '>' -> {
                    top = stack.pop();
                    if (top != '<') return false;
                }
                case ']' -> {
                    top = stack.pop();
                    if (top != '[') return false;
                }
            }
    }
        return stack.isEmpty();
    }
}