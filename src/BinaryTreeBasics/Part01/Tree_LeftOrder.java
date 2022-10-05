package BinaryTreeBasics.Part01;

import BinaryTreeBasics.TreeNode;

import java.util.ArrayList;

public class Tree_LeftOrder {

    public static void main(String[] args) {
        TreeNode root  = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.left.right.right = new TreeNode(9);
        root.left.left = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.left.right = new TreeNode(10);
        root.left.left.left.left = new TreeNode(15);
        root.right.left = new TreeNode(7);
        System.out.println(printLeftView(root));
    }

    public static ArrayList<Integer> printLeftView(TreeNode root )
    {
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;
        int level = 0;

        helper(level,root,list);
        return list;
    }

    public static void helper(int level,TreeNode root,ArrayList<Integer> list)
    {
        if(root == null) return;

        if(level == list.size())
        {
            list.add(root.val);
        }
        helper(level + 1, root.left,list);
        helper(level + 1,root.right,list);

    }


}