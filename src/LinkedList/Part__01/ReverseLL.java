package LinkedList.Part__01;

public class ReverseLL {

    public static void main(String[] args) {

        Node <Integer> n1 = new Node<>(10);
        Node <Integer> n2 = new Node<>(20);
        Node <Integer> n3 = new Node<>(30);
        Node <Integer> n4 = new Node<>(40);
        Node <Integer> n5 = new Node<>(50);
        Node <Integer> n6 = new Node<>(60);


        Node <Integer> head = n1;




    }

    public static Node<Integer> reverseLinkedList(Node <Integer> head)
    {

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