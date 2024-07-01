class Solution {
    private boolean check(ListNode head, TreeNode root){
        if(head==null) return true;
        if(root==null) return false;
        if(head.val!=root.val) return false;
        return check(head.next,root.left) || check(head.next,root.right);
    }
    private boolean solve(ListNode head,TreeNode root){
        if(root==null) return head==null;
        boolean res = check(head,root);
        if(res) return res;
        res = res|| solve(head,root.left);
        res = res|| solve(head,root.right);
        return res;
    }
    public boolean isSubPath(ListNode head, TreeNode root) {
        return solve(head,root);
    }
}