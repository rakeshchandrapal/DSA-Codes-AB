package LinkedList.Part__01;

public class ReverseLL {
    public static Node reverseRecursively(Node <Integer>  head) {
        if (head == null || head.next == null) return head;

        Node<Integer> temp = head.next;
        Node<Integer> newHead = reverseRecursively(head.next);
        temp.next = head;
        head.next = null;
        return newHead;
    }
    public static void main(String[] args) {

        Node<Integer> head = new Node<>(10);
        head.next = new Node<>(20);
        head.next.next = new Node<>(30);
        printLL(head);
        head = reverseRecursively(head);
//        head = reverseLinkedList(head);
        printLL(head);


    }


    public static Node<Integer> reverseLinkedList(Node <Integer> head)
    {
        Node <Integer> cur = head,prev = null;

        while (cur != null)
        {
            Node <Integer> temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;

    }
    public static void printLL(Node<Integer> head)
    {
        Node<Integer> cur = head;
        while(cur != null)
        {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println(" Null ");

    }



}

class Node <t>
{
    t data;
    Node next;

    Node (t data)
    {
        this.data = data;
    }

}