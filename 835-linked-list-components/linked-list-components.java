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
    public int numComponents(ListNode head, int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i:nums) set.add(i);
        int res= 0;
        boolean flag = false;
        while(head!=null){
            if(set.contains(head.val)){
                if(!flag) res++;
                flag = true;
            }else{
                flag = false;
            }
            head = head.next;
        }
        return res;
    }
}