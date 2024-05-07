class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode rev = reverse(head);
        ListNode res = new ListNode();
        ListNode temp = res;
        int carry = 0;
        while(carry!=0 || rev!=null){
            res.next = new ListNode(carry);
            res = res.next;
            if(rev!=null){
                res.val =res.val + rev.val*2;
                rev = rev.next;

            }
            carry = res.val/10;
            res.val%=10;
        }
        return reverse(temp.next);
    }
}