package BinaryTreeBasics.Basics;

import java.util.Scanner;

public class binary_tree {
    Scanner sc = new Scanner(System.in);
    Node root;

    public void binaryTree()
    {
        sc = new Scanner(System.in);
    }

    public Node createBinaryTree()
    {
        System.out.println("Enter Root Node Data : ");
        int data = sc.nextInt();
        if(data == -1) return null;
        Node node = new Node(data);
        System.out.println("Enter "+data+"'s Left Data : ");
        node.left = createBinaryTree();
        System.out.println("Enter "+data+"'s Right Data : ");
        node.right = createBinaryTree();
        return node;
    }

    public void inOrderTraversal(Node root)
    {
        if(root == null) return;

        inOrderTraversal(root.left);
        System.out.println(root.data);
        inOrderTraversal(root.right);
    }

    public void preOrderTraversal(Node root)
    {
        if(root == null) return;

        System.out.println(root.data);
        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
    }
    public void postOrderTraversal(Node root)
    {
        if(root == null) return;

        inOrderTraversal(root.left);
        inOrderTraversal(root.right);
        System.out.println(root.data);
    }

    public int heightOfBinaryTree(Node root)
    {
        if(root == null) return  0;

        int lh = heightOfBinaryTree(root.left);
        int rh = heightOfBinaryTree(root.right);

        return Math.max(lh,rh) + 1;
    }
}

    class Node{
        int data;
        Node left,right;

        Node (int data){
            this.data = data;

        }
    }