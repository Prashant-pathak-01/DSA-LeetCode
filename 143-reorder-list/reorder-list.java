
class Solution {
    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode next = null;
        while(head!=null){
            next= head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode res = slow;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            res = res.next;
        }
        slow = slow.next;
        res.next =null;
        slow  = reverse(slow);
        while(head!=null && slow!=null){
            ListNode temp1 = head.next;
            head.next = slow;
            ListNode temp2 = slow.next;
            slow.next = temp1;
            slow = temp2;
            head =temp1;

        }
        return;
    }
}