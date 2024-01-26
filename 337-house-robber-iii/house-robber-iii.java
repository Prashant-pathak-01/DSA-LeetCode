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
    public int rob(TreeNode root) {
        return robber(root,new HashMap<>());
    }
    public int robber(TreeNode root, Map<TreeNode,Integer> map) {
        if(root==null) return 0;
        if(map.containsKey(root)) return map.get(root);
        int val = 0;
        if(root.left!=null){
            val+=robber(root.left.left,map)+robber(root.left.right,map);
        }
        if(root.right!=null){
            val+=robber(root.right.left,map)+robber(root.right.right,map);
        }

        val = Math.max(val+root.val,robber(root.left,map)+robber(root.right,map));
        map.put(root,val);
        return val;
    }
}