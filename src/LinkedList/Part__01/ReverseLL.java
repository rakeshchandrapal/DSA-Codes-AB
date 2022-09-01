package LinkedList.Part__01;

public class ReverseLL {

    public static void main(String[] args) {

        Node <Integer> head = new Node<>(10);
        head.next = new Node<>(20);
        head.next.next = new Node<>(30);
        head.next.next.next = new Node<>(40);

    }

    public static Node<Integer> reverseLinkedList(Node <Integer> head)
    {
        return new Node<>(10);
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