class Solution {
    public int getLen(ListNode head){
        if(head==null) return 0;
        return 1+getLen(head.next);
    }
    public TreeNode getNode(ListNode head, int i){
        while(i-->0) head = head.next;
        return new TreeNode(head.val);
    }
    public TreeNode generate(ListNode head, int i, int j){
        if(i>j) return null;
        if(i==j) return getNode(head,i);
        int mid = (i+j)/2;
        TreeNode root = getNode(head,mid);
        root.left = generate(head,i,mid-1);
        root.right = generate(head,mid+1,j);
        return root;
    }
    public TreeNode sortedListToBST(ListNode head) {
        int len = getLen(head);
        return generate(head,0,len-1);
    }
}