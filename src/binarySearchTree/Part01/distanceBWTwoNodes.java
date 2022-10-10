package binarySearchTree.Part01;

import binarySearchTree.TreeNode;

public class distanceBWTwoNodes {


    public static int distance(TreeNode root, int a) {
        if (root == null || root.val == a) return 0;
        if (a < root.val) return 1 + distance(root.left, a);
        return 1 + distance(root.right, a);
    }


    public static int distanceBWTwoNodes(TreeNode root, int a, int b) {
        if (root == null) return 0;

        if (a < root.val && b < root.val) {
            return distanceBWTwoNodes(root.left, a, b);
        }
        if (a > root.val && b > root.val) {
            return distanceBWTwoNodes(root.right, a, b);
        }

        return distance(root,a) + distance(root,b);
    }

}