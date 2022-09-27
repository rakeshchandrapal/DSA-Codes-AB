package Queue.Basics;

public class StrucureOfQueue {
    public static void main(String[] args) throws Exception {
//        Queue_Using_LL queue = new Queue_Using_LL();
//
//        queue.enqueue(45);
//        queue.enqueue(4);
//        queue.enqueue(5);
//
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());

//        queueUsingArray qa = new queueUsingArray(5);
//        qa.enqueue(15);
//        qa.enqueue(10);
//        qa.enqueue(20);
//        qa.enqueue(45);
//        qa.enqueue(456);
////        qa.enqueue(4567);
//
//        System.out.println(qa.dequeue());
//        System.out.println(qa.dequeue());
//        System.out.println(qa.dequeue());
//        System.out.println(qa.dequeue());
//        System.out.println(qa.dequeue());
////        System.out.println(qa.dequeue());
////        System.out.println(qa.dequeue());

        Circular_Queue qc = new Circular_Queue(5);
        qc.enqueue(45);
        qc.enqueue(78);
        qc.enqueue(99);
        qc.enqueue(101);
        qc.enqueue(456);


        System.out.println(qc.dequeue());
        System.out.println(qc.dequeue());
        System.out.println(qc.dequeue());
        System.out.println(qc.dequeue());
        qc.enqueue(256);
        System.out.println(qc.dequeue());
        System.out.println(qc.dequeue());




    }
}