class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head,dummy = new ListNode(0);
        dummy.next = head;

        while(n!=0){
            fast = fast.next;
            n--;
        }

        ListNode prev = dummy,slow = head;
        
        while(fast!=null) {
            fast = fast.next;
            prev = slow;
            slow = slow.next;
        }
        
        prev.next = slow.next;
        
        return dummy.next;
    }
}