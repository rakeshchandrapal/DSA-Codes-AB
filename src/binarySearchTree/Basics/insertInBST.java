package binarySearchTree.Basics;

import BinaryTreeBasics.TreeNode;

public class insertInBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode parent  = null, cur = root;

        while(cur != null)
        {
            if(val  > cur.val) {
                parent = cur;
                cur = cur.right;
            }
            else if(val < cur.val)
            {
                parent = cur;
                cur = cur.left;
            }
        }

        TreeNode ans = new TreeNode(val);
        if(parent == null) return ans;

        if(parent.val > ans.val) parent.left = ans;
        else parent.right = ans;
        return root;
    }

    public TreeNode insertIntoBST2(TreeNode root, int val) {

        if(root == null ) return new TreeNode(val);

        if(val > root.val) root.right = insertIntoBST2( root.right,val);
        else root.left =  insertIntoBST2(root.left,val);
        return root;
    }
}