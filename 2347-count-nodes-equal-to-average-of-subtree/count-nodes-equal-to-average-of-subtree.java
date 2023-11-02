
class Solution {
    int count  = 0;

    public int sumAndNodes(TreeNode root){
        if(root==null) return 0;
        count++;      
        return root.val+sumAndNodes(root.left)+sumAndNodes(root.right);
        
    }
    public int calculate(TreeNode root){
        if(root==null) return 0;
        count = 0;
        int sum = sumAndNodes(root);
        int size = count;
        int temp = sum/size;
        int flag = 0;
        System.out.println(temp);
        if(temp==root.val) flag = 1;
        return flag+calculate(root.left)+calculate(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        return calculate(root); 
    }
}