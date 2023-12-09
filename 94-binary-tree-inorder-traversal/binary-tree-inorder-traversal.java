class Solution {

    void traversal(List<Integer> hello, TreeNode root) {
        if(root==null) {
            return;
        }
        
        traversal(hello,root.left);
        hello.add(root.val);
        traversal(hello,root.right);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> hello = new ArrayList<>();
        traversal(hello,root);
        return hello;
    }
}