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
    ListNode head;
    int size;
    public Solution(ListNode head) {
        this.head = head;
        int count =0;
        while(head!=null){
            count++;
            head = head.next;
        }
        size = count;
    }
    
    public int getRandom() {
        int temp =(int)Math.ceil(Math.random()*size);
        ListNode head = this.head;
        while(temp-->1){
            head = head.next;
        }
        return head.val;
    }
}