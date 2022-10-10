package binarySearchTree.Part01;

import binarySearchTree.TreeNode;

import java.util.*;
import java.util.Set;

public class Two_Sum {



     public static  boolean findTarget(TreeNode root, int k) {
         Set<Integer> set = new HashSet<>();
         return findTarget(root,k,set);
    }

    public static boolean findTarget(TreeNode root,int k ,Set<Integer> set)
    {
        if(root == null) return false;


        if(!set.contains(root.val)) set.add(root.val);
        if(set.contains(k - root.val)) return true;
        return ( findTarget(root.left,k,set) ||  findTarget(root.right,k,set));

    }


}