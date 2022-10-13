package LeetCode.Topic;

import java.util.*;

public class L32_vaildParenthesisi {
    public int longestValidParentheses(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char []str = s.toCharArray();

        for(char c : str)
        {
            stack.push(c);
        }

        return 0;
    }
}