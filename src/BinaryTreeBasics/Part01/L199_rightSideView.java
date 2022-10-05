package BinaryTreeBasics.Part01;

import BinaryTreeBasics.TreeNode;

import java.util.*;

public class L199_rightSideView {

    public List<Integer> rightSideView(TreeNode root) {
            List<Integer> ans = new ArrayList<>();
            int level = 0;
            helper(root,level,ans);
            return ans;
    }

    public void helper(TreeNode root,int level , List<Integer> ans )
    {
        if(root == null) return;
        if(level == ans.size()) ans.add(root.val);

        helper(root.right,level + 1,ans);
        helper(root.left,level + 1,ans);

    }
}