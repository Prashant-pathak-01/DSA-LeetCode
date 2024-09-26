class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b)->a.val-b.val);
        for(ListNode i:lists) if(i!=null) pq.add(i);
        ListNode res = new ListNode(0);
        ListNode pointer = res;
        while(!pq.isEmpty()){
            ListNode temp = pq.poll();
            res.next = new ListNode(temp.val);
            if(temp.next!=null) pq.add(temp.next);
            res = res.next;
        }
        return pointer.next;
    }
}