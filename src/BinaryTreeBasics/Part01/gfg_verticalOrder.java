package BinaryTreeBasics.Part01;


import java.util.*;

public class gfg_verticalOrder {



    static ArrayList <Integer> verticalOrder(Node root)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        if(root == null) return null;
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
        Queue<pair> q = new LinkedList<>();

        q.add(new pair(0,root));

        while(!q.isEmpty())
        {
            pair cur = q.poll();
            int key = cur.hd;

            if(!map.containsKey(key))
            {
                map.put(key,new ArrayList<Integer>());
            }
            map.get(key).add(cur.node.data);

            if(cur.node.left != null)
            {
                q.add(new pair(key - 1,cur.node.left));
            }
            if(cur.node.right != null)
            {
                q.add(new pair(key + 1, cur.node.right));
            }
        }

        for(ArrayList<Integer> em : map.values()  )
        {
            ans.addAll(em);
        }

        return ans;

    }

    static class pair {
        int hd;
        Node node;

        public pair(int hd, Node node) {
            this.hd = hd;
            this.node = node;
        }
    }
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }


}