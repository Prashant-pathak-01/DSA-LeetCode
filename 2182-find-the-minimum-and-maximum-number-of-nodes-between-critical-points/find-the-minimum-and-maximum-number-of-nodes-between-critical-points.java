class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head==null || head.next==null) return new int[]{-1,-1};
        int flag  = 0;
        int res[] = {Integer.MAX_VALUE,-1};
        int firstPeak = Integer.MAX_VALUE;
        int lastPeak = 0;
        int count = 1;
        int prev = head.val;
        while(head.next!=null){
            if((head.val>prev && head.val>head.next.val ) || (head.val<prev && head.val<head.next.val)){
                flag++;
                if(flag!=1) res[0] = Math.min(res[0],count-lastPeak);
                firstPeak = Math.min(firstPeak,count);
                lastPeak = count;
                res[1] = count-firstPeak;
            }
            count++;
            prev = head.val;
            head = head.next;
        }
        if(flag<2) return new int[]{-1,-1};
        return res;        
    }
}