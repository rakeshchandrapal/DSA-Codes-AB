package Daily_leet_code.contest;

public class L19_RemoveNthNode {
    public  static class  ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 public static ListNode printll(ListNode head)
 {
     ListNode cur  = head;
     while(cur != null)
     {
         System.out.print(cur.val+"--> ");
         cur = cur.next;
     }
     System.out.println();
     return head;
 }


    public static void main(String[] args) {
        ListNode head = new ListNode(4);
        head.next = new ListNode(1);
        head.next.next = new ListNode(46);
        printll(head);
        head = removeNthFromEnd(head,2);
        printll(head);
    }
    public  static ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode cur = head;

        while (cur != null)
        {
            size++;
            cur = cur.next;
        }

        if(size <= n ) return head;
        int index = 0;
        size = size - n - 1;
        cur = head;
        while(index < size)
        {
            cur = cur.next;
            index++;
        }
        if(cur == null || cur.next == null) return head;
        cur.next = cur.next.next;

        return head;
    }

}