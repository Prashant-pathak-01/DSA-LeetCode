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
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode ans = res;
        int carry  = 0;
        while(l1!=null || l2!=null || carry!=0){
            int a =l1==null?0:l1.val;
            int b =l2==null?0:l2.val;
            int sum = a+b+carry;
            carry = sum/10;
            sum%=10;
            res.next = new ListNode(sum);
            res = res.next;
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;

        }
        return ans.next;
    }
}