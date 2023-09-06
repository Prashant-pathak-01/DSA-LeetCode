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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode dummy = head;
        int count = 0;
        while(head!=null) {
            count++;
            head=head.next;
        }
        ListNode[] res = new ListNode[k];
        head = dummy;
        int rem = count%k;
        int size = count/k;
        count = 0;
        int kk = 0;
        for(int i=0; i<k; i++){
            ListNode temp = new ListNode();
            ListNode sub = temp;
            for(int j=0; j<size+(rem>0?1:0);j++){
                temp.next = new ListNode(head.val);
                temp = temp.next;
                if(head!=null) head = head.next;
            }
            rem--;
            res[i] = sub.next;
        }
        
        return res;
    }
}