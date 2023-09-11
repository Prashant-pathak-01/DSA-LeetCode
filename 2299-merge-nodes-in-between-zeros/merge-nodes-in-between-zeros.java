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
    public ListNode mergeNodes(ListNode head) {
        ListNode res = new ListNode();
        ListNode temp = res;
        head = head.next;
        int temppp = 0;
        while(head!=null){
            if(head.val==0) {
                res.next = new ListNode(temppp);
                res = res.next;
                temppp = 0;
            }
            temppp+=head.val;
            head = head.next;
        }
        return temp.next;
    }
}