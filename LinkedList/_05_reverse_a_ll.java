public class _05_reverse_a_ll {
 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
class Solution {
    public ListNode reverseList(ListNode head) {
      
        return reverse(head, null);
    }
    // using recursion.........................................................
    public ListNode reverse(ListNode curr, ListNode prev) {
        if (curr==null) {
            return prev;
        }
        ListNode temp=reverse(curr.next, curr);
        curr.next=prev;
        return temp;
    }

    // using loop....................................................................
     public ListNode reverseList_loop(ListNode head) {
      ListNode prev=null;
      ListNode curr=head;
      while (curr!=null) {
        ListNode ahead=curr.next;
        curr.next=prev;
        prev=curr;
        curr=ahead;
      }

       return prev;
    }
}
}
