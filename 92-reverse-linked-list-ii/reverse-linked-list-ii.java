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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> hello = new ArrayList<>();
        ListNode temp = head;
        int i = 1;
        while(temp!=null) {
            if(i>=left && i<=right) {
                hello.add(temp.val);
            }
            i++;
            temp = temp.next;
        }
        int count = hello.size()-1;
        temp = head;
        i = 1;
        while(head!=null) {
            if(i>=left && i<=right) {
                head.val = hello.get(count);
                count--;
            }
            i++;
            head = head.next;

        }
        return temp;
    }
}