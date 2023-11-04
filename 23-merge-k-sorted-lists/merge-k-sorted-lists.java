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
    public ListNode sort(ListNode l1, ListNode l2){
        if(l1==null) return l2;
        if(l2==null) return l1;
        ListNode res = new ListNode(0);
        ListNode temp = res;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                res.next = new ListNode(l1.val);
                l1 = l1.next;
            } else{
                res.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            res = res.next;

        }
        while(l1!=null){
            res.next = new ListNode(l1.val);
            l1 = l1.next;
            res = res.next;
        }
        while(l2!=null){
            res.next = new ListNode(l2.val);
            l2 = l2.next;
            res = res.next;
        }

        return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ListNode res = lists[0];
        for(int i=1; i<lists.length; i++){
            res = sort(res,lists[i]);
        }
        return res;
    }

}