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
        if(isFull())  throw new Exception("Queue IS FULL!!");
        rear++;
        a[rear] = data;

    }

    boolean isEmpty() { return rear == -1; }
    boolean isFull(){ return rear == n - 1; }

    int dequeue() throws Exception{
        if(isEmpty()) throw new Exception ("Queue IS EMPTY!!");

        int ans = a[front];
        for(int i = front; i < rear; i++){ a[i] = a[i+1]; }
        rear--;
        return ans;
    }

}