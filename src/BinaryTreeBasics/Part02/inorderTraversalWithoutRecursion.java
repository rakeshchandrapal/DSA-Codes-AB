package BinaryTreeBasics.Part02;

import BinaryTreeBasics.TreeNode;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class inorderTraversalWithoutRecursion {

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

//        System.out.println(inorderTraversal(root));
//        System.out.println(preorderTraversal(root));
        System.out.println(postorderTraversal(root));
    }
    public static  List<Integer> inorderTraversal(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        TreeNode cur = root;
        while(cur != null || !stack.isEmpty())
        {

            while(cur != null)
            {
                stack.push(cur);
                cur = cur.left;
            }

            TreeNode popedElement = stack.pop();
//            ans.add(popedElement.val);
            System.out.println(popedElement.val);
            cur = popedElement.right;

        }
        return ans;
    }

    public static List<Integer> preorderTraversal(TreeNode root)
    {
        List <Integer> ans = new ArrayList<>();
        if(root == null) return ans;
        ArrayDeque<TreeNode> stack = new ArrayDeque<>();

        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode Element = stack.pop();
            ans.add(Element.val);
            if(Element.right != null) { stack.push(Element.right); }
            if(Element.left != null )  { stack.push(Element.left); }
        }
        return ans;
    }

    public static List<Integer> postorderTraversal(TreeNode root)
    {
        List<Integer> ans = new ArrayList<>();
        ArrayDeque<TreeNode> s1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> s2 = new ArrayDeque<>();

        s1.push(root);
        while(!s1.isEmpty())
        {
            TreeNode poped = s1.pop();
            s2.push(poped);

            if(poped.left != null) s1.push(poped.left);
            if(poped.right != null) s1.push(poped.right);
        }

        while (!s2.isEmpty())
        {
            ans.add(s2.pop().val);
        }
        return ans;
    }

}