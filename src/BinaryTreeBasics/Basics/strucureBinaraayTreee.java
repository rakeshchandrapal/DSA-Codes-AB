package BinaryTreeBasics.Basics;

import javax.swing.tree.TreeNode;
import java.util.*;

public class strucureBinaraayTreee {
    public static void main(String[] args) {
        binary_tree btr = new binary_tree();
        Node root =  btr.createBinaryTree();
       btr.inOrderTraversal(root);
    }

//    public List<List<Integer>> levelOrder (TreeNode root)
//    {
//        List<List<Integer>> ans = new ArrayList<>();
//        ArrayDeque<TreeNode> q = new ArrayDeque<>();
//        q.add(root);
//        q.add(null);
//
//        while(!q.isEmpty())
//        {
//            TreeNode cur = q.poll();
//            if()
//        }
//
//
//    }
}