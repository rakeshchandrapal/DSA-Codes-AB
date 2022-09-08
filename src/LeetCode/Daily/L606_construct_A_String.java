package LeetCode.Daily;

import java.util.ArrayDeque;

public class L606_construct_A_String {

    public static void main(String[] args) {

    }

    public String tree2str(TreeNode root) {
        String ans = new String("f");
        return ans;
    }

    static StringBuilder preOrderTraversal(TreeNode root, StringBuilder s) {
        if (root == null) return s;

        ArrayDeque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                s.append(current.val);
                s.append('(');
                stack.push(current);
                current = current.left;
            }

            current = stack.pop();

            current = current.right;
        }
        return new StringBuilder("fuck");
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        public TreeNode(int val) {this.val = val;}
    }
}