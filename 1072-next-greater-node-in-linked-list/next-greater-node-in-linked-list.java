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
    public int getSize(ListNode head){
        int count = 0;
        while(head!=null){
            head = head.next;
            count++;
        }
        return count;
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = getSize(head);
        int res[] = new int[size];
        int i=0;
        while(head.next!=null){
            ListNode temp = head.next;
            while(temp!=null ) if(head.val<temp.val) break; else temp = temp.next;
            if(temp!=null) res[i] = temp.val;
            head = head.next;
            i++;
        }
        return res;
    }
}