package Daily_leet_code.Daily;
public class L622_implementCircularQueue {



    public static  void main(String[] args) {
        MyCircularQueue q = new MyCircularQueue(6);
        System.out.println(q.enQueue(6));
        System.out.println(q.Rear());
        System.out.println(q.Rear());
        System.out.println(q.deQueue());
        System.out.println(q.enQueue(5));
        System.out.println(q.Rear());
        System.out.println(q.deQueue());
        System.out.println(q.Front());//
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());
        System.out.println(q.deQueue());

/* ["MyCircularQueue","enQueue","Rear","Rear","deQueue","enQueue","Rear","deQueue","Front","deQueue","deQueue","deQueue"]
[[6],[6],[],[],[],[5],[],[],[],[],[],[]] */

    }
    static class MyCircularQueue {

        int[] a;
         private int front ,rear;
        int n ;


        public MyCircularQueue(int k) {
            a = new int[k];
            front = rear = -1;
            n = k;
        }

        public boolean enQueue(int value) {
            if(isFull()) return false;
            if(front == -1)
            {
                front = 0;
            }
                rear = (rear + 1) % n ;
                a[rear] = value;
                return true;
        }

        public boolean deQueue() {
            if(isEmpty()) {
                return false;
            }
                if(front == rear)
                {
                    front = -1;
                    rear = -1;
                    return true;
                }
                front = (front + 1 )% n;
                return true;
        }

        public int Front() {
            if(isEmpty()){ return -1; }
                return a[front];
        }

        public int Rear() {
            if(isEmpty()) return -1;
            return a[rear];
        }

        public boolean isEmpty() {
            return (front == -1);
        }

        public boolean isFull() {
                return(front == (rear + 1) % n);
         }
 }

/*
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */
}