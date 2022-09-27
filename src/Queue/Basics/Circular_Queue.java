package Queue.Basics;

public class Circular_Queue {
     int rear;
     int front;
    int a[];
    int n ;

    Circular_Queue(int capacity)
    {
        n = capacity;
        a = new int[n];
        front = rear = -1;
    }

    public  void enqueue(int data) throws Exception {
        if(isFull()) throw new Exception("Queue Is Full ");
        if(isEmpty())front  = 0;
        rear = (rear + 1 )% n;
        a[rear] = data;
    }

    public int dequeue() throws Exception {
        if(isEmpty()) throw new Exception("Queue Is Empty ");
        int ans ;
        if(front == rear)
        {
            ans = a[front];
            front = rear = -1;
            return ans;
        }

        ans = a[front];
        front = (front + 1 )% n;
        return ans;
    }

    private boolean isFull() { return  (rear + 1)% n == front; }
    private boolean isEmpty() { return front == - 1;}

    int getsize() {  return  isEmpty() ? 0 : ( n - front + rear ) % n + 1; }
}