package Daily_leet_code.Medium;

import java.util.List;

public class AddTWONodes {

    public static  class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       ListNode prev = new ListNode(0);
       ListNode head = prev;
       int carry = 0;

       while(l1 != null || l2 != null || carry != 0)
       {
           ListNode cur = new ListNode(0);
           int sum = ((l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry );
           carry = sum / 10;
           cur.val = sum % 10;
           prev.next = cur;
           prev = cur;

           l1 = (l1 == null ? l1 : l1.next);
           l2 = (l2 == null ? l2 : l2.next);
       }
        return head.next;
    }
}