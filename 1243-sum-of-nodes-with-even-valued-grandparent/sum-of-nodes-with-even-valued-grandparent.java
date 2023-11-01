/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
        int sum = 0;
        if(root == null || (root.left==null && root.right==null)) return sum;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i<size; i++){
                TreeNode temp = q.poll();
                boolean flag = false;
                if(temp.val%2==0) flag = true;
                if(temp.left!=null){
                    if(flag && temp.left.left!=null) sum+=temp.left.left.val;
                    if(flag && temp.left.right!=null) sum+=temp.left.right.val;
                    q.add(temp.left);
                }
                if(temp.right!=null){
                    if(flag && temp.right.left!=null) sum+=temp.right.left.val;
                    if(flag && temp.right.right!=null) sum+=temp.right.right.val;
                    q.add(temp.right);
                }
                
            }
        }
        return sum;
    }
}