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
    Map<Integer,Integer> map;
    public int calculateSum(TreeNode root){
        if(root==null) return 0;
        int left = calculateSum(root.left);
        int right = calculateSum(root.right);
        int sum = left+right+root.val;
        map.put(sum,map.getOrDefault(sum,0)+1);
        return sum;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        map = new HashMap<>();
        calculateSum(root);
        int max = 0;
        int count = 0;
        for(int key:map.keySet()){
            if(map.get(key)>map.getOrDefault(max,0)){
                count =1;
                max = key;
            }else if(map.get(key)==map.getOrDefault(max,0)) count++;
        }
        int res[] = new int[count];
        int index = 0;
        for(int key:map.keySet()){
            if(map.get(key)==map.get(max)) res[index++] = key;
        }
        return res;
    }
}