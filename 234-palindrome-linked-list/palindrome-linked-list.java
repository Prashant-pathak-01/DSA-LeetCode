class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode hello = head;
        ArrayList<Integer> list = new ArrayList<>();
        while(hello!=null) {
            list.add(hello.val);
            hello = hello.next;
        }
        int i =0;
        int size = list.size()-1;
        while(head!=null) {
            if(head.val!=list.get(size-i)){
                return false;            
            }
            head = head.next;
            i++;

        }
        return true;
    }
}