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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode res = new ListNode(0);
        ListNode ans = res;
        while(head.next!=null){
            int temp= 1;
            int a = head.val;
            int b = head.next.val;
            for(int i=1;i<=Math.min(a,b); i++){
                if(a%i==0 && b%i==0) temp= i;
            }
            res.next = new ListNode(a);
            res = res.next;
            res.next = new ListNode(temp);
            res = res.next;
            head= head.next;
        }
        res.next = new ListNode(head.val);
        return ans.next;
    }
}