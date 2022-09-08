package Stacks.Part_01;

import java.util.ArrayDeque;

public class Infix_To_PostFix {
    public static void main(String[] args) {


        String s = new String("(2+3)/(6/2-7+8)");
        System.out.println(s);
        StringBuilder ans = new StringBuilder(infixToPostfix(s));
        System.out.println(ans);

            String s1 = ans.toString();
        System.out.println(evaluationOfPostfix(s1));

    }


    public static int precedence(char c)
    {
        if(c == '+' || c == '-') return 1;
        else if( c == '*' || c == '/') return 2;
        else return -1;
    }

    public static boolean isOperator(char c)
    {
        return (c == '+' || c == '-' || c == '*' || c == '/' );
    }

    public static String infixToPostfix(String s)
    {
        StringBuilder ans = new StringBuilder();
        ArrayDeque<Character>stack = new ArrayDeque<>();

        for(int i = 0 ; i < s.length(); i++)
        {
            char cur = s.charAt(i);

            if(cur == '(')
            {
                stack.push(cur);
            }
            else if(  cur == ')')
            {
                while( !stack.isEmpty() && stack.peek() != '(' )
                {
                    if(precedence(cur) <= precedence(stack.peek()))
                    {
                        ans.append(stack.pop());
                    }

                }
                stack.pop();

            }
            else if(isOperator(cur))
            {
                while(!stack.isEmpty() && precedence(cur) <= precedence(stack.peek()))
                {
                    ans.append(stack.pop());
                }
                stack.push(cur);

            }

            else
            {
                ans.append(cur);
            }
        }
        while(!stack.isEmpty())
        {
            ans.append(stack.pop());
        }
        return ans.toString();
    }


    public static int calculator(int f,int s,char op)
    {
        return switch (op) {
            case '+' -> f + s;
            case '-' -> f - s;
            case '*' -> f * s;
            case '/' -> f / s;
            default -> 0;
        };
    }
    public static int evaluationOfPostfix(String s)
    {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int l = s.length();
        for(int i = 0 ; i < l ; i++)
        {
            char cur = s.charAt(i);
            if(isOperator(cur))
            {
                int second = stack.pop();
                int first = stack.pop();
                int ans = calculator(first,second,cur);
                stack.push( ans);
            }
            else {
                int element = cur - 0;
                stack.push(element);
            }
        }
        return stack.pop();
    }




}