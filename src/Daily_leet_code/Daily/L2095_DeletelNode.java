package Daily_leet_code.Daily;

public class L2095_DeletelNode {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        deleteMiddle(head);
        printLL(head);
    }
    public static  ListNode deleteMiddle(ListNode head) {

        if(head == null) return null;
        if(head.next == null) return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        prev.next = slow.next;

        return head;

    }

    public static void printLL(ListNode head)
    {
        ListNode cur = head;
        while(cur != null)
        {
            System.out.print(cur.val + " --> ");
            cur = cur.next;
        }
        System.out.print(" NULL");
    }
    public static  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}