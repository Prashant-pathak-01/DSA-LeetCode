
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode res = new ListNode(0);
        ListNode ans = res;
        int x = 0;
        int y = 0;
        int i = 0;
        while(list1!=null || list2!=null){
            if(list1==null || (list2!=null && list1.val>list2.val)){
                res.next = new ListNode(list2.val);
                list2 = list2.next;
            }else {
                res.next = new ListNode(list1.val);
                list1 = list1.next;
                }
            res  = res.next;
        }
        return ans.next;
    }
}