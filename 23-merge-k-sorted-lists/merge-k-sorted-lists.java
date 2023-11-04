class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = new ListNode(0);
        ListNode track = res;
        List<Integer> temp = new ArrayList<>();
        for(int i=0; i<lists.length; i++){
            while(lists[i]!=null){
                temp.add(lists[i].val);
                lists[i] = lists[i].next;
            }
        }
        Collections.sort(temp);
        for(int i=0; i<temp.size(); i++){
            res.next = new ListNode(temp.get(i));
            res = res.next;
        }
        return track.next;
        
    }
}