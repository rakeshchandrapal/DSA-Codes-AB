package LinkedListClass.Basics;

public class Bubble {


    public static void printL(node2 head) {
        node2 cur = head;
        while (cur != null) {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println(" NULL ");
    }


    static node2 SortLL(node2 head) {
        node2 cur = head;
        node2 cur2;
        node2 prev = null;
        node2 newHead = null;
        while (cur.next != null) {
            cur2 = head;
            prev = null;

            while (cur2.next != null) {


                if (cur2.data > cur2.next.data) {
//                    int temp = cur2.data;
//                    cur2.data = cur2.next.data;
//                    cur2.next.data = temp;


                    if(prev == null)
                    {
                        node2 t = cur2;
                        newHead = cur2.next;
                        cur2 = cur2.next.next;

                    }
                    else {
                        node2 temp = cur.next.next;
                        prev.next = cur2.next.next;
                        cur2.next = temp;

                    }

                }
                cur2 = cur2.next;
                prev = prev.next;
            }
            cur = cur.next;
        }

        return head;
    }

    public static void main(String[] args) {
        node2 head = new node2(100);
        node2 n1 = new node2(50);
        node2 n2 = new node2(30);
        node2 n3 = new node2(20);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        printL(head);
        node2 newHead = SortLL(head);
        printL(newHead);

    }

    public static  class node2 {
        public int data;
        public node2 next;

        public node2(int data) {
            this.data = data;
        }
    }
}