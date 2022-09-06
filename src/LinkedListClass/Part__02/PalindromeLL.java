package LinkedListClass.Part__02;



public class PalindromeLL {


    static void printLNode3(node head)
    {
        node cur = head ;

        while (cur != null) {
            System.out.print(cur.data + " --> ");
            cur = cur.next;
        }
        System.out.println(" NULL ");
    }

    static node mid (node head)
    {
        node slow = head;
        node fast = head;

        while(fast!= null && fast.next != null)
        {
            slow  = slow.next;
            fast = fast.next.next;


        }
        return slow;
    }

    static  boolean isPalindrome (node head)
    {
        if(head == null || head.next == null) return true;

        node middle = mid(head);
        node pre = revesedLLL(middle);

        node left = head, right = pre;

        while(left != null && right != null)
        {
            if(left.data == right.data)
            {
                left = left.next;
                right = right .next;
            }
            else {
                return false;
            }
        }
        return true;
    }

    static node revesedLLL(node head)
    {
      node cur = head,prev = null;

        while (cur != null)
        {
            node temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }
        return prev;
    }

    public static void main(String[] args) {

        node head = new node(1);
        head.next = new node(2);
//        head.next.next = new node3(2);
//        head.next.next.next = new node3(1);
//        head.next.next.next.next = new node3(5);
        printLNode3(head);
//        System.out.println(mid(head).data);

        System.out.println(isPalindrome(head));
    }



}
     class node {
        int data ;

        node next;

        node(int data) {
            this.data = data ;
        }
    }