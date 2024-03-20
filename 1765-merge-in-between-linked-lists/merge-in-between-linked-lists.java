class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode res = new ListNode();
        ListNode ret = res;
        int counter = 0;
        while(list1!=null){
            if(counter==a){
                while(list1!=null && counter!=b){
                    list1 = list1.next;
                    counter++;
                }
                list1 = list1.next;
                while(list2!=null){
                    res.next = new ListNode(list2.val);
                    res = res.next;
                    list2 = list2.next;
                }
                res.next = list1;
                return ret.next;
            }
            counter++;
            res.next = new ListNode(list1.val);
            res = res.next;
            list1 = list1.next;
        }
        return ret.next;
    }
}