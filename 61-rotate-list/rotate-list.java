
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0 ) return head;
        int count  =0;
        ListNode dummy = head;
        while(head!=null){
            head = head.next;
            count++;
        }
        k%=count;
        if(k==0) return dummy;
        count-=k;
        head = dummy;
        ListNode first = dummy;
        
        while(count>1){
            head = head.next;
            count--;
        }
        ListNode second = head.next;
        head.next = null;
        head = second;
        while(second.next!=null){
            second = second.next;
        }
        second.next = first;
        return head;
    }
}