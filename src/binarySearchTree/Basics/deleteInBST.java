package binarySearchTree.Basics;

import BinaryTreeBasics.TreeNode;

public class deleteInBST {
    public TreeNode deleteNode(TreeNode root, int key)
    {
        TreeNode cur = root,parent = null;

        while(cur != null)
        {
            if(cur.val == key) break;
            else if(key > cur.val) {
                parent = cur;
                cur = cur.right;
            }
            else {
                parent = cur;
                cur = cur.left;
            }
        }
        if(cur == null) return root;
        return root;
    }

}