package Queue.Basics;

import java.util.concurrent.ExecutionException;

public class Queue_Using_LL {

    private Node front,rear;


    int getFront () throws Exception
    {
        if(isEmpty()) throw new Exception("Queue IS EMPTY");
        return front.data;
    }

    void enqueue (int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;

    }

    int dequeue () throws Exception {
        if(isEmpty()) throw new Exception("Queue IS EMPTY");
        int ans = front.data;
        front = front.next;
        return ans;
    }

    boolean isEmpty()
    {
        return(front == null);
    }


    public static class Node{

        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }

    }



}