package LinkedList.Basics;

//import org.w3c.dom.Node;


public class Strucure {
    static void  printLL(Node <Integer> head)
    {
        Node <Integer> cur = head;
        while(cur != null)
        {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println(" NULL ");
    }

    static Node<Integer> InsertionLL(int data,int position , Node<Integer> head)
    {
        Node <Integer>  newNode = new Node <>(data);
         if(position == 0)
        {
            newNode.next = head;
            head = newNode ;
            return head ;
        }

         Node <Integer> cur = head;
         for(int i = 0; i < position -1; i++)
         {
                cur = cur.next;
                if(cur == null) return head;
         }
         newNode.next = cur.next;
         cur.next = newNode;


         return head;
    }

    static Node<Integer> Deletion(int position , Node <Integer> head )
    {
        if(head == null) return head;
        if(position == 0)
        {
            head = head.next;
            return head;
        }
        Node <Integer> cur = head;

        for(int i = 0; i < position - 1 ; i++)
        {
            cur = cur.next;
        }
        cur.next = (cur.next).next;
         return  head;

    }

    static int findMiddle(Node <Integer> head)
    {
        Node <Integer> fast = head;
        Node <Integer> slow = head;

        while ( fast != null && fast.next != null )
        {
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow.data;

    }

    public static void main(String[] args) {

        Node <Integer> n1 = new Node <>(20);
        Node <Integer> n2 = new Node <>(10);
        Node <Integer> n4 = new Node <>(50);
        Node <Integer> n3 = new Node <>(40);
        Node <Integer> n5 = new Node <>(60 );
        Node <Integer> n6 = new Node <>(80);

        Node<Integer> head = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
//        n5.next = n6;

       printLL(head);
//       head = InsertionLL(100,6,head);
//       printLL(head);
//       head = Deletion(0,head);
//        printLL(head);
        System.out.println(findMiddle(head));

    }
}

class Node<T>
{
    T data;
    Node next;

   public   Node(T data)
    {
        this.data = data;

    }



}