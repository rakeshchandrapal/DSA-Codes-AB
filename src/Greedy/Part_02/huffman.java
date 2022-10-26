package Greedy.Part_02;


import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Node {
    char c;
    int f;
    Node left,right;
    Node(char c, int f,Node left,Node right){
        this.c = c;
        this.f = f;
        this.left = left;
        this.right= right;
    }
}


public class huffman {
    public static void main(String[] args) {
        char[] c = {'a','b','c','d'};
        int[] f = {5,3,2,1};
        Node root = huffmanEncoding(c,f);

        Map<Character,String> map = new HashMap<>();
        traversal(root,"",map);
        System.out.println(map);
    }

    static Node huffmanEncoding(char[] c , int[] f){
        PriorityQueue<Node> pq = new PriorityQueue<>((n1,n2) -> n1.f - n2.f);
        int n = c.length;
        for(int i = 0; i < n; i++) pq.add(new Node(c[i],f[i],null,null));

        while(pq.size() > 1){
            Node left = pq.poll();
            Node right = pq.poll();
            Node newNode = new Node('$', left.f + right.f,left,right);
            pq.add(newNode);
        }
        return pq.poll();
    }

   static  void traversal(Node root, String s, Map<Character,String > map){
        if(root == null) return;
        if(root.left == null && root.right == null) {
            map.put(root.c,s); return;
        }
        traversal(root.left,s+"0",map);
        traversal(root.right,s+"1",map);
    }
}