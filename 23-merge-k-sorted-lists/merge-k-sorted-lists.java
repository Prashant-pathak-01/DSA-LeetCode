class Solution {
    public ListNode merge(ListNode l1, ListNode l2){
        ListNode res  = new ListNode();
        ListNode temp = res;
        while(l1!=null && l2!=null){
            if(l1.val>l2.val){
                res.next = l2;
                l2 = l2.next;
            }else{
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;
        }
        if(l1!=null) res.next = l1;
        if(l2!=null) res.next = l2;
        return temp.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        ListNode res = lists[0];
        for(int i=1; i<lists.length; i++){
            res = merge(res,lists[i]);
        }
        return res;
    }
}