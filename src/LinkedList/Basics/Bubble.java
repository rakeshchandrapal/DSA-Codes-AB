package LinkedList.Basics;

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
//        node cur = head;
        node cur2 = head;
        while(cur2.next != null)
        {

                if(cur2.data > cur2.next.data)
                {
                    node temp = cur2;
                    cur2 = cur2.next;
                    cur2.next = temp;
                }
                cur2 = cur2.next;
            }

        return head;
    }

    public static void main(String[] args) {
        node head = new node(10);
        node n1 = new node (50);
        node n2 = new node (30);
        node n3 = new node (20);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        printL(head);
        head = SortLL(head);
        printL(head);

    }
}
class node {
    int data;
    node next;

    node(int data)
    {
        this.data = data;
    }
}