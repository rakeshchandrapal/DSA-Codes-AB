package BinaryTreeBasics.Part02;

import BinaryTreeBasics.TreeNode;

public class DiameterOfBinaryTree {

    static int a;
    public static void main(String[] args) {

    }

    public static int diameterOfBinaryTree(TreeNode root)
    {
//        if(root == null) return 0;
//
//        int ld = diameterOfBinaryTree(root.left);
//        int rd = diameterOfBinaryTree(root.right);
//
//        int lh = height(root.left);
//        int rh = height(root.right);
//
//        int cur = lh + rh;
//
//        return Math.max(cur , Math.max(ld ,rd));

        height(root);
        return a;

    }

    static int height(TreeNode root )
    {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) + 1;
    }

    static int height2(TreeNode root )
    {
        if(root == null) return 0;

        int lh = height(root.left);
        int rh = height(root.right);
        a = Math.max(lh+rh,a);
        return Math.max(lh,rh) + 1;
    }
}