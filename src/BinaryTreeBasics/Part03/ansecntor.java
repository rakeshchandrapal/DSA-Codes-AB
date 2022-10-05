package BinaryTreeBasics.Part03;

//import BinaryTreeBasics.Node
import java.util.*;


public class ansecntor {


    public static class   Node {
        public int data;
        public Node left, right;

        Node(int key) {
            data = key;
            left = right = null;
        }

    }

   static  Node head = null;
    static Node prev = null;
    Node botdLL(Node root)
    {
        botdLLutil(root);
        return head;
    }

    public static void  botdLLutil(Node root) {
        if(root == null ) return ;

        botdLLutil(root.left);

        if(prev == null)
        {
            head = root;
        }
        else{
            root.left = prev;
            prev.right = root;

        }
        prev = root;
        botdLLutil(root.right);
    }


    public static ArrayList<Integer> Ancestors(Node root, int target)
    {
        // add your code here

        ArrayList<Integer> ans = new ArrayList<>();
        isPresent(root ,target,ans);
        return ans;


    }

    public static boolean isPresent(Node root , int target , ArrayList<Integer> ans )
    {
        if(root == null) return false;
        if(root.data == target) return true;

        if(isPresent(root.left,target,ans) || isPresent(root.right , target,ans))
        {
            ans.add(root.data);
            return true;
        }
        return false;

    }
}