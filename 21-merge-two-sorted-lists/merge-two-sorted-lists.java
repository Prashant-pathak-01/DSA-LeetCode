class Solution {
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode res = new ListNode();
        ListNode tem = res;
        while(l1!=null && l2!=null ){
            if(l1.val>l2.val){
                res.next = new ListNode(l2.val);
                l2 = l2.next;
            }else {
                res.next = new ListNode(l1.val);
                l1 = l1.next;    
            }
            res = res.next;
        }
        if(l1!=null) res.next = l1;
        if(l2!=null) res.next = l2;
        return tem.next;
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        return merge(list1,list2);
    }
}