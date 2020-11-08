class Solution {
    
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        ListNode Dummy = new ListNode(0);
        ListNode ptr1=l1,ptr2=l2,head=Dummy;

        while(ptr1!=null && ptr2!=null) {

            if(ptr1.val<=ptr2.val){
                head.next = ptr1;
                head = head.next;
                ptr1 = ptr1.next;
            }
            else{
                head.next = ptr2;
                head = head.next;
                ptr2 = ptr2.next;
            }
        }
        
        if(ptr1 == null) 
            head.next = ptr2;
        else 
            head.next = ptr1;
        
        return Dummy.next;
    }
}