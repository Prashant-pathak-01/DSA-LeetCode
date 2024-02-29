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
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList();
        q.add(root);
        int k = 0;
        while(!q.isEmpty()){
            int temp = 0;
            int s = q.size();
            int count = 0;
            for(int i=0; i<s; i++){
                if(q.peek().left!=null){
                    q.add(q.peek().left);
                }
                if(q.peek().right!=null){
                    q.add(q.peek().right);
                }
                
                if(count==0){
                    count++;
                    temp = q.poll().val;
                    if(k%2==0 && temp%2==0) return false;
                    if(k%2==1 && temp%2==1) return false; 
                } else{
                    int temp2 = q.poll().val;
                    if(k%2==0){
                        if(temp%2==0 || temp2%2==0 ||temp>=temp2 ) return false;
                    } else{
                        if(temp%2==1 || temp2%2==1 || temp<=temp2 ) return false;
                    }
                    temp = temp2;
                }
            }
            count=0;
            k++;
        }
        return true;
    }
}