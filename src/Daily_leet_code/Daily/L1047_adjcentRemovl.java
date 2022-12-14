package Daily_leet_code.Daily;

import java.util.ArrayDeque;

public class L1047_adjcentRemovl {
    public static void main(String[] args) {

        String s = "abbaca";
        System.out.println(removeDuplicates(s));
    }
    public static  String removeDuplicates(String s) {

//        if(s.length() <= 1) return s;
        ArrayDeque<Character> stack = new ArrayDeque<>();
//        stack.push(s.charAt(0));

        for(int i = 0; i < s.length(); i++){
            char cur = s.charAt(i);
            if(!stack.isEmpty() && stack.peek() == cur){
                stack.pop();
            }
            else{
                stack.push(cur);
            }
        }

        StringBuilder ans = new StringBuilder("");
        while(!stack.isEmpty()){
            ans.append(stack.pop());
        }
        return ans.reverse().toString();
    }
}