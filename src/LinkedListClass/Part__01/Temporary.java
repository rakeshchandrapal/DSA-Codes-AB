package LinkedListClass.Part__01;

public class Temporary {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(9);
        root.right = new TreeNode(3);
        root.right.left = new TreeNode(6);
        System.out.println(goodNodes(root));
    }

    static int goodNodes(TreeNode root) {
        if (root == null || (root.left == null && root.right == null)) return 1;
        int max = root.val;
//        int count = 0;
        isGood(root, max);
        return count;
    }

    static int count = 0;

    static void isGood(TreeNode root, int max) {
        if (root == null) return;
        if (root.val >= max) {
            count++;
            max = root.val;
        }
//        max = root.val;
        isGood(root.left, max);
        isGood(root.right, max);
    }

    static class TreeNode {
        int val;
        TreeNode left, right;
        public TreeNode(int val) {this.val = val;}
    }
}