package LinkedList.Part__01;



public class ReversedLLK {


    static void printLLInt(Node head)
    {
        Node cur = head;
        while(cur != null)
        {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println(" NULL ");
    }
    public static void main(String[] args) {


        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(4);
        head.next.next.next = new Node(6);
        head.next.next.next.next = new Node(7);
        head.next.next.next.next.next = new Node(8);
        head.next.next.next.next.next.next = new Node(9);
        head.next.next.next.next.next.next.next = new Node(10);
        printLLInt(head);
        Node newhead = reversedK(head , 3);
        printLLInt(newhead);





    }

    static Node reversedK(Node head,int k)
    {
        Node cur = head,prevFirst = null , newHead = null;
        while(cur != null)
        {
            int count = 0;
            Node prev = null,first = cur;

            while(cur != null && count < k)
            {
                Node temp = cur.next;
                cur.next = prev;
                prev = cur;
                cur = temp;
                count++;
            }

            if(newHead == null)
            {
                newHead = prev;
            }
            else {
                prevFirst.next = prev;
            }
            prevFirst = first;
        }

        return newHead;
    }



    static class Node {
        int data ;
        Node next;

        Node(int data)
        {
            this.data = data;
        }

    }
}