package BinaryTreeBasics.Basics;

public class strucureBinaraayTreee {
    public static void main(String[] args) {
        binary_tree btr = new binary_tree();
        Node root =  btr.createBinaryTree();
       btr.inOrderTraversal(root);
    }
}