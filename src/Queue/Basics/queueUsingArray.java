package Queue.Basics;

public class queueUsingArray {

    int a[];
    int front ,rear;
    int n;

    public queueUsingArray(int n)
    {
        a = new int[n];
        this.n = n;
        front = -1;
        rear = -1;
    }

    void enqueue (int data) throws Exception
    {
        if(front == -1)
        {
            front++;
            a[front] = data;

        }
        if(rear == n-1)  throw new Exception("Queue IS FULL!!");
        rear++;
        a[rear] = data;

    }

    boolean isEmpty()
    {
        return front == -1;
    }

    int dequeue() throws Exception{
        if(isEmpty()) throw new Exception ("Stack IS EMPTY!!");
        int ans = a[front];
        return ans;
    }

}