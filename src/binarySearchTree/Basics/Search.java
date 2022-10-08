package binarySearchTree.Basics;
import java.util.*;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 3, 4, 5, 6, 7};
        System.out.println(printNonRepeated(arr, arr.length));
    }


  public static  boolean isPresentIterative(Node root,int key)
    {
        Node cur = root;

        while(cur != null)
        {
            if(cur.data == key) return true;
            if(key > cur.data ) cur = cur.right;
            else cur = cur.left;
        }
        return false;
    }

    public static boolean isPresent(Node root, int key) {
        if (root == null) return false;
        if (root.data == key) return true;

        if (root.data < key) return isPresent(root.right, key);
        return isPresent(root.left, key);
    }

    static ArrayList<Integer> printNonRepeated(int arr[], int n) {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int em : arr) {
            if (map.containsKey(em)) {
                int temp = map.get(em);
                map.put(em, temp + 1);
            } else {
                map.put(em, 1);
            }
        }

        for (int e : arr) {
            if (map.get(e) == 1 && map.containsKey(e)) {
                ans.add(e);
            }
        }
        return ans;

    }

    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
        }
    }
}