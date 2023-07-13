class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //for empty list-->[]
        if (head==null) return null;
        
        ListNode slow=head,fast=head;
        for (int i=0;i<n;i++)
        fast=fast.next;
        
        //for cases where (n=list size) fast becomes null
        if (fast==null)return head.next;
        //for other cases 
        for (ListNode current=fast;current!=null&&current.next!=null;current=current.next){
            slow=slow.next;
        }
        ListNode temp=slow.next.next;
        slow.next=temp;
        return head;//return start pointer
    }
}