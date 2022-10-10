package binarySearchTree.Part01;

import binarySearchTree.TreeNode;

public class ISBST {

    public boolean isValidBST(TreeNode root) {

        return utilHelper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    public boolean utilHelper(TreeNode root, long minvalue,long maxvalue)
    {
        if(root == null) return true;

        if(root.val <= minvalue || root.val > maxvalue) return false;

        return utilHelper(root.left,minvalue,root.val) && utilHelper(root.right ,root.val,maxvalue);
    }

}