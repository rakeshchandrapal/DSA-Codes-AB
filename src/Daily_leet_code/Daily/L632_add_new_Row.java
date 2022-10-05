package Daily_leet_code.Daily;

public class L632_add_new_Row {

    public static  class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }

    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1) return new TreeNode(val);
        if (root == null) return null;

        if (depth == 2) {
            TreeNode tmpL = root.left;
            root.left = new TreeNode(val);
            root.left.left = tmpL;
            tmpL = root.right;
            root.right = new TreeNode(val);
            root.right.right = tmpL;
        }
        addOneRow(root.left, val, depth - 1);
        addOneRow(root.right, val, depth - 1);

        return root;

    }
    }
}