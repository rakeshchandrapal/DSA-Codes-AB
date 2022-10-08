package BinaryTreeBasics.LeetCode;



public class flattenTree {

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(4);
        root.right.left = new Node(2);
        root.right.left.right = new Node(5);
        flatten(root);
    }
    public static void flatten(Node root)
    {
        //code here
        if(root == null) return;

        if(root.left == null && root.right == null ) return;

        if(root.left != null)
        {
            flatten(root.left);
            Node temp = root.right;
            root.right = root.left;
            root.left = null;
            Node cur = root.right;
            while(cur.right != null)
            {
                cur = cur.right;
            }
            cur.right = temp;
        }
        flatten(root.right);
    }

static class  Node {
        int data;
        Node left,right;
        Node (int data)
        {
            this.data = data;
        }
}


}