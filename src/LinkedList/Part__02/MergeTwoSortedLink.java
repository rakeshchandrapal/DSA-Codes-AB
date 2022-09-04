package LinkedList.Part__02;

public class MergeTwoSortedLink {
    public static void main(String[] args) {

            Node h1 = new Node(2);
            h1.next = new Node (4);
            h1.next.next = new Node(6);
            h1.next.next.next = new Node(8);

            Node h2 = new Node(1);
            h2.next = new Node (3);
            h2.next.next = new Node(9);
            h2.next.next.next = new Node(10);
            h2.next.next.next.next = new Node(20);

            Node newhead = mergedTwoLL(h1,h2);
            PRINTLL(newhead);

    }
    public  static void PRINTLL(Node Head)
    {
            Node cur = Head;
            while(cur != null)
            {
                System.out.print(cur.data + " --> ");
                cur = cur.next;
            }
            System.out.println("NULL");

    }
    public static Node mergedTwoLL(Node head1,Node head2)
    {
        if(head1 == null) return  head2;
        if(head2 == null) return head1;

        Node head = null,tail = null;
        Node a = head1, b = head2;

        if(a.data < b.data)
        {
            head = a;
            tail = a;
            a = a.next;
        }
        else {
            head = b;
            tail = b;
            b = b.next;
        }

        while (a != null && b != null)
        {
            if(a.data < b.data)
            {
                tail.next = a;
                tail = a;
                a = a.next;
            }
            else {
                tail.next = b;
                tail = b;
                b = b.next;
            }
        }
        if(a == null) tail.next = b;
        if(b == null) tail.next = a;
        return head;
    }

}


class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data ;
    }
}