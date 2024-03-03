/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null) return head;
        if(head.next==null && n==1) return null;
        ListNode rev = reverse(head);
        if(n==1) return reverse(rev.next);
        ListNode res = rev;
        while(n>=1){
            if(n==2){
                if(rev.next.next!=null) rev.next = rev.next.next;
                else {
                    rev.next  = null;
                    break;
                }
            }
            rev = rev.next;
            n--;
        }
        return reverse(res);

    }
}