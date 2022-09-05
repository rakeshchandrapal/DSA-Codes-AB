package LinkedListClass.Basics;

public class Bubble {


    static void printL(node head)
    {
        node cur = head;
        while(cur != null)
        {
            System.out.print(cur.data +" --> ");
            cur = cur.next;
        }
        System.out.println(" NULL ");
    }


    static node SortLL(node head)
    {
        node cur = head;
        node cur2 ;
        while(cur.next != null) {
            cur2 = head;

            while (cur2.next != null) {

                if (cur2.data > cur2.next.data) {
                    int temp = cur2.data;
                    cur2.data = cur2.next.data;
                    cur2.next.data = temp;
                }
                cur2 = cur2.next;
            }
            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {
        node head = new node(100);
        node n1 = new node (50);
        node n2 = new node (30);
        node n3 = new node (20);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        printL(head);
        node newHead = SortLL(head);
        printL(newHead);

    }
static class node {
    int data;
    node next;

    public node(int data)
    {
        this.data = data;
    }
}
}