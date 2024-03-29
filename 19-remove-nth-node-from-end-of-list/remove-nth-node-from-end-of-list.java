class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size= 0 ;
        ListNode temp =head;
        while(temp!=null){
            temp  =temp.next;
            size++;
        }
        if(size==1) return null;
        if(size-n==0) {
            return head.next;
        }
        temp = head;
        for(int i=1; i<size-n; i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}