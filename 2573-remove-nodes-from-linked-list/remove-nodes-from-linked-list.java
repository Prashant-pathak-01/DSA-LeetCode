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
        ListNode next= null;
        while(head!=null){
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
    public ListNode removeNodes(ListNode head) {
        if(head==null) return null;
        head = reverse(head);
        ListNode res = new ListNode(0);
        ListNode temp = res;
        int prev = head.val;
        while(head!=null){
            if(prev<=head.val){
                res.next = new ListNode(head.val);
                res = res.next;
                prev=  head.val;
            }
            head = head.next;
        }
        return reverse(temp.next);
    }
}