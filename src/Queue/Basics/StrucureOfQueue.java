package Queue.Basics;

public class StrucureOfQueue {
    public static void main(String[] args) throws Exception {
        Queue_Using_LL queue = new Queue_Using_LL();

        queue.enqueue(45);
        queue.enqueue(4);
        queue.enqueue(5);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());



    }
}