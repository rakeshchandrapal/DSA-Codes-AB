package GFG.Arrays.Arrays;

public class LL {


    public static Node moveToFront(Node head) {

        if(head.next == null) return head;
        Node cur = head;


        while(cur .next.next!= null)
        {
            cur = cur.next;
        }

        Node temp = cur.next;
        temp.next = head;
        cur.next = null;



        return temp;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(5);
        head.next.next = new Node(6);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);
        printLLGFG(head);
        head = moveToFront(head);
        printLLGFG(head);
    }
    public static void printLLGFG(Node head)
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println("NULL");
    }

}


class Node
{


    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}